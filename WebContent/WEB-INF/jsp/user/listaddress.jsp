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
<title>管理收货地址</title>
</head>
<script type="text/javascript">
	
	$(function(){
		
		$("#address input[type='checkbox']").change(function(){
			
			var checked=$(this).attr("checked");
			if(checked=='checked'){
				var $v=$(this);
				var addressid=$("#addressid").val();
				var detailid=$(this).val();
				
				$.getJSON('${pageContext.request.contextPath}/updateaddress.action','addressid='+addressid+'&detailid='+detailid,function(data){
					if(data.flag=='ok'){
						$("#address input[type='checkbox']").removeAttr("checked");
						$("#address input[type='checkbox']").next().html('<font size="+1">设为默认</font>');
						$v.attr("checked","checked");
						$v.next().html('<font size="+1" color="red">默认地址</font>');
					}else{
						alert('更改失败,请重试!');
					}
				});
				
			}
			
		});
		
		
		
	})
	
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/userdaohang.jsp" %>
	
	<div id="address" class="kuang">	
	
		<c:forEach items="${address.addressdetails }" var="detail">
			<input id="addressid" type="hidden" value="${address.id }"/>
			<div class='detail kuang'>
				
				${detail.username }<span class="space1"> </span>${detail.phone }
				<br/><br/>
					&ensp;&ensp;&ensp;${detail.province }省${detail.city }市${detail.area }${detail.street }${detail.detail }
				<br/><br/><hr/><br/>
				<input type="checkbox" value="${detail.id }" <c:if test="${address.defaultid==detail.id }">checked="checked" </c:if> />
				<span><c:if test="${address.defaultid==detail.id }"><font size="+1" color="red">默认地址</font></c:if>
				<c:if test="${address.defaultid!=detail.id }"><font size="+1">设为默认</font></c:if></span>
				<span class="space2"> </span>
				<a style="color: blue; font-size: 20px;" href='${pageContext.request.contextPath}/editaddress.action?id=${detail.id}'>编辑</a>  | 
				 <a style="color: blue; font-size: 20px;"  href='${pageContext.request.contextPath}/deladdress.action?id=${detail.id}'>删除</a>
			</div>
		
		</c:forEach>
		
			
		<c:if test="${empty address.addressdetails }">
			无任何收货地址,请添加一个!
		</c:if>

	</div>
	

<%@include file="/jsp/common/foot.html" %>