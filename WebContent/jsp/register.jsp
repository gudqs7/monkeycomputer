<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/commonstyle.css" type="text/css" rel="stylesheet" />
<title>注册账号</title>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>
	$(function(){
	
		$("#reg").submit(function(){
			var name=$("input[name=loginname]").val();
			var pwd=$("input[name=loginpwd]").val();
			var repwd=$("input[name=repwd]").val();
			var realname=$("input[name=realname]").val();
			var phone=$("input[name=phone]").val();
			var email=$("input[name=email]").val();
			var birthday=$("input[name=birthday]").val();
			var flag=true;
			if(name.trim()=='')   flag=false;			
			if(pwd.trim()==''||repwd.trim()=='')  flag=false;
			if(pwd.trim()!=repwd.trim())  flag=false;
			if(realname.trim()=='')  flag=false;
			if(phone.trim().length!=11)  flag=false;
			if(email.trim()=='')  flag=false;
			if(birthday.trim()=='')  flag=false;
			if(!flag) alert('所有信息不能为空或电话号码不正确或2次密码不一致');
			return flag;
		});



	})
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<div id="register">
		
		<form id="reg" action="${pageContext.request.contextPath}/register.action" method="post">
		
			<div style="padding-left: 300px;">
				
				用户名(*):<input name="loginname" /><br/><br/>
				密&ensp; 码(*):<input name="loginpwd" type="password" /><br/><br/>
				确认密码(*):<input name="repwd" type="password" /><br/><br/>
				真实姓名(*):<input name="realname"/><br/><br/>
				性  别(*):	男<input name="gender" type="radio" value="男" checked="checked"/>  女 
							<input name="gender" type="radio" value="女"/>  <br/><br/>
				电话号码(*):<input name="phone"/><br/><br/>
				邮   箱(*):<input name="email"/> 请填写完整邮箱如example@qq.com<br/><br/>
				出生年月(*):<input name="birthday"/>请用2016-9-10这种格式填写!<br/><br/>
				
				 &ensp;&ensp;&ensp;&ensp;<input type="submit" value="注册"/>
				
				<a href="#">已有账号? 登录</a>
			</div>
			
		</form>
	
	</div>
	
<%@include file="/jsp/common/foot.html" %>
