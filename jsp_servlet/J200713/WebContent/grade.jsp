<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP example grade.jsp</title>
</head>
<body>
	<h2>example</h2>
	<% request.setCharacterEncoding("euc-kr"); %>
	<jsp:useBean id="score" class="javabean.GradeBean" scope="page" />
	
	<HR>
	
	<h3>Saving Name and Grade into JavaBeans GradeBean.java</h3>
	Name : <%=request.getParameter("name") %>,
	Point : <%=request.getParameter("point") %><p>
	<jsp:setProperty property="name" name="score" param="name" />
	<jsp:setProperty property="point" name="score" param="point" />
	
	<HR>
	
	<h3>Outputting Saved Data in JavaBean GradeBean</h3>
	Name : <jsp:getProperty name="score" property="name" /> <br>
	Point : <jsp:getProperty name="score" property="point" /> <br>
	Grade : <jsp:getProperty name="score" property="grade" /> <br>
	
</body>
</html>