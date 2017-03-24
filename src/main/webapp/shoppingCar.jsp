<%@page import="com.union.tsw.user.pojo.User"%>
<%@page import="java.util.List"%>
<%@page import="com.union.tsw.findShoppingcar.pojo.FindShoppingcar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/cart.css" />
<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>

</head>
<body>
	<div id="box">
		<!--页面头部开始-->
		<header>
			<div id="logo">
				<a href="index.jsp"><img src="img/logo.jpg"/></a>
			</div>
			<div id="login">
			<%
				Object obj = session.getAttribute("user");
				User user=null;
					if (obj != null) {
				user = (User) obj;
			%>
			<span>Hi,<%=user.getUserName() %>会员 欢迎回淘书！</span>
			<a href="logout">登出</a>
			<a href="userInformation.jsp">会员中心</a>
			<%
				} else {
			%>
			<span>Hi,会员 欢迎回淘书！</span>
			<a href="userLogin.jsp">登录</a>
			<a href="regist.jsp">注册</a>
			<%
				}
			%>
			</div>

		</header>
		

		<!--页面主体部分开始-->
		<div id="main">
			<form action="submitAllOrderformbyUserId" method="get">
				<table border='0' cellspacing="0">
					<tr>
						<th><input type="checkbox" class="allSel" onchange="selectAll(this)"/>全选</th>
						<th></th>
						<th>商品信息</th>
						<th>单价（元）</th>
						<th>数量</th>
						<th>金额（元）</th>
						<th>操作</th>
					</tr>
				<%
					List<FindShoppingcar> find=(List<FindShoppingcar>)request.getAttribute("find");
						if(find!=null){	
							for(int j=0;j<find.size();j++){
				%>
					<tr>
						<td><input type="checkbox" class="sel" value="<%=find.get(j).getShoppingcarId()%>" name="chooseItem"
					onchange="addOne(this,<%=(find.get(j).getBookPrice())*(find.get(j).getShoppingcarCount())%>)"></td>
						<td><img src="<%=find.get(j).getBookImage()%>"></td>
						<td><%=find.get(j).getBookName()%></td>
						<td><%=find.get(j).getBookPrice()%></td>
						<td><%=find.get(j).getShoppingcarCount()%></td>
						<td><%=(find.get(j).getBookPrice())*(find.get(j).getShoppingcarCount())%></td>
						<td>
							<p><a
					href="deleteByPrimaryKey?shoppingcarId=<%=find.get(j).getShoppingcarId()%>&userId=<%=user.getUserId()%>">删除</a></p>
						</td>
					</tr>
				<%
					}}
				%>
					<tr>
						<th></th>
						<th></th>
						<th colspan="3"></th>
						<th>总计：￥<span id="totalSpan">0.0</span>元</th>
						<th><input type="submit" value="结 算" /></th>
					</tr>
				</table>
			</form>
		</div>
		<!--页脚开始-->
		<footer>
			<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
			<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
		</footer>
	</div>
	
	
	<script>
	var totalPrice=0;
		/* 加减乘除 */
	function add(a, b) {
	    var c, d, e;
	    try {
	        c = a.toString().split(".")[1].length;
	    } catch (f) {
	        c = 0;
	    }
	    try {
	        d = b.toString().split(".")[1].length;
	    } catch (f) {
	        d = 0;
	    }
	    return e = Math.pow(10, Math.max(c, d)), (mul(a, e) + mul(b, e)) / e;
	}
	
	function sub(a, b) {
	    var c, d, e;
	    try {
	        c = a.toString().split(".")[1].length;
	    } catch (f) {
	        c = 0;
	    }
	    try {
	        d = b.toString().split(".")[1].length;
	    } catch (f) {
	        d = 0;
	    }
	    return e = Math.pow(10, Math.max(c, d)), (mul(a, e) - mul(b, e)) / e;
	}
	
	function mul(a, b) {
	    var c = 0,
	        d = a.toString(),
	        e = b.toString();
	    try {
	        c += d.split(".")[1].length;
	    } catch (f) {}
	    try {
	        c += e.split(".")[1].length;
	    } catch (f) {}
	    return Number(d.replace(".", "")) * Number(e.replace(".", "")) / Math.pow(10, c);
	}
	
	function div(a, b) {
	    var c, d, e = 0,
	        f = 0;
	    try {
	        e = a.toString().split(".")[1].length;
	    } catch (g) {}
	    try {
	        f = b.toString().split(".")[1].length;
	    } catch (g) {}
	    return c = Number(a.toString().replace(".", "")), d = Number(b.toString().replace(".", "")), mul(c / d, Math.pow(10, f - e));
	}
	
	var domList;
	function selectAll(myChoice) {
		domList = document.getElementsByName("chooseItem");
		if(myChoice.checked==true)
		{
			totalPrice=0;
			for(var i=0;i<domList.length;i++)
			{
				domList[i].checked=true;
				domList[i].onchange();
			}
		}else{
			for(var i=0;i<domList.length;i++)
			{
				if(domList[i].checked==true){
					domList[i].checked=false;
					domList[i].onchange();
				}
			}
		}
	}
		
		
	var totalSpan = document.getElementById("totalSpan");
	function addOne(selectOne,onePrice){
		if(selectOne.checked==true){
			totalPrice = add(onePrice,totalPrice);
		}else{
			totalPrice= sub(totalPrice,onePrice);
		}
		totalSpan.innerHTML = Number(totalPrice);
	}
	</script>
</body>
</html>