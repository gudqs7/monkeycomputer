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
<title>编辑收货地址</title>
</head>
<script type="text/javascript">
	$(function(){
	
		var id=$("#id").val();
		if(id==''){
			$("#myfrom").attr("action","${pageContext.request.contextPath}/addaddressdetail.action");
		}
		
	})
	
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/userdaohang.jsp" %>
	
	<div id='detail' class="kuang">	
	<form id="myfrom" action="${pageContext.request.contextPath}/updateaddressdetail.action" method="post">
		<input id="id" name="id" type="hidden" value="${detail.id }"/>
		<input type="hidden" name="addressid" value="${addressid }"/>
		收货人:<input name="username" value="${detail.username }" /><br/><br/> 
		通知手机:<input name="phone" value="${detail.phone }" /><br/><br/> 
		省:<input name="province" value="${detail.province }" /><br/><br/> 
		市:<input name="city" value="${detail.city }" /><br/><br/> 
		区(县):<input name="area" value="${detail.area }" /><br/><br/> 
		街道:<input name="street" value="${detail.street }" /><br/><br/> 
		详细:
		<textarea rows="7" cols="40" name="detail" >${detail.detail }</textarea>
		<br/><br/> 
		<input type="submit" value="保存" />
	</form>
	</div>
	

<%@include file="/jsp/common/foot.html" %>