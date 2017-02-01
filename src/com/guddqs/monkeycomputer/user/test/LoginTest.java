package com.guddqs.monkeycomputer.user.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guddqs.monkeycomputer.user.biz.AddressBiz;
import com.guddqs.monkeycomputer.user.dao.LoginMapper;
import com.guddqs.monkeycomputer.user.entity.Login;
import com.guddqs.monkeycomputer.user.entity.LoginExample;
import com.guddqs.monkeycomputer.user.entity.Useraddress;
import com.guddqs.monkeycomputer.user.entity.UseraddressExample;

public class LoginTest {

	@SuppressWarnings("resource")
	@Test
	public void testLogin() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml","applicationContext-mail.xml");

		LoginMapper login = (LoginMapper) ctx.getBean("loginMapper");

		LoginExample example = new LoginExample();
		example.createCriteria().andLoginnameEqualTo("sbw");

		List<Login> list = login.selectByExample(example);
		
		System.out.println(list);

	}
	
	@SuppressWarnings("resource")
	@Test
	public void testRegister() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml");

		LoginMapper login = (LoginMapper) ctx.getBean("loginMapper");

		Login record=new Login();
		record.setLoginname("admin");
		record.setLoginpwd("kkk");
		record.setState(0);
		record.setIsadmin(new Short("1"));
		
		login.insertSelective(record);
		
		System.out.println(record.getLoginid());

	}
	
	@SuppressWarnings("resource")
	@Test
	public void testAddress() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml","applicationContext-mail.xml");

		AddressBiz login = (AddressBiz) ctx.getBean(AddressBiz.class);


		UseraddressExample example=new UseraddressExample();
		example.createCriteria().andUseridEqualTo(35);
		List<Useraddress> list=login.selectByExample(example);
		
		System.out.println(list);
		System.out.println(list.get(0).getAddressdetails().get(0).getDetail());

	}

}
