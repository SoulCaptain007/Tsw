<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"/> 
	<title>MAVEN-SSM</title>
</head>
<body>
<button id="btn" onclick="findAll()">查找</button>
<a href="userInformation.jsp"><button>我的</button></a>
<div id="box"></div>
<script type="text/javascript">
	var un = document.getElementById("btn");
	
	
	function findAll(){
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
				box.innerHTML += "userId=" + user[i]["userId"] + ", userName=" + user[i]["userName"]
				+ ", userPassword=" + user[i]["userPassword"] + ", userAge=" + user[i]["userAge"]
				+ ", userSex=" + user[i]["userSex"] + ", userAddress=" + user[i]["userAddress"]
				+ ", userDate=" + user[i]["userDate"]+ ", userEmail=" + user[i]["userEmail"]
				+ ", userMoney=" + user[i]["userMoney"] + ", userPhone=" +user[i]["userPhone"]
				+ ", userState=" + user[i]["userState"] + ", userImage="
				+ user[i]["Arrays.toString(userImage)"];
			}
			
		}
	}

	xmlHttp.open("get", "findAll", true);
	xmlHttp.send();
}
	
	
</script>	

</body>
</html>