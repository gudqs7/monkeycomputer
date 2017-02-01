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
<title>查看个人信息</title>
</head>
<script type="text/javascript">
	$(function(){
		var update=$("#update").val();
		if(update==''){
			$("input").css("border","none");
			$("input").attr("readonly","readonly");			
		} 
		
		var birthday=$("#birthday").val();
		var monthcon = {"Jan":"01","Feb":"02","Mar":"03","Apr":"04",  
			       "May":"05","Jun":"06","Jul":"07","Aug":"08",  
			       "Sep":"09","Oct":"10","Nov":"11","Dec":"12"};  
	     var dateArray = birthday.split(" ");  //Sun Jan 01 00:00:00 CST 2012+"  "+dateArray[3].substring(0,5)
	     var rtime = dateArray[5]+"-"+monthcon[dateArray[1]]+"-"+dateArray[2];  
	     $("#birthday").val(rtime);  
	})
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/userdaohang.jsp" %>
	
	<div id="userinfo" class="kuang">
		<form action="${pageContext.request.contextPath}/updateuser.action" method="post">
			<input type="hidden" name="loginid" value="${loginuser.loginid }"/>
			用户名(*):<input readonly="readonly" name="loginname" value="${loginuser.loginname }" /><br/><br/>
			真实姓名(*):<input name="realname"  value="${userinfo.realname }"/><br/><br/>
			性  别(*):	 
				<input id="update" type="hidden" value="${update }"/>
				<c:if test="${update==1 }">
					男<input name="gender"  type="radio" value="男" <c:if test="${userinfo.gender=='男' }">checked="checked"</c:if> />
					女<input name="gender"  type="radio" value="女" <c:if test="${userinfo.gender=='女' }">checked="checked"</c:if>  />
				</c:if>
				<c:if test="${update==null }">
					${userinfo.gender}	
				</c:if>
				
			<br/><br/>
			电话号码(*):<input name="phone"  value="${userinfo.phone}"/><br/><br/>
			邮   箱(*):<input name="email"  value="${userinfo.email}"/><br/><br/>
			出生年月(*):<input id="birthday" name="birthday" value="${userinfo.birthday}"/><br/><br/>
			<c:if test="${update==1 }">
				<input type="submit" value="保存"/>
			</c:if>
			
		</form>		
	</div>
	

<%@include file="/jsp/common/foot.html" %>