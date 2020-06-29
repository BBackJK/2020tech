<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example out.jsp</title>
</head>
<body>

	<%
		out.println("Not print here");
		out.clear();
	%>
	
	<h2>Out Buffer Status of this page.</h2>  
	
	original out buffer size : <%= out.getBufferSize() %>byte<p>
	remain out buffer size : <%= out.getRemaining() %>byte<p>
	auto Flush: <%= out.isAutoFlush() %><p>
	
</body>
</html>