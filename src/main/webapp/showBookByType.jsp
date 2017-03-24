<%@page import="java.util.List"%>
<%@page import="com.union.tsw.book.pojo.Book"%>
<%@page import="com.union.tsw.user.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/main.js" type="text/javascript" charset="utf-8"></script>
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
		<!--导航部分-->
		<%
			List<Book> book = (List<Book>)session.getAttribute("books");
		%>
		<nav>
			<ul>
				<li>
				<% 
					String bookType = book.get(0).getBookType();
					if("1".equals(bookType)){
						out.println("文学");
					}else if("2".equals(bookType)){
						out.println("小说");
					}else if("3".equals(bookType)){
						out.println("励志");
					}else if("4".equals(bookType)){
						out.println("历史");
					}
				%>
				</li>
			</ul>
		</nav>

		<!--页面主体部分开始-->
		<div id="main">
			<div id="showImg">
				<% 
					for(int i = 0;i<book.size();i++){
				%>
					<a href="findBookByImage?bookImage=<%=book.get(i).getBookImage()%>">
					<img src="<%=book.get(i).getBookImage()%>"/>
					</a>
				<% } %>
			</div>
		</div>
		<!--页脚开始-->
		<footer>
			<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
			<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
		</footer>
	</div>
	
</body>
</html>