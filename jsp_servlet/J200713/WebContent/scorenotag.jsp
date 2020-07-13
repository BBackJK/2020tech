<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP example scorenotag.jsp</title>
</head>
<body>
	<h2>Don't using tag in example using JavaBeans</h2>
	<% javabean.ScoreBean score = new javabean.ScoreBean(); %>  
	
	<HR>
	<h3>Name and Score saving to JavaBeans ScoreBean</h3>
	Name : <%= "PJK" %>,
	Score : <%= "85" %><p>
	<% score.setName("PJK"); %>
	<% score.setPoint(85); %>
	
	<HR>
	<h3>Output Checking to information that saved JavaBeans ScoreBean</h3>
	Name : <% out.println(score.getName()); %><br>
	Score : <% out.println(score.getPoint()); %>
</body>
</html>