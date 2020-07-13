<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP example Score.jsp</title>
</head>
<body>
	<h2>Student name and point saving and checking example using JavaBeans</h2>
	<jsp:useBean id="score" class="javabean.ScoreBean" scope="page" />
	
	<hr>
	<h3>name and point save to JavaBeans ScoreBean</h3>  
	Name: <%= "PJK" %>,
	Point: <%= "85" %><p>
	
	<jsp:setProperty name="score" property="name" value="PJK"/>
	<jsp:setProperty name="score" property="point" value="85"/>
	
	<hr>
	<h3>Checking that saved information to JavaBeans Output</h3>
	Name : <jsp:getProperty name="score" property="name" /><br>
	Point : <jsp:getProperty name="score" property="point" /><br>
</body>
</html>