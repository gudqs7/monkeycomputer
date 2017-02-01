package com.guddqs.monkeycomputer.order.controll;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.biz.OrderBiz;
import com.guddqs.monkeycomputer.order.biz.OrderDetailBiz;
import com.guddqs.monkeycomputer.order.entity.Cart;
import com.guddqs.monkeycomputer.order.entity.Orders;
import com.guddqs.monkeycomputer.order.entity.OrdersExample;
import com.guddqs.monkeycomputer.order.entity.Ordersdetail;
import com.guddqs.monkeycomputer.product.biz.ProductBiz;
import com.guddqs.monkeycomputer.product.entity.Product;
import com.guddqs.monkeycomputer.user.entity.Login;

@Controller
public class OrderControll {

	@Autowired
	private OrderBiz orderbiz;

	@Autowired
	private CartBiz cartbiz;

	@Autowired
	private OrderDetailBiz detailbiz;

	@Autowired
	private ProductBiz pbiz;

	@SuppressWarnings("unchecked")
	@Transactional
	@RequestMapping("/buycart")
	public ModelAndView doBuyCart(String[] keys, Double totalprice, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");

		if (keys != null) {
			Orders order = new Orders();
			order.setCreatetime(new Date());
			order.setOrdernum(UUID.randomUUID().toString().substring(0,18));
			order.setUserid(loginuser.getLoginid());
			order.setState(new Short("2"));// 不做付款接口,假设点击即完成付款,所以是未发货状态
			order.setTotalprice(totalprice);

			Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
			int iret = orderbiz.insertSelective(order);
			if (iret > 0 && order.getId() != null) {

				int sum = 0;
				for (String key : keys) {
					if (key != null) {

						Cart cart = mycart.get(key);
						if (cart != null) {

							Ordersdetail detail = new Ordersdetail(order.getId(), cart.getProductid(), cart.getNum(),
									cart.getProductpackageid());
							int ret = detailbiz.insert(detail);
							if (ret > 0) {
								sum += 1;
								mycart.remove(key);
								if (cart.getId() != null)
									cartbiz.deleteByPrimaryKey(cart.getId());
							}

						}
					}

				}
				session.setAttribute("mycart", mycart);
				if (sum == keys.length) {
					mv.setViewName("redirect:listorder.action");
				}

			}

		}

		return mv;
	}

	@Transactional
	@RequestMapping("/buyone")
	public ModelAndView doBuy(Ordersdetail ordersdetail, Double totalprice, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");
		if (ordersdetail != null && totalprice != null) {

			Orders order = new Orders();
			order.setCreatetime(new Date());
			order.setOrdernum(UUID.randomUUID().toString().substring(0, 18));
			order.setUserid(loginuser.getLoginid());
			order.setState(new Short("2"));// 不做付款接口,假设点击即完成付款,所以是未发货状态
			order.setTotalprice(totalprice);

			int iret = orderbiz.insertSelective(order);
			if (iret > 0 && order.getId() != null) {

				ordersdetail.setOrderid(order.getId());
				int ret = detailbiz.insert(ordersdetail);
				if (ret > 0) {
					mv.setViewName("redirect:listorder.action");
				}
			} else {
				mv.addObject("message", "订单插入异常!");
			}
		} else {
			mv.addObject("message", "数据不全!");
		}

		return mv;
	}

	@RequestMapping("/listorder")
	public ModelAndView doListorder(HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");

		OrdersExample example = new OrdersExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		example.setOrderByClause("createtime desc");
		List<Orders> orders = orderbiz.selectByExample(example);

		List<Ordersdetail> details = detailbiz.selectByExample(null);

		List<Product> plist = pbiz.selectByExample(null);
		if (orders != null && details != null) {
			mv.addObject("orders", orders);
			mv.addObject("details", details);
			mv.addObject("plist", plist);
			mv.setViewName("order/listorder");
		}

		return mv;
	}
}
