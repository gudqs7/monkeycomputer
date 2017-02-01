package com.guddqs.monkeycomputer.user.controll;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.user.biz.AddressBiz;
import com.guddqs.monkeycomputer.user.biz.AddressDetailBiz;
import com.guddqs.monkeycomputer.user.entity.Addressdetail;
import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.Useraddress;
import com.guddqs.monkeycomputer.user.entity.UseraddressExample;

@Controller
public class AddressControll {

	@Autowired
	private AddressBiz addressBizImpl;

	@Autowired
	private AddressDetailBiz addressDetailBizImpl;

	@RequestMapping("/listaddress")
	public ModelAndView getAddressList(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		Login loginuser = (Login) session.getAttribute("loginuser");

		UseraddressExample example = new UseraddressExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		List<Useraddress> list = addressBizImpl.selectByExample(example);
		Useraddress useraddress = list.get(0);
		if (useraddress != null) {
			mv.addObject("address", useraddress);
			mv.setViewName("user/listaddress");
		}
		return mv;
	}

	@RequestMapping("/editaddress")
	public ModelAndView editaddress(HttpSession session, Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		Addressdetail detail = addressDetailBizImpl.selectByPrimaryKey(id);
		if (detail != null) {
			mv.addObject("detail", detail);
			mv.setViewName("user/editaddress");

		}

		return mv;
	}

	/**
	 * 修改收货地址详细
	 * 
	 * @param session
	 * @param addressdetail
	 * @return
	 */
	@RequestMapping("/updateaddressdetail")
	public ModelAndView updateAddressdetail(HttpSession session, Addressdetail addressdetail) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		int iret = addressDetailBizImpl.updateByPrimaryKeySelective(addressdetail);
		if (iret > 0) {

			mv.setViewName("redirect:listaddress.action");

		} else {
			mv.addObject("message", "修改详细地址失败,请重试!");
		}

		return mv;
	}

	/**
	 * 异步请求更改默认地址
	 * 
	 * @param addressid
	 * @param detailid
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/updateaddress")
	public void updateDefaultaddress(Integer addressid, Integer detailid, HttpServletResponse response)
			throws Exception {
		String result = "faild";
		if (addressid != null && detailid != null) {
			Useraddress record = new Useraddress();
			record.setDefaultid(detailid);
			record.setId(addressid);
			int iret = addressBizImpl.updateByPrimaryKeySelective(record);
			if (iret > 0) {
				result = "ok";
			}

		}
		// System.out.println("{\"flag\":\""+result+"\"}");
		response.getWriter().print("{\"flag\":\"" + result + "\"}");

	}

	@RequestMapping("/addaddress")
	public ModelAndView addaAdress(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		Login loginuser = (Login) session.getAttribute("loginuser");

		UseraddressExample example = new UseraddressExample();
		example.createCriteria().andUseridEqualTo(loginuser.getLoginid());
		List<Useraddress> list = addressBizImpl.selectByExample(example);
		Useraddress useraddress = null;
		if (list != null && list.size() > 0) {
			useraddress = list.get(0);
			mv.addObject("addressid", useraddress.getId());
			mv.setViewName("user/editaddress");
		} else {
			useraddress = new Useraddress();
			useraddress.setUserid(loginuser.getLoginid());
			useraddress.setDefaultid(0);
			addressBizImpl.insert(useraddress);
			if (useraddress.getId() != null) {
				mv.addObject("addressid", useraddress.getId());
				mv.setViewName("user/editaddress");
			} else {
				mv.addObject("message", "未知数据异常!");
			}
		}

		return mv;
	}

	@RequestMapping("/addaddressdetail")
	public ModelAndView addAddressdetail(HttpSession session, Addressdetail addressdetail) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		int iret = addressDetailBizImpl.insert(addressdetail);
		if (iret > 0) {

			mv.setViewName("redirect:listaddress.action");

		} else {
			mv.addObject("message", "添加详细地址失败,请重试!");
		}

		return mv;
	}

	@RequestMapping("/deladdress")
	public ModelAndView delAddress(HttpSession session, Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		int iret = addressDetailBizImpl.deleteByPrimaryKey(id);
		if (iret > 0) {

			mv.setViewName("redirect:listaddress.action");

		} else {
			mv.addObject("message", "删除详细地址失败,请重试!");
		}

		return mv;
	}

}
