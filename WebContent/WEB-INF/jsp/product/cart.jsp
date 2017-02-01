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
<title>我的购物车</title>
</head>
<script type="text/javascript">
	$(function() {
		initprice();
		calcatetotal();
		$(".jia").click(
				function() {
					var stock = $(this).attr("stock");
					var num = $(this).prev().val();
					if (parseInt(num) < parseInt(stock)) {
						$(this).prev().val(parseInt(num) + 1);
						var key = $(this).parent().parent().find(
								"td input[name=key]").val();
						num = $(this).prev().val();
						$.getJSON('updatacartnum.action',
								'key=' + key + '&cartnum=' + num, function(rs) {

									if (rs.flag) {
										//alert('Test_Jia_Success');
										calcatetotal();
									}

								});

					}

				});

		$(".jian").click(
				function() {
					var stock = $(this).attr("stock");
					var num = $(this).next().val();
					if (parseInt(num) > 1) {
						$(this).next().val(parseInt(num) - 1);
					}
					var key = $(this).parent().parent().find(
							"td input[name=key]").val();
					num = $(this).next().val();
					$.getJSON('updatacartnum.action', 'key='
							+ key + '&cartnum=' + num, function(rs) {

						if (rs.flag) {
							//alert('Test_Jian_Success');
							calcatetotal();
						}

					});

				});

		$("#cart table tr td select").change(
				function() {
					var key = $(this).parent().parent().find(
							"td input[name=key]").val();

					var packageid = $(this).val();
					$.getJSON('updatacartpackage.action',
							'key=' + key + '&packageid=' + packageid, function(
									rs) {

								if (rs.flag) {
									location.reload();
								}

							});

				});

		$("#cart table tr td input[type=checkbox]").change(function() {

			calcatetotal();

		});

		$("#checkall").click(
				function() {
					var checked = $(this).attr("checked");
					if (checked == 'checked') {
						$("#cart table tr td input[type=checkbox]").attr(
								"checked", "checked");
					} else {
						$("#cart table tr td input[type=checkbox]").removeAttr(
								"checked");
					}
					calcatetotal();

				});

		function calcatetotal() {

			var sumprice = 0;
			$("#cart table tr").each(
					function(index, element) {

						if (index != 0) {

							var checked = $(this).find("td[class='check']")
									.find("input[type=checkbox]").attr(
											"checked");
							//alert($(this).html());

							var price = $(this).find("td[class=price]").text();
							var num = $(element).find("td[class=num] input")
									.val();

							var totalprice = parseInt(price) * parseInt(num);
							$(this).find("td[class=totalprice]").text(
									totalprice);
							if (checked == 'checked') {
								sumprice = sumprice + totalprice;
							}
						}

					});
			$("#totalprice").val(sumprice);
			$("#total span").text(sumprice);

		}

		function initprice() {

			$("#cart table tr").each(
					function(index, element) {
						if (index != 0) {
							var price = $(this).find("td[class=product]").find(
									":selected").attr("price");
							//alert(price);
							$(this).find("td[class=price]").text(price);
						}
					});

		}

	})

	function delcart(key) {

		$.getJSON('/MonkeyComputer/delcartbykey.action', 'cartkey=' + key,
				function(rs) {

					if (rs.flag) {
						location.reload();
					}

				});
	}
</script>
<body>

	<%@include file="/jsp/common/top.jsp"%>
	<%@include file="/jsp/common/daohang.jsp"%>

	<div id="cart" class="kuang">
		<form action="${pageContext.request.contextPath}/buycart.action"
			method="post">
			<table border="0" cellpadding="40" cellspacing="19">

				<tr>
					<th><input type="checkbox" id="checkall" />全选</th>
					<th>商品信息</th>
					<th>单价</th>
					<th>数量</th>
					<th>金额</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${mycart }" var="cart">
					<c:forEach items="${plist }" var="p">
						<c:if test="${p.id==cart.value.productid }">
							<tr>
								<td class="check"><input type="checkbox" class="cartcheck"
									name="keys" value="${cart.key }" /> <input type="hidden"
									name="key" value="${cart.key }" /></td>
								<td class="product"><a
									href='${pageContext.request.contextPath}/viewproduct.action?id=${p.id}'><img
										src="/pic/${p.picture }" width="130" height="90"></a>
									${p.name } <select name="productpackageid">
										<c:forEach items="${p.productpackage.packagedetails }"
											var="pd">
											<option price="${pd.price }" value="${pd.id }"
												<c:if test="${pd.id==cart.value.productpackageid }">selected="selected"</c:if>>
												${pd.name }</option>
										</c:forEach>
										<c:if test="${empty p.productpackage.packagedetails }">
											<option price="${p.price }" value="0"
												<c:if test="${0==cart.value.productpackageid }">selected="selected"</c:if>>
												官方标配</option>
										</c:if>
								</select></td>
								<td class="price">${p.price }</td>
								<td class="num"><span stock="${p.stock }" class="jian">-</span>
									<input class="num" value="${cart.value.num }" name="num"
									size="2" /> <span stock="${p.stock }" class="jia">+</span></td>

								<td class="totalprice">${p.price*cart.value.num }</td>

								<td><a href='javascript: ;' onclick="delcart(this.name)"
									name="${cart.key }">删除</a></td>

							</tr>
						</c:if>
					</c:forEach>

				</c:forEach>
			</table>
			<div id="total" class="right">

				<font size="+3" color="red">总价:<span>0</span><input
					id="totalprice" type="hidden" name="totalprice"></font>

			</div>
			<div>
				<input id="jiesuan" type="submit" value="结算">
			</div>
		</form>

	</div>


	<%@include file="/jsp/common/foot.html"%>