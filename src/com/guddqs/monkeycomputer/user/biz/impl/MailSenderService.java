package com.guddqs.monkeycomputer.user.biz.impl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public int sendMail(String loginname,String to,int type) throws Exception{
		int ramdomNum=(int)(Math.random()*100000);
		if(type==1){
			sendJihuoMail(loginname,to,ramdomNum);
		}else if(type==2){
			sendReSetPassMail(loginname,to,ramdomNum);
		}
		return ramdomNum;
		
	}
	
	public void sendJihuoMail(String loginname,String to,int randomNum) throws Exception{
		MimeMessage mailMessage=mailSender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(mailMessage);
		
		helper.setTo(to);
		helper.setFrom("768446359@qq.com");
		helper.setSubject("[猴哥电脑城] : 点击链接激活账号!");
		String link="http://guddqs.picp.net:52088/jihuo.action?loginname="+loginname+"&num="+randomNum;
		helper.setText("<h2>请点击下面链接完成激活!</h2><br/><a href='"+link+"'>"+link+"</a>",true);
		mailSender.send(mailMessage);
		
	}
	
	public void sendReSetPassMail(String loginname,String to,int randomNum) throws Exception{
		MimeMessage mailMessage=mailSender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(mailMessage);
		
		helper.setTo(to);
		helper.setFrom("768446359@qq.com");
		helper.setSubject("[猴哥电脑城] : 点击链接重置密码!");
		String link="http://guddqs.picp.net:52088/resetpassmailvalidate.action?loginname="+loginname+"&num="+randomNum;
		helper.setText("<h2>请点击下面链接重置密码!</h2><br/><a href='"+link+"'>"+link+"</a>",true);
		mailSender.send(mailMessage);
		
	}
	
}
