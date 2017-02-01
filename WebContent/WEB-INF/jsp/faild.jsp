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
<title>500</title>
</head>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	
	<div class="kuang" style="padding:100px 15px">
		
		<div style="margin:20px 190px;">
			<font size="+5" color="red">${message}</font>
		</div>
		
	</div>
	

<%@include file="/jsp/common/foot.html" %>