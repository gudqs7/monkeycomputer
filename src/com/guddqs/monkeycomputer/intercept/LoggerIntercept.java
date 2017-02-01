package com.guddqs.monkeycomputer.intercept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.entity.Cart;
import com.guddqs.monkeycomputer.order.entity.CartExample;
import com.guddqs.monkeycomputer.product.biz.ProductTypeBiz;
import com.guddqs.monkeycomputer.product.entity.Productttype;
import com.guddqs.monkeycomputer.user.entity.Login;

@Repository
@SuppressWarnings("unchecked")
public class LoggerIntercept implements HandlerInterceptor {

	private final Logger logger = Logger.getLogger(LoggerIntercept.class);

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object target, Exception ex)
			throws Exception {

		if (ex != null) {
			logger.error(ex.getMessage());
		}

	}

	@Autowired
	private ProductTypeBiz typeBiz;

	@Autowired
	private CartBiz cartBiz;

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object target, ModelAndView mv)
			throws Exception {
		if (mv != null) {
			List<Productttype> typelist = typeBiz.selectByExample(null);
			if (typelist != null)
				mv.addObject("typelist", typelist);
		}

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object target) throws Exception {

		if (req.getRequestURI().indexOf("login") != -1 || req.getRequestURI().indexOf("index") != -1
				|| req.getRequestURI().indexOf("product") != -1
				|| req.getRequestURI().indexOf("register") != -1
				|| req.getRequestURI().indexOf("search") != -1
				|| req.getRequestURI().indexOf("reset") != -1
				|| req.getRequestURI().indexOf("jihuo") != -1) {
			return true;
		}
		Login loginuser = (Login) req.getSession().getAttribute("loginuser");
		if (loginuser != null) {
			Map<String, Cart> mycart = (Map<String, Cart>) req.getSession().getAttribute("mycart");
			if (mycart == null) {
				CartExample example = new CartExample();
				example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
				List<Cart> cart = cartBiz.selectByExample(example);
				mycart = new HashMap<>();
				for (Cart c : cart) {
					mycart.put(c.getProductid() + c.getProductpackageid().toString(), c);
				}
				if (mycart != null && mycart.size() > 0)
					req.getSession().setAttribute("mycart", mycart);
			}
			return true;
		} else {
			res.sendRedirect("jsp/login.jsp");
		}
		return false;
	}

}
