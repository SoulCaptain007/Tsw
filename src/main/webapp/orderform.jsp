<%@page import="com.union.tsw.user.pojo.User"%>
<%@page import="com.union.tsw.orderform.pojo.Orderform"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/order.css" />
<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>

<div id="box">
	<!--页面头部开始-->
	<header>
		<div id="logo">
			<a href="index.jsp"><img src="img/logo.jpg" alt="logo" /></a>
		</div>
		<div id="login">
			<%
					Object obj = session.getAttribute("user");
					User user=null;
					if (obj != null) {
					user = (User) obj;
				%>
			<span>Hi,<%=user.getUserName() %>会员 欢迎回淘书！
			</span> <a href="logout">登出</a> <a href="userInformation.jsp">会员中心</a>
			<a href="findByIdShoppingcar?userId=<%=user.getUserId()%>">我的购物车</a>
			<%
				} else {
			%>
			<span>Hi,会员 欢迎回淘书！</span> <a href="userLogin.jsp">登录</a> <a
				href="regist.jsp">注册</a>
			<%
				}
			%>
		</div>
	</header>
	
	<!--页面主体部分开始-->
	<div id="main">
		<table border='0' cellspacing="0">
			<tr>
				<th colspan="2">商品信息</th>
				<th>单价</th>
				<th>数量</th>
				<th>总价</th>
				<th>
					<select name="">
						<option value="">全部状态</option>
					</select>
				</th>
				<th>操作</th>
			</tr>
			<% 
			 	List<Orderform> orderform = (List<Orderform>)session.getAttribute("orderform");
				if(orderform != null){
				for(int j=0 ; j<orderform.size() ; j++){			
					for(int i=0 ; i<orderform.get(j).getOrderdetails().size() ; i++){
				%>
			<tr>
				<td><img src="<%=orderform.get(j).getOrderdetails().get(i).getBook().getBookImage()%>"></td>
				<td><%=orderform.get(j).getOrderdetails().get(i).getBook().getBookName()%></td>
				<td>￥<%=orderform.get(j).getOrderdetails().get(i).getBook().getBookPrice()%></td>
				<td><%=orderform.get(j).getOrderdetails().get(i).getOrderdetailsCount()%></td>
				<td><%=orderform.get(j).getOrderdetails().get(i).getBook().getBookPrice()*orderform.get(j).getOrderdetails().get(i).getOrderdetailsCount()%></td>
				<td>等待付款</td>
				<form action="removeOrderformById?userId=<%=user.getUserId() %>" method="post">
					<td>
						<p><a href="submitAll?userId=<%=user.getUserId() %>">支付</a></p>
						<p><a href="removeOrderformById?userId=<%=user.getUserId()%>&orderformId=<%=orderform.get(j).getOrderformId()%>" >删除</a></p>
					</td>
				</form>
			</tr>
		<%
			}}}
		%>
		</table>
<br/>
	</div>
	<!--页脚开始-->
	<footer>
		<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
		<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
	</footer>
</div>
</body>
</html>