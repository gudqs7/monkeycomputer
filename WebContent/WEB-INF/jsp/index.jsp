<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/commonstyle.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/function.js"></script>
<title>MonkeyComputer</title>
</head>
<script type="text/javascript">
	$(function() {

		$("#left dt").toggle(function() {

			$(this).parent().find("dd").show();

		}, function() {
			$(this).parent().find("dd").hide();
		});

		$("#left dt,#left dl dd").hover(function() {

			$(this).css("background", "#FFCC00");

		}, function() {

			$(this).css("background", "#00CCFF");

		});

		qi = setInterval('gunqilai()', 2000);

		$("#showpic").hover(function(){
			clearInterval(qi);
			
		},function(){
			qi = setInterval('gunqilai()', 2000);
			
		});
		
	})

	function gunqilai() {

		var leftv = $("#showpic").position().left;
		$("#showpic").animate({
			left : leftv - 600

		}, 1000, function() {
			$("#showpic ul").append($("#showpic ul li:first"));
			$("#showpic").css("left", "0px");
		});

	}
</script>
<body>

	<%@include file="/jsp/common/top.jsp"%>
	<%@include file="/jsp/common/daohang.jsp"%>

	<div
		style="width: 1000px; margin: 0px auto; position: relative; clear: both; height: 600px;">

		<div id="left">

			<ul>

				<c:forEach items="${typelist }" var="type">

					<c:if test="${type.parentid==null }">

						<li>
							<dl>
								<dt>${type.name}</dt>
								<c:forEach items="${typelist }" var="sontype">
									<c:if test="${sontype.parentid==type.id }">
										<dd>
											&ensp; &ensp; <a
												href="${pageContext.request.contextPath}/search.action?tid=${sontype.id }">
												${sontype.name }</a>
										</dd>
									</c:if>
								</c:forEach>
							</dl>
						</li>

					</c:if>

				</c:forEach>

			</ul>

		</div>

		<div id="picproduct">
			<div id="showpic">
				<ul>
					<c:forEach items="${piclist }" var="pic">

						<li><a
							href='${pageContext.request.contextPath}/viewproduct.action?id=${pic.productid}'>
								<img width="600px" height="300" title="${pic.tip }"
								alt="${pic.tip }" src="/pic/${pic.picture }">
						</a></li>

					</c:forEach>
				</ul>
			</div>
		</div>


		<div id="hotproduct">

			<div id="head">热卖商品</div>
			<ul>
				<c:forEach items="${hotproducts }" var="hot">

					<li class="left">

						<div class="hot">
							<a
								 href='${pageContext.request.contextPath}/viewproduct.action?id=${hot.id}'>
								<img src="/pic/${hot.picture }" width="134" height="100"><br />
								${hot.name } <span class='red'>${hot.price }</span>
							</a>
						</div>

					</li>

				</c:forEach>
			</ul>

		</div>
	</div>
	<div style="width: 1000px; margin: 0px auto; height: 20px;"></div>

	<%@include file="/jsp/common/foot.html"%>