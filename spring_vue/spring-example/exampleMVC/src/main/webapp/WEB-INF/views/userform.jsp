<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib url="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib url="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib url="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User 정보 입력</title>
</head>
<body>
	
<p>사용자 정보 입력</p>
<form:form modelAttribute="user">
	<fieldset>
		<form:label path="username">Name</form:label>
		<form:input path="username" type="text" />
	</fieldset>
	<fieldset>
		<form:label path="email">Email</form:label>
		<form:input path="email" type="text" />
	</fieldset>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>