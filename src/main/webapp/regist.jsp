<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/register.css" />
</head>
<body>
<form action="saveUser" method="post">
	<div id="box">
		<header>
			<div id="logo">
				<a href="index.jsp"><img src="img/logo.jpg"/></a>
			</div>
		</header>
		<div id='login_box'>
			<div class="title">
				注 册
			</div>
			<div id="main">
				姓名:<input name="userName" type="text" value="zhangsan"> <br/>
				密码:<input name="userPassword" type="password" value="123"><br/>
				年龄:<input name="userAge" type="text" value="10"> <br/>
				性别:<input name="userSex" type="text" value="n"><br/>
				地址:<input name="userAddress" type="text" value="abc@123.com"><br/>
				邮箱:<input name="userEmail" type="text" value="abc@123.com"><br/>
				电话号码:<input name="userPhone" type="text" value="123456"><br/>
				<input type="checkbox" />我已阅读并同意<淘书网交易条款>
			</div>
			<input type="submit" value="注 册" />
		</div>
	</div>
</form>
</body>
</html>