<%@page import="com.union.tsw.findallcollection.pojo.FindAllCollection"%>
<%@page import="com.union.tsw.user.pojo.User"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的收藏</title>
<link rel="stylesheet" type="text/css" href="css/love.css" />
</head>
<body>
	<div id="box">
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
		<form action="submitAllOrderformbyUserId" method="get">
			<div id="main">
			<%
				List<FindAllCollection> collection=(List<FindAllCollection>)request.getAttribute("collection");
						if(collection!=null){	
							for(int j=0;j<collection.size();j++){
			%>
			
				<dl>
					<dt>
						<img src="<%=collection.get(j).getBookImage()%>" width="200" />
					</dt>
					<dd>
						<p>书名：<%=collection.get(j).getBookName()%></p>
						<p>作者：</p>
						<p>单价：<%=collection.get(j).getBookPrice()%></p>
						<p><a
					href="insert?shoppingcarCount=<%=1%>&userId=<%=collection.get(j).getUserId()%>&bookId=<%=collection.get(j).getBookId() %>">添加到购物车</a></p>
						<p><a
					href="removeCollection?collectionId=<%=collection.get(j).getCollectionId()%>&userId=<%=user.getUserId()%>">删除</a></p>
					</dd>

				</dl>
			<%
				}}
			%>
			</div>
		</form>
		<footer>
		<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
		<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
		</footer>

	</div>
	<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>

	<script type="text/javascript">
			$('#showComment').click(function(){
				$('#comment').show(400);
				$('#comment p').show(800);
			})
			$('#love').click(function(){
				$(this).text("❤已收藏").css('color','red');
			})
			$('#cart').click(function(){
				alert('加入购物车成功！');
			})
		</script>
</body>
</html>