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
<title>订单查询</title>
</head>
<script type="text/javascript">
	$(function(){
		
		$("#order div[class=orderone]").each(function(index,element){

			var birthday=$(this).find("span[class=createtime]").text();
			var monthcon = {"Jan":"01","Feb":"02","Mar":"03","Apr":"04",  
				       "May":"05","Jun":"06","Jul":"07","Aug":"08",  
				       "Sep":"09","Oct":"10","Nov":"11","Dec":"12"};  
			 var dateArray = birthday.split(" ");  //Sun Jan 01 00:00:00 CST 2012+"  "+dateArray[3].substring(0,5)
			 var rtime = dateArray[5].substring(0,4)+"-"+monthcon[dateArray[1]]+"-"+dateArray[2]+"  "+dateArray[3].substring(0,5);  
			 $(this).find("span[class=createtime]").text(rtime);  
				
			
		});
		
		
	})
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/daohang.jsp" %>
	
	<div id="order" class="kuang">
		
		<c:forEach items="${orders }" var="order">
			
			<div class="orderone">
				
				订单号:${order.ordernum }<span class="space3"> </span><span class="createtime">${order.createtime }</span>
				<span style="color: red">${order.totalprice } ￥</span>
				<br/>
				<hr><br/>
				
				<c:forEach items="${details }" var="detail">
					
					<c:if test="${detail.orderid==order.id }">
					
						<div class="detail">
							
							<c:forEach items="${plist }" var="p">
								<c:if test="${p.id==detail.productid }">
									<span class="left"><img src="/pic/${p.picture }" width="130" height="90"></span>
									
									<div style="margin-left: 50px;">
										${p.name }
										<select disabled="disabled" name="productpackageid">	
											<c:forEach items="${p.productpackage.packagedetails }" var="pd">
												<option price="${pd.price }" value="${pd.id }" 
												<c:if test="${pd.id==detail.productpackageid }">selected="selected"</c:if> >
												${pd.name }</option>
											</c:forEach>
											<c:if test="${empty p.productpackage.packagedetails }">
												<option price="${p.price }" value="0" 
												<c:if test="${0==detail.productpackageid }">selected="selected"</c:if> >
												官方标配</option>
											</c:if>
											
										</select><br/>
										价格${p.price }<br/>
										数量:${detail.num }
										<br/>
										小计:${p.price*detail.num }
									</div>
										
								</c:if>
				</c:forEach>
							
						</div>
					
					</c:if>
					
				</c:forEach>
				
			</div>
			
		</c:forEach>
		
	</div>
	

<%@include file="/jsp/common/foot.html" %>