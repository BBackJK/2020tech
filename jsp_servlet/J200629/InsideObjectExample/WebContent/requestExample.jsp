<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example request</title>
</head>
<body>


<% 
	request.setCharacterEncoding("euc-kr");
%>

<%
	String name= request.getParameter("name");
	String studentNumber = request.getParameter("studentNumber");
	String sex = request.getParameter("sex");
	String country = request.getParameter("country");
	
	if (sex.equalsIgnoreCase("man")) {
		sex = "man";
	} else {
		sex = "woman";
	}
%>

<h2> Input Student Information Result</h2>

Name: <%= name %><p>
Student-Number: <%= studentNumber %><p>
Sex: <%= sex %><p>
Country: <%= country %><p>

</body>
</html>