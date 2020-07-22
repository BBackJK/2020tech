<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 자바 빈즈 예제 : 테이블 Student 조회</title>
</head>
<body>

<%@ page import="java.util.ArrayList, univ.StudentEntity" %>

<h2>자바 빈즈 StudentDatabase를 이용한 테이블 student 조회 프로그램</h2>
<hr><center>
<h2>학생 정보 조회</h2>
	<jsp:useBean id="stdtdb" class="univ.StudentDatabase" scope="page" />
<%
	ArrayList<StudentEntity> list = stdtdb.getStudentList();
	int counter = list.size();
	if (counter > 0) {
%>
		<table width=100% border=2 cellpadding=1>
		<tr>
			<td align=center><b>아이디</b>
			<td align=center><b>암호</b>
			<td align=center><b>이름</b>
			<td align=center><b>입학년도</b>
			<td align=center><b>학번</b>
		</tr>
<%
		for (StudentEntity stdt : list) {
%>
		<tr>
			<td align=center><%= stdt.getId() %></td>
			<td align=center><%= stdt.getPasswd() %></td>
			<td align=center><%= stdt.getName() %></td>
			<td align=center><%= stdt.getYear() %></td>
			<td align=center><%= stdt.getSnum() %></td>
		</tr>
<%
		}
	}
%>
</table>
</center>

<p><hr> 조회된 학생 수가 <%= counter %> 명 입니다.
</body>
</html>