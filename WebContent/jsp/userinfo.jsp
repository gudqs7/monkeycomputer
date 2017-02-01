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
<title>查看个人信息</title>
</head>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/userdaohang.jsp" %>
	
	<div id="userinfo">
		
				用户名(*):<input name="loginname" /><br/><br/>
				密&ensp; 码(*):<input name="loginpwd"/><br/><br/>
				确认密码(*):<input name="repwd"/><br/><br/>
				真实姓名(*):<input name="realname"/><br/><br/>
				性  别(*):	男<input name="gender" type="radio" value="男"/>  女 
							<input name="gender" type="radio" value="女"/>  <br/><br/>
				电话号码(*):<input name="phone"/><br/><br/>
				邮   箱(*):<input name="email"/><br/><br/>
				出生年月(*):<input name="birthday"/><br/><br/>
		
	</div>
	

<%@include file="/jsp/common/foot.html" %>