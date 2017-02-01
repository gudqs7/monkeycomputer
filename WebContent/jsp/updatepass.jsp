<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/commonstyle.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/function.js"></script>
<title>修改密码</title>
</head>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/userdaohang.jsp" %>
	
	<div id="updatepass" class="kuang" >
		<form action="${pageContext.request.contextPath}/updatepass.action" method="post">
			<input type="hidden" name="loginid" value="${loginuser.loginid }"/>
			原密码:<input name="loginpwd" type="password" /><br/><br/>
			新密码:<input name="newpass" type="password" /><br/><br/>
			确认密码:<input name="repass" type="password" /><br/><br/>
			<input type="submit" value="修改"/>
		</form>		
	</div>
	

<%@include file="/jsp/common/foot.html" %>