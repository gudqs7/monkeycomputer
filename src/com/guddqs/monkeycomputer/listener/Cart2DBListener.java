package com.guddqs.monkeycomputer.listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.entity.Cart;

/**
 * Application Lifecycle Listener implementation class Cart2DBListener
 *
 */
@WebListener
public class Cart2DBListener implements HttpSessionListener {

	public Cart2DBListener() {
	}

	public void sessionCreated(HttpSessionEvent arg0) {
	}

	@SuppressWarnings("unchecked")
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		ServletContext servletContext = session.getServletContext();
		String result = "false";
		int num = 0;

		ApplicationContext application = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		CartBiz cartBiz=application.getBean(CartBiz.class);
		Map<String, Cart> mycart = (Map<String, Cart>) session.getAttribute("mycart");
		if (mycart != null) {
			for (Cart cart : mycart.values()) {
				if (cart.getId() == null) {
					int iret = cartBiz.insert(cart);
					if (iret > 0) {
						num += 1;
					}
				} else {
					if (cartBiz == null) {
						System.err.println("CartBiz is NUll");
					}
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
		System.out.println(s);
	}

}
