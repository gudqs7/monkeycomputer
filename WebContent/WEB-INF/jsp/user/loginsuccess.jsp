<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/commonstyle.css" type="text/css" rel="stylesheet" />
<title>登陆成功</title>
</head>
<script type="text/javascript">
	
	setTimeout(function(){
		location.href='userinfo.action';
	}, 800)
</script>
<body>

	<div align="center" class="kuang" style="color: black; padding: 50px 200px;">
	登陆成功!  <a style="color: blue;" href="${pageContext.request.contextPath}/userinfo.action">点击</a>跳转到个人中心
</div>
<%@include file="/jsp/common/foot.html" %>