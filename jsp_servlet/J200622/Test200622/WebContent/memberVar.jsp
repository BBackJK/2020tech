<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 예제 member var</title>
</head>
<body>
	<% int i = 0; %>
	[지역 변수] i = <%= ++i%>
	<p>
	[소속 변수] memi = <%= ++memi %>
	<%! int memi = 0; %>	
</body>
</html>