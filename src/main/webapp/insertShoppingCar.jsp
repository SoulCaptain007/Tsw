<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"/> 
	<title>MAVEN-SSM</title>
</head>
<body>
<!-- <button id="btn" onclick="findAllShoppingcar()">我的购物车</button> -->
<form method="post" action="insert">
	商品数量：<input type="text" name="shoppingcarCount" id="shoppingcarCount"/></br> -->
	用户ID：<input type="text" name="userId" id="userId"/></br>
	图书ID：<input type="text" name="bookId" id="bookId"/></br>
	<input type="submit" value="添加到购物车">
</form>

<!-- <div id="box">

</div>
<script type="text/javascript">
	var un = document.getElementById("btn");
	
	function findAllShoppingcar(){
	var xmlHttp = null;
	
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	xmlHttp.onreadystatechange = function(){
		if(xmlHttp.status == 200 && xmlHttp.readyState == 4){
			var box = document.getElementById("box");
			var user = eval("("+xmlHttp.responseText +")");
			
			for(var i=0;i<user.length;i++)
			{
				/* box.innerHTML += "shoppingcarId=" + user[i]["shoppingcarId"]
				+ ", shoppingcarCount=" + user[i]["shoppingcarCount"]
				+ ", shoppingcarState=" + user[i]["shoppingcarState"]
				+ ", userId="+ user[i]["userId"] + ", bookId=" + user[i]["bookId"]; */
				
			}
			
		}
	}
	
	xmlHttp.open("get", "findAllShoppingcar", true);
	xmlHttp.send();
}
	
	
</script>	 -->
</body>
</html>