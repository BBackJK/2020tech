<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jsp example get cookies</title>
</head>
<body>
	<h1>cookies checking example</h1>  
	
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
	
		if (cookies == null) {
			out.println("Don't exist Cookie");
		} else {
			for (Cookie c : cookies) {
				out.println("cookie name : " + c.getName() + ", ");
				out.println("cookie value : " + c.getValue() + "<br>");
			}
		}
	%>
</body>
</html>