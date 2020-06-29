<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example pageContextExample.jsp</title>
</head>
<body>
	<h2> page context example</h2>  
	
	<%
		pageContext.getOut().println("adding include.html");
	%>
	<hr>
	<%
		pageContext.include("includeExample.html");	
	%>
</body>
</html>