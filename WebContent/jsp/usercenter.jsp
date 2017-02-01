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
<title>用户中心</title>
</head>
<body>
	
	<%@include file="/jsp/common/top.jsp" %>
	<div id="userdaohang">
		<ul>
			<li>
				<dl >
					<dt>个人信息中心</dt>
					<dd>
						<ul>
							<li><a href='#'>查看个人信息</a></li>
							<li><a href='#'>修改个人信息</a></li>
							<li><a href='#'>修改密码</a></li>
							<li><a href='#'>重置密码</a></li>
						</ul>
					</dd>
				</dl>
			</li>
			<li>
				<dl >
					<dt>我的收货地址</dt>
					<dd>
						<ul>
							<li><a href='#'>查看收货地址</a></li>
							<li><a href='#'>新增收货地址</a></li>
						</ul>
					</dd>
					
					
				</dl>
			</li>
		</ul>
	</div>
	

<%@include file="/jsp/common/foot.html" %>