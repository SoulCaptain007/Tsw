<%@page import="java.util.List"%>
<%@page import="com.union.tsw.findallcollection.pojo.FindAllCollection"%>
<%@page import="com.union.tsw.user.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/main.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<form id="myform" method="post">
		<div id="box">
			<!--页面头部开始-->
			<header>
			<div id="logo">
				<a href="index.html"><img src="img/logo.jpg" /></a>
			</div>
			<div id="login">
				<%
					Object obj = session.getAttribute("user");
					if (obj != null) {
						User user = (User) obj;
						out.print("Hi," + user.getUserName() + " 欢迎回淘书！");
				%>
				<a href="logout">登出</a> <a href="userInformation.jsp">会员中心</a>
				<%
					} else {
				%>
				<span>Hi,会员 欢迎回淘书！</span> <a href="userLogin.jsp">登录</a> <a
					href="regist.jsp">注册</a>
				<%
					}
				%>
				<%
					if (obj != null) {
						User user1 = (User) obj;
				%>
				<a href="findByIdShoppingcar?userId=<%=user1.getUserId()%>">购物车</a>
				<a href="findAllOrderformByUserId?userId=<%=user1.getUserId()%>">我的订单</a>
				<%
					}
				%>
			</div>
			<div id="search">
				<input type="search" id="findBook"/> 
				<input type="button" id='searchBtn' onclick="fb()" value="查找" /> <br/>
				<input type="radio" name="choose" value="name" id="ch1" /><span>书 名</span> 
				<input type="radio" name="choose" value="author" id="ch2" /><span>作 者</span>
				<input type="radio" name="choose" value="type" id="ch3" /><span>种类</span>
			</div>
			</header>
			<!--导航部分-->
			<nav>
			<ul>
				<a href="showBookByType?bookType=1"><li>文学类</li></a>
				<a href="showBookByType?bookType=2"><li>小说类</li></a>
				<a href="showBookByType?bookType=3"><li>励志类</li></a>
				<a href="showBookByType?bookType=4"><li>历史类</li></a>
				<%
					Object obj2 = session.getAttribute("user");
					if (obj2 != null) {
						User user2 = (User) obj2;
				%>
				<a href="findCollectionByUserId?userId=<%=user2.getUserId()%>"><li>❤我的收藏<li></a>
				<%
					}
				%>
			</ul>
			</nav>
			<!--轮播图部分-->
			<div id="banner">
				<div id="banner_main">
					<a href="findBookByImage?bookImage=images/book/literature/1.jpg"><img
						src="images/book/literature/1.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/2.jpg"><img
						src="images/book/literature/2.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/3.jpg"><img
						src="images/book/literature/3.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/4.jpg"><img
						src="images/book/literature/4.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/1.jpg"><img
						src="images/book/story/1.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/2.jpg"><img
						src="images/book/story/2.jpg" /></a>
				</div>
				<div id="bottom"></div>
				<ul>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
			</div>
			<!--页面主体部分开始-->
			<div id="main">
				<p>今日推荐</p>
				<div id="showImg">
					<a href="findBookByImage?bookImage=images/book/literature/1.jpg"><img
						src="images/book/literature/1.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/2.jpg"><img
						src="images/book/literature/2.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/3.jpg"><img
						src="images/book/literature/3.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/literature/4.jpg"><img
						src="images/book/literature/4.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/1.jpg"><img
						src="images/book/story/1.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/2.jpg"><img
						src="images/book/story/2.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/3.jpg"><img
						src="images/book/story/3.jpg" /></a> <a
						href="findBookByImage?bookImage=images/book/story/4.jpg"><img
						src="images/book/story/4.jpg" /></a>
				</div>
			</div>
			<!--页脚开始-->
			<footer>
			<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
			<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
			</footer>
		</div>
		<script type="text/javascript">
			var myform = document.getElementById("myform");
			var findStr = document.getElementById("findBook");
			var ch1 = document.getElementById("ch1");
			var ch2 = document.getElementById("ch2");
			var ch3 = document.getElementById("ch3");
			var findBook = document.getElementById("findBook");
			function fb() {
				if (ch1.checked == true) {
					findStr.name = "bookName";
					myform.action = "findBookByName";
				} else if (ch2.checked == true) {
					findStr.name = "bookAuthor";
					myform.action = "findBookByAuthor";
				} else if (ch3.checked == true) {
					findStr.name = "bookType";
					if (findBook.value == "文学") {
						findBook.value = 1;
						myform.action = "findBookByType";
					} else if (findBook.value == "小说") {
						findBook.value = 2;
						myform.action = "findBookByType";
					} else if (findBook.value == "励志") {
						findBook.value = 3;
						myform.action = "findBookByType";
					} else if (findBook.value == "历史") {
						findBook.value = 4;
						myform.action = "findBookByType";
					}
				}
				myform.submit();
			}
		</script>
	</form>

</body>
</html>