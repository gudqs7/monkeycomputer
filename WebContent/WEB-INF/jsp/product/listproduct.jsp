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
<title>查看商品列表</title>
</head>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/daohang.jsp" %>
	
	<div id="productlist" class="kuang">
		
		<c:forEach items="${plist }" var="product">
			
			<div class="product">
				
				<a href='${pageContext.request.contextPath}/viewproduct.action?id=${product.id}'>
				<img src="/pic/${product.picture }" width="200" height="150"><br/>
				&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;${product.name } <font size="+1" color="red">${product.price }</font></a>
				
			</div>
			
		</c:forEach>
		
	</div>
	

<%@include file="/jsp/common/foot.html" %>