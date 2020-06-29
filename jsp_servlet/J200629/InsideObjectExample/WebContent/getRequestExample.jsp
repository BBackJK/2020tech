<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example get request </title>
</head>
<body>

<h2> korean in GET method</h2>  
<hr>
korea name : <%= request.getParameter("korname") %><p>
english name : <%= request.getParameter("engname") %><p>

</body>
</html>