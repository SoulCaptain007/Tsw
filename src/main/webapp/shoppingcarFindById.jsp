<%@page import="com.union.tsw.user.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>精确查询</title>
</head>
<body>
	<%
		Object obj = session.getAttribute("user");
		if (obj != null) {
			User user = (User) obj;
			%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
			out.print("Hi," + user.getUserName() + " 欢迎回淘书！");
	%>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="logout">登出</a>
	<a href="userInformation.jsp">会员中心</a>
	<%
		} else {
			%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
			out.print("Hi,会员  欢迎回淘书！");
	%>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="userLogin.jsp">登录</a>
	<a href="regist.jsp">注册</a>
	<%
		}
	%>
	
	<form method="get" action="findByIdShoppingcar">
		<table>
			<tr>
				<td>ID</td>
				<td>
				<% 
					Object obj1 = session.getAttribute("user");
					if (obj1 != null) {
					User user1 = (User) obj1;
				%>
				<input type="hidden" name="userId" value="<%=user1.getUserId()%>"/>
				<%
					}
				%>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="查询" ></td>
			</tr>
		</table>
	</form>
	
	<!-- <div id="box"></div>
	
<script type="text/javascript">
	var id = document.getElementById("user_id");
	
	
	function findByIdUser(){
		var xmlHttp = null;
		
		if(window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
		}else{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		xmlHttp.onreadystatechange = function(){
			if(xmlHttp.status == 200 && xmlHttp.readyState == 4){
				var box = document.getElementById("box");
				box.innerHTML = xmlHttp.responseText;
			}
		}
	
		xmlHttp.open("get", "findByIdShoppingcar?id="+id.value, true);
		xmlHttp.send();
	}
	

</script>	 -->
</body>
</html>






