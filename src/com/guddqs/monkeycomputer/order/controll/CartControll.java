package com.guddqs.monkeycomputer.order.controll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.entity.Cart;
import com.guddqs.monkeycomputer.product.biz.ProductBiz;
import com.guddqs.monkeycomputer.product.entity.Product;

@Controller
@SuppressWarnings("unchecked")
public class CartControll {

	@Autowired
	private CartBiz cartBiz;

	@Autowired
	private ProductBiz productBiz;

	@RequestMapping("/addtocart")
	public void doAdd2Cart(Cart cart, HttpSession session, HttpServletResponse response) throws Exception {

		String result = "false";
		int num = 0;
		if (cart != null) {

			Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
			if (mycart == null) {
				mycart = new HashMap<String, Cart>();

			}
			if (mycart.containsKey(cart.getProductid() + cart.getProductpackageid().toString())) {
				Cart oldcart = mycart.get(cart.getProductid() + cart.getProductpackageid().toString());
				oldcart.setNum(oldcart.getNum() + cart.getNum());

				System.out.println(oldcart.getNum());
				mycart.put(oldcart.getProductid() + oldcart.getProductpackageid().toString(), oldcart);
			} else
				mycart.put(cart.getProductid() + cart.getProductpackageid().toString(), cart);

			session.removeAttribute("mycart");
			session.setAttribute("mycart", mycart);

			num = mycart.size();
			result = "true";
		}
		String s = "{\"flag\":" + result + ",\"num\":" + num + "}";
		response.getWriter().print(s);
		System.out.println(s);
	}

	@RequestMapping("/cart2db")
	public void doCart2DB(HttpSession session, HttpServletResponse response) throws Exception {

		String result = "false";
		int num = 0;

		Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
		if (mycart != null) {
			for (Cart cart : mycart.values()) {
				if (cart.getId() == null) {
					int iret = cartBiz.insert(cart);
					if (iret > 0) {
						num += 1;
					}
				} else {
					int iret = cartBiz.updateByPrimaryKeySelective(cart);
					if (iret > 0) {
						num += 1;
					}
				}
			}
			if (num == mycart.size()) {

				result = "true";
			}
		}
		String s = "{\"flag\":" + result + ",\"num\":" + num + "}";
		response.getWriter().print(s);
		System.out.println(s);
	}

	@RequestMapping("/delcartbykey")
	public void doDelCart(String cartkey, HttpSession session, HttpServletResponse response) throws Exception {

		String result = "false";
		int num = 0;
		int iret = 0;
		Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
		session.removeAttribute("mycart");
		if (mycart != null) {

			Cart delcart = mycart.get(cartkey);
			if (delcart != null) {
				if (delcart.getId() != null) {

					iret = cartBiz.deleteByPrimaryKey(delcart.getId());

				}
				mycart.remove(cartkey);
				result = "true";
				if (iret <= 0) {
					result = "false";
				}
			}

		}
		num = mycart.size();
		session.setAttribute("mycart", mycart);
		String s = "{\"flag\":" + result + ",\"num\":" + num + "}";
		response.getWriter().print(s);
		System.out.println(s);

	}

	@RequestMapping("/updatacartnum")
	public void doUpdateCart(String key, Integer cartnum, HttpSession session, HttpServletResponse response)
			throws Exception {
		String result = "false";
		int num = 0;
		Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
		if (mycart != null) {

			if (key != null) {
				Cart newcart = mycart.get(key);
				if (newcart != null) {
					newcart.setNum(cartnum);
					mycart.put(key, newcart);
					result = "true";
				}
			}
			session.removeAttribute("mycart");
			session.setAttribute("mycart", mycart);

		}
		num = mycart.size();
		String s = "{\"flag\":" + result + ",\"num\":" + num + "}";
		response.getWriter().print(s);
		System.out.println(s);

	}

	@RequestMapping("/updatacartpackage")
	public void updatacartpackage(String key, Integer packageid, HttpSession session, HttpServletResponse response)
			throws Exception {
		String result = "false";
		String newkey = "";
		Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
		if (mycart != null) {

			if (key != null) {
				Cart newcart = mycart.get(key);
				mycart.remove(key);
				if (newcart.getId() != null)
					cartBiz.deleteByPrimaryKey(newcart.getId());
				if (newcart != null) {
					newcart.setProductpackageid(packageid);
					newkey = newcart.getProductid() + newcart.getProductpackageid().toString();
					if (mycart.containsKey(newkey)) {
						newcart = mycart.get(newkey);
						newcart.setNum(newcart.getNum() + 1);
					}
					mycart.put(newkey, newcart);
					result = "true";
				}
			}
			session.removeAttribute("mycart");
			session.setAttribute("mycart", mycart);

		}
		String s = "{\"flag\":" + result + ",\"key\":\"" + newkey + "\"}";
		response.getWriter().print(s);
		System.out.println(s);

	}

	@RequestMapping("/viewcart")
	public ModelAndView doViewCartList() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		List<Product> plist = productBiz.selectByExample(null);
		if (plist != null) {

			mv.addObject("plist", plist);
			mv.setViewName("product/cart");
		}

		return mv;
	}

}
