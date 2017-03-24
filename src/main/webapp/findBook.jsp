<%@page import="com.union.tsw.user.pojo.User"%>
<%@page import="com.union.tsw.book.pojo.Book"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果页</title>
<link rel="stylesheet" type="text/css" href="css/search.css" />
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
	<div id="main">
	<% 
		 List<Book> book = (List<Book>)session.getAttribute("book");
		 for(int j=0 ; j<book.size() ; j++){
	%>
		<dl>
			<dt><a href="findBookByImage?bookImage=<%=book.get(j).getBookImage()%>">
<img src="<%=book.get(j).getBookImage()%>" width="240"></a></dt>
			<dd>
				<p>书名：<%=book.get(j).getBookName() %></p>
				<p>作者：<%=book.get(j).getBookAuthor()%></p>
				<p>出版社：<%=book.get(j).getBookPress()%></p>
			</dd>	

		</dl>

	<div id="fn">
		<br/>
		<form action="insert" method="post" style="display:inline-block;">
			数量:<select name="shoppingcarCount">
				<% 	
					for(int i=1;i<100;i++){
				%>
					<option value="<%=i %>"><%=i %></option>
				<% } %>
			</select>
			<input type="hidden" name="userId" value="<%=user.getUserId() %>" />
			<input type="hidden" name="bookId" value="<%=book.get(j).getBookId() %>" />
			<input type="submit" value="加入购物车" id='cart'/>
			<a href="saveCollection?userId=<%=user.getUserId()%>&bookId=<%=book.get(j).getBookId()%>" id="love">收藏</a>
		</form>
	</div>
	<%
	 	}
	%>
	<footer>
		<p>联系我们：8658741 公司地址：大连市高新园东软信息学院</p>
		<p>京公网安备 11000002000001号 京ICP证030173号 违法和不良信息举报电话：010-59922922</p>
	</footer>
</div>
</body>
</html>
</html>