<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.union.tsw.orderform.pojo.Orderform"%>   
  <%@page import="com.union.tsw.user.pojo.User"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
		Object obj = session.getAttribute("user");
		User user = (User) obj;
	%>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%
		out.print("Hi," + user.getUserName() + " 欢迎回淘书！");
	%>
	<br />
	<a href="index.jsp"><img alt="logo" src="images/logo/logo.jpg" height="100" weight="60"></a>
	<br/><br/>
	<h2>支付成功！</h2>
</body>
</html>