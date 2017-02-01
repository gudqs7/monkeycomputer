<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="daohang">

	<ul>
		 <li a='false' class="left">&ensp;</li><li class="left"><a href='${pageContext.request.contextPath }/index.action'>首页</a></li>
		<c:forEach items="${typelist }" var="type">
			<c:if test="${type.parentid==null }">
				<li a='false' class="left">|</li><li class="left"><a href='${pageContext.request.contextPath }/search.action?tpid=${type.id}'>${type.name }</a></li>
			</c:if>
		</c:forEach>
		<li a='false' class="left">|</li><li class="left"><a href='tencent://message/?uin=768446359'>联系我们</a></li>
	</ul>

</div>