<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/commonstyle.css" type="text/css" rel="stylesheet" />
<title>登陆</title>
</head>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<div id="login" class="kuang">
		
		<form action="${pageContext.request.contextPath}/login.action" method="post">
		
			<div align="center">
				
				用户名:<input name="loginname" value="${loginname }"/><br/><br/>
				密&ensp; 码:<input name="loginpwd" type="password" /><br/>
				<br/>
				<input type="submit" value="登录"/>
				<br/><br/>
				
				<a href="register.jsp">注册</a> | 	<a href="#">忘记密码</a>
			</div>
			
		</form>
	
	</div>
	
<%@include file="/jsp/common/foot.html" %>