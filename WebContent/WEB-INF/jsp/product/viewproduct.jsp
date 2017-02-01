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
<title>${product.name }</title>
</head>
<script type="text/javascript">
	$(function(){
		var left=$("#img").offset().left;
		var ltop=$("#img").offset().top;
		var col=$("#img").attr("width");
		var posleft=parseInt(left)+parseInt(col)+20;
		$("#bigpic").css({"left":posleft,"top":ltop});
		$("#img").mousemove(function(e){
			//alert(t);
			var x=e.offsetX;
			//alert(x);
			var y=e.offsetY;
			//alert(y);
			var loc=$(this).attr("src");
			var col=$(this).attr("width");
			var row=$(this).attr("height");
			$("#bigpic").show();
			var bigx=$("#bigpic").width();
			var bigy=$("#bigpic").height();
			//alert(bigx);
			bigx=bigx/2;
			bigy=bigy/2;
			var posx=-y*3+bigy;
			var posy=-x*3+bigx;
			$("#big").attr({"src":loc,"width":col*3,"height":row*3});
			if(posx<=0&&posx>=(-row*3+bigy*2)){
				$("#big").css("top",posx);
			}
			if(posy<=0&&posy>=(-col*3+bigx*2)){
				$("#big").css("left",posy);
			}
		});	
		$("#img").mouseout(function(){
			$("#bigpic").hide();
		});
		
		$(".packagedetail").click(function(){
			$(this).parent().find("span").css("background","#ddd");
			$(this).css("background","#f70");
			var defaultid=$(this).attr("did");
			$("#productpackageid").val(defaultid);
			$("#price").val($(this).attr("price"));
			jisum();
			
		});
		
		$("#jia").click(function(){
			var stock=$("#stock").text();
			var num=$("#num").val();
			if(parseInt(num)<parseInt(stock)){
				$("#num").val(parseInt(num)+1);
				jisum();
			}
			
		});
		
		$("#jian").click(function(){
			var stock=$("#stock").text();
			var num=$("#num").val();
			if(parseInt(num)>1){
				$("#num").val(parseInt(num)-1);
				jisum();
			}
			
		});
		
		function jisum(){
			var price=$("#price").val();
			var num=$("#num").val();
			$("#totalprice").text(parseInt(num)*parseInt(price));
			$(".totalprice").val(parseInt(num)*parseInt(price));
		}
		
	});
	
	function addtocart(){
		
		var userid=$("#userid").val();
		var productid=$("#id").val();
		var num=$("#num").val();
		var packageid=$("#productpackageid").val();
		if(packageid==''||packageid=='underfind'){
			alert('选择一个套餐');
			return;
		}
		if(userid==''||packageid=='underfind'){
			location.href='/MonkeyComputer/jsp/login.jsp';
			return;
		}
		var data='userid='+userid+'&productid='+productid+'&num='+num+'&productpackageid='+packageid;
		$.getJSON('addtocart.action',data,function(result){
			alert('添加成功!');
			if(result.flag){
				$("#cartnum").text(result.num);
			}
			
		});
		
	}
	
	
</script>
<body>

	<%@include file="/jsp/common/top.jsp" %>
	<%@include file="/jsp/common/daohang.jsp" %>
	
	<div id="product">
		
		<form action="${pageContext.request.contextPath}/buyone.action" method="post">
			
			<div id="productpic" class="left">
				<img id="img" src="/pic/${product.picture }" width="360" height="300">
			</div>
			<div id="bigpic">
				<img id="big" src="/pic/${product.picture }">
			</div>
			
			<div id="productdetail">
				<input type="hidden" id="userid" value="${loginuser.loginid }"/>
				<input type="hidden" id="id" name="productid" value="${product.id }"/>
				<font size="+3" color="orange">${product.name }</font><br/><br/>
					&ensp;&ensp;${product.simpledesc }<br/><br/>
					价格:<span id="totalprice">${product.price}</span><input type="hidden" id="price" value="${product.price }"><br/><br/>
					库存:<span id="stock">${product.stock}</span><br/><br/>
					选择套餐:
					<div id="taocan">
						<br/>&ensp;&ensp;
						<c:forEach items="${product.productpackage.packagedetails }" var="packagedetail"> 
							
							<span did="${packagedetail.id }" class="packagedetail" price="${packagedetail.price }">${packagedetail.name }</span> 
							
						</c:forEach>
						<c:if test="${empty product.productpackage.packagedetails  }">
							<span did="0" class="packagedetail" price="${product.price }">官方标配</span> 
						</c:if>
					</div>
					<br/>
					<input type="hidden" name="productpackageid" id="productpackageid" />
					<input type="hidden" name="totalprice" class="totalprice" />
					数量:<span id="jian">-</span><input id="num" value="1" name="num" size="2" /><span id="jia">+</span> 
					
					<br/><br/>
				&ensp;&ensp;<input type="submit" value="立即购买" style="padding: 9px 30px; color: #fff; background: #f50;" />
				&ensp;&ensp;<input onclick="addtocart()" type="button" value="加入购物车" style="padding: 12px 40px; color: #fff; background: #f70;" />
			</div>
			
			<div id="detaildesc">
			
				${product.detialdesc }
				
			</div>
			
		</form>
		
	</div>
	

<%@include file="/jsp/common/foot.html" %>