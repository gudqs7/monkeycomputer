<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="userdaohang">
		<ul>
			<li>
				<dl >
					<dt>个人信息中心</dt>
					<dd>
						<ul>
							<li><a href='${pageContext.request.contextPath}/userinfo.action'>查看个人信息</a></li>
							<li><a href='${pageContext.request.contextPath}/userinfo.action?update=1'>修改个人信息</a></li>
							<li><a href='${pageContext.request.contextPath}/jsp/updatepass.jsp'>修改密码</a></li>
							<li><a href='${pageContext.request.contextPath}/getmail.action'>重置密码</a></li>
						</ul>
					</dd>
				</dl>
			</li>
			<li>
				<dl >
					<dt>我的收货地址</dt>
					<dd>
						<ul>
							<li><a href='${pageContext.request.contextPath}/listaddress.action'>查看收货地址</a></li>
							<li><a href='${pageContext.request.contextPath}/addaddress.action'>新增收货地址</a></li>
						</ul>
					</dd>
				</dl>
			</li>
			<li>
				<dl >
					<dt>我的订单</dt>
					<dd>
						<ul>
							<li><a href='${pageContext.request.contextPath}/listorder.action'>所有订单</a></li>
							<li><a href='${pageContext.request.contextPath}/listorder.action'>暂无</a></li>
						</ul>
					</dd>
				</dl>
			</li>
			
		</ul>
	</div>