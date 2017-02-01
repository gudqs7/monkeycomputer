package com.guddqs.monkeycomputer.user.controll;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.order.biz.CartBiz;
import com.guddqs.monkeycomputer.order.entity.Cart;
import com.guddqs.monkeycomputer.user.biz.LoginBiz;
import com.guddqs.monkeycomputer.user.biz.UserInfoBiz;
import com.guddqs.monkeycomputer.user.biz.impl.MailSenderService;
import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.LoginExample;
import com.guddqs.monkeycomputer.user.entity.Userinfo;
import com.guddqs.monkeycomputer.user.entity.UserinfoExample;

@Controller
public class LoginControll {

	@Autowired
	private LoginBiz loginBizImpl;

	@Autowired
	private UserInfoBiz userInfoBizImpl;

	@Autowired
	private MailSenderService mailSenderService;

	public void setMailSenderService(MailSenderService mailSenderService) {
		this.mailSenderService = mailSenderService;
	}

	public void setLoginBizImpl(LoginBiz loginBizImpl) {
		this.loginBizImpl = loginBizImpl;
	}

	public void setUserInfoBizImpl(UserInfoBiz userInfoBizImpl) {
		this.userInfoBizImpl = userInfoBizImpl;
	}

	@RequestMapping("/login")
	public ModelAndView doLogin(Login login, HttpSession session) {

		LoginExample example = new LoginExample();
		example.createCriteria().andLoginnameEqualTo(login.getLoginname()).andLoginpwdEqualTo(login.getLoginpwd());
		List<Login> list = loginBizImpl.selectByExample(example);

		ModelAndView mv = new ModelAndView();
		if (list.size() == 1) {
			Login loginuser=list.get(0);
			if(loginuser.getState()==1){
				session.setAttribute("loginuser", loginuser);
				mv.setViewName("user/loginsuccess");
			}
			else{
				mv.setViewName("faild");
				mv.addObject("message", "你的账号未激活,请检查邮箱中的垃圾邮件,点击连接激活!");
				System.out.println("wiejihou");
			}
		} else
			mv.setViewName("redirect:jsp/login.jsp");
		return mv;

	}

	@RequestMapping("/register")
	public ModelAndView doRegister(Login login, Userinfo userinfo, HttpSession session, String repwd) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/registerfaild");
		if (login != null && login.getLoginpwd().equals(repwd)) {
			login.setState(0);
			login.setIsadmin(new Short("0"));
			loginBizImpl.insertSelective(login);

			if (login.getLoginid() != null) {
				userinfo.setUserid(login.getLoginid());
				userinfo.setRegisttime(new Date());
				int iret = userInfoBizImpl.insert(userinfo);
				if (iret > 0) {
					if (userinfo.getEmail() != null) {
						int randomNum = mailSenderService.sendMail(login.getLoginname(), userinfo.getEmail(), 1);
						session.getServletContext().setAttribute(login.getLoginname(), randomNum);
					}
					mv.setViewName("user/registersuccess");
				}
			} else {
				mv.addObject("message", "未知数据异常!");
			}
		} else {
			mv.addObject("message", "注册信息不能为空且2次密码需一致!");
		}
		return mv;

	}

	@RequestMapping("/jihuo")
	public ModelAndView doJihuo(String loginname, Integer num, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/jihuofaild");
		if (loginname != null && num != null) {
			Integer randomNum = (Integer) session.getServletContext().getAttribute(loginname);
			System.out.println(randomNum + " " + num);
			if (randomNum != null) {
				if (randomNum.equals(num)) {
					LoginExample example = new LoginExample();
					example.createCriteria().andLoginnameEqualTo(loginname);
					Login login = loginBizImpl.selectByExample(example).get(0);
					login.setState(1);
					int iret = loginBizImpl.updateByPrimaryKeySelective(login);
					if (iret > 0) {
						mv.setViewName("user/jihuosuccess");
					} else {
						mv.addObject("message", "未知数据异常!");
					}
				} else {
					mv.addObject("message", "验证信息不一致!");
				}
			} else {
				mv.addObject("message", "超出验证时间!");
			}
		}

		return mv;
	}

	@RequestMapping("/userinfo")
	public ModelAndView doViewUserInfo(HttpSession session, Integer update) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");
		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());

		Userinfo userinfo = userInfoBizImpl.selectByExample(example).get(0);

		if (userinfo != null) {
			mv.addObject("userinfo", userinfo);
			mv.addObject("update", update);
			mv.setViewName("user/userinfo");
		} else {
			mv.addObject("message", "数据获取失败!");
		}

		return mv;
	}

	@RequestMapping("/updateuser")
	public ModelAndView doUpdateUserInfo(Userinfo userinfo, Integer loginid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andUseridEqualTo(loginid);
		int iret = userInfoBizImpl.updateByExampleSelective(userinfo, example);
		if (iret > 0) {
			mv.setViewName("user/userinfo");
		} else {
			mv.addObject("message", "数据异常,修改信息失败!");
		}

		return mv;
	}

	@RequestMapping("/updatepass")
	public ModelAndView doUpdateLoginPwd(Login login, String newpass, String repass, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");
		if (loginuser.getLoginpwd().equals(login.getLoginpwd())) {
			if (newpass != null && newpass.equals(repass)) {
				login.setLoginpwd(newpass);
				int iret = loginBizImpl.updateByPrimaryKeySelective(login);
				if (iret > 0) {
					session.setAttribute("loginname", loginuser.getLoginname());
					mv.setViewName("redirect:jsp/login.jsp");
					session.removeAttribute("loginuser");
				}
			} else {
				mv.addObject("message", "输入密码不一致!");
			}
		} else {
			mv.addObject("message", "原密码错误!");
		}
		return mv;
	}

	@RequestMapping("/resetpass")
	public ModelAndView doReSetPass(Login login, String newpass, String repass, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		Login loginuser = (Login) session.getAttribute("loginuser");
		if (newpass != null && newpass.equals(repass)) {
			login.setLoginpwd(newpass);
			int iret = loginBizImpl.updateByPrimaryKeySelective(login);
			if (iret > 0) {
				session.setAttribute("loginname", loginuser.getLoginname());
				mv.setViewName("redirect:jsp/login.jsp");
				session.removeAttribute("loginuser");
			}
		} else {
			mv.addObject("message", "输入密码不一致!");
		}
		return mv;
	}

	@RequestMapping("/getmail")
	public ModelAndView doGetMail(HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		Login loginuser = (Login) session.getAttribute("loginuser");
		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		Userinfo userinfo = userInfoBizImpl.selectByExample(example).get(0);

		String mail = userinfo.getEmail();
		if(mail!=null){
			mail = mail.substring(0, 3) + "********" + mail.substring(mail.lastIndexOf('@') + 1);
			mv.addObject("mail", mail);
			mv.setViewName("user/sendpassmail");
		}

		return mv;
	}

	@RequestMapping("/sendpassmail")
	public ModelAndView sendpassmail(HttpSession session, String email) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		Login loginuser = (Login) session.getAttribute("loginuser");
		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		Userinfo userinfo = userInfoBizImpl.selectByExample(example).get(0);
		if (userinfo != null) {
			String mail = userinfo.getEmail();
			if (mail.equals(email)) {
				int randomNum = mailSenderService.sendMail(loginuser.getLoginname(), userinfo.getEmail(), 2);
				session.getServletContext().setAttribute(loginuser.getLoginname(), randomNum);
				mv.setViewName("user/sendmailsuccess");
			} else {
				mv.addObject("message", "邮箱不一致,请确认后重试!");
			}
		} else {
			mv.addObject("message", "数据请求异常!");
		}

		return mv;
	}

	@RequestMapping("/resetpassmailvalidate")
	public ModelAndView resetpassmailvalidate(HttpSession session, String loginname, Integer num) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		if (num == null || loginname == null) {
			mv.addObject("message", "UnKonwnException");
			return mv;
		}
		Login loginuser = (Login) session.getAttribute("loginuser");
		if(loginuser==null){
			return mv;
		}
		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		Userinfo userinfo = userInfoBizImpl.selectByExample(example).get(0);
		if (userinfo != null) {
			if (loginname.equals(loginuser.getLoginname())) {
				Integer randmonNum = (Integer) session.getServletContext().getAttribute(loginuser.getLoginname());
				if (num.equals(randmonNum)) {
					mv.setViewName("user/resetpass");
				} else {
					mv.addObject("message", "验证失败,邮件可能已过期!");
				}
			} else {
				mv.addObject("message", "邮件已过期,或账户未登录!");
			}
		}

		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView Logout(HttpSession session) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");
		
		Login loginuser = (Login) session.getAttribute("loginuser");
		if(loginuser!=null){
			session.removeAttribute("loginuser");
			mv.setViewName("redirect:index.jsp");
			//cart2db(session);
			session.invalidate();
		}
		
		return mv;
	}
	
	@Autowired
	private CartBiz cartBiz;
	
	@SuppressWarnings("unchecked")
	public void cart2db(HttpSession session){
		
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
		System.out.println(s);
	}

}
