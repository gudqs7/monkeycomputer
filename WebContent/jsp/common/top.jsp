<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
<body>
	
	<div id="top">
		<div class="left">
			<c:out value="${loginuser.loginname}" default="游客 " />,您好!
			欢迎来到MonkeyComputer!
		</div>
		<div class="right">
			<c:if test="${sessionScope.loginuser==null }">
				<a href="${pageContext.request.contextPath}/jsp/login.jsp">登陆</a>  | 
				<a href="${pageContext.request.contextPath}/jsp/register.jsp">注册</a>
			</c:if>
			<c:if test="${sessionScope.loginuser!=null }">
				<a href="${pageContext.request.contextPath}/userinfo.action">个人中心</a> | 
				<a href="${pageContext.request.contextPath}/logout.action">注销</a> | 
			</c:if>
			 <span id="mycart"><a href='${pageContext.request.contextPath}/viewcart.action'>购物车</a>(<span id="cartnum"><c:out value='${mycart.size() }' default="0" /></span>)</span>
		</div>		
	</div>
	