<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 예제 : 테이블 student name으로 조회</title>
</head>
<body>

<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8"); %>

<h2>테이블 student에서 이름으로 조회하는 프로그램</h2>
<hr><center>

<h2>학생정보 조회</h2>

<%
	Connection con = null;
	PreparedStatement pstmt = null;
	String drivername = "com.mysql.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/univdb";
	String sql = "select * from student where name like ?";
	String name = request.getParameter("sname") + "%";
	int rowCount = 0;
	
	try {
		Class.forName(drivername);
		con = DriverManager.getConnection(dbURL, "root", "test");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		System.out.println(pstmt);
		ResultSet result = pstmt.executeQuery();
%>

	<table width=100% border=2 cellpadding=1>
	<tr>
		<td align=center><b>아이디</b></td>
		<td align=center><b>암호</b></td>
		<td align=center><b>이름</b></td>
		<td align=center><b>입학년도</b></td>
		<td align=center><b>학번</b></td>
	</tr>	
	
<%
		while(result.next()) {
			
%>
		<tr>
			<td align=center><%= result.getString(1) %></td>
			<td align=center><%= result.getString(2) %></td>
			<td align=center><%= result.getString(3) %></td>
			<td align=center><%= result.getString(4) %></td>
			<td align=center><%= result.getString(5) %></td>
		</tr>
<%
		}
		result.close();
	} catch (Exception e) {
		out.println("Mysql 데이터베이스 univdb의 student 조회에 문제가 있습니다. <hr>");
		out.println(e.toString());
		e.printStackTrace();
	} finally {
		if (pstmt != null) pstmt.close();
		if (con != null) con.close();
	}
%>
	</table>
</center>

</body>
</html>


