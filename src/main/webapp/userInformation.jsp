<%@page import="com.union.tsw.user.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Object obj = session.getAttribute("user");
		User user=null;
			if (obj != null) {
				user = (User) obj;
	%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
		out.print("Hi," + user.getUserName() + " 欢迎回淘书！");
	%>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="logout">登出</a>
	<a href="userInformation.jsp">会员中心</a>
	<%
		} else {
	%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%
		out.print("Hi,会员  欢迎回淘书！");
	%>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%
		}
	%>
	<br />
	<a href="index.jsp"><img alt="logo" src="images/logo/logo.jpg" height="100" weight="60"></a>
	<form method="post" action="changeUser">
	ID:<input type="text" name="UserId" id="UserId"></br>
	昵称：<input type="text" name="userName" id="userName" value="${param.userName}" /></br>
	头像：<input type="text" name="userImage" id="userImage" value="${param.userImage}"/></br>
	密码：<input type="text" name="userPassword" id="userPassword" value="${param.userPassword}"/></br>
	确认密码：<input type="text" name="userPasswrdAgain" id="userPasswrdAgain" /></br>
	年龄：<input type="text" name="userAge" id="userAge" value="${param.userAge}" /></br>
	性别：<input type="text" name="userSex" id="userSex" value="${param.userSex}"/></br>
	地址：<input type="text" name="userAdrr" id="userAdrr" value="${param.userAdrr}"/></br>
	注册日期：<input type="text" name="userTime" id="userTime" value="${param.userTime}"/></br>
	邮箱：<input type="text" name="userEmail" id="userEmail" value="${param.userEmail}"/></br>
	电话号码：<input type="text" name="userTel" id="userTel" value="${param.userTel}"/></br>
	<input type="submit" value="确认更改"><br/></br>
	<a href="findByIdShoppingcar?userId=<%=user.getUserId()%>">我的购物车</a><br>
	<a href="findCollectionByUserId?userId=<%=user.getUserId() %>">❤我的收藏</a><br>
	<a href="findAllOrderformByUserId?userId=<%=user.getUserId()%>">我的订单</a><br>
	<a href="index.jsp">返回首页<br/></a>
</body>
</html>