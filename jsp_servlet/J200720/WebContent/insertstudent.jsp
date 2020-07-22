<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DBCP 이용 : 테이블 student 레코드 삽입</title>
</head>
<body>

<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>

<h2>데이터베이스 univdb의 테이블 student에 학생 삽입 프로그램</h2>

<hr><center>
<h2>학생 삽입</h2>

<%
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	StringBuffer SQL = new StringBuffer("insert into student ");
	SQL.append("values (?, ?, ?, ?, ?)");
	String name = "이동준2";
	
	try {
		Context initCtx = new InitialContext();
		Context env = (Context) initCtx.lookup("java:comp/env/");
		DataSource ds = (DataSource) env.lookup("jdbc/mysql");
		con = ds.getConnection();
		
		pstmt = con.prepareStatement(SQL.toString());
		
		// 삽입할 학생 레코드 데이터 입력
		
		pstmt.setString(1, "DBCP");
		pstmt.setString(2, "commons");
		pstmt.setString(3, name);
		pstmt.setString(4, "2020");
		pstmt.setString(5, "201234");
		
		int rowCount = pstmt.executeUpdate();
		
		if (rowCount == 1) out.println("<hr>학생 [" + name + "] 레코드 하나가 성공적으로 삽입되었습니다.<hr>");
		else out.println("학생 레코드 삽입에 문제가 있습니다.");
		
		stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from student;");
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
	while(rs.next()) {
%>
	<tr>
		<td align=center><%= rs.getString(1) %></td>
		<td align=center><%= rs.getString(2) %></td>
		<td align=center><%= rs.getString(3) %></td>
		<td align=center><%= rs.getString(4) %></td>
		<td align=center><%= rs.getString(5) %></td>
	</tr>
<%
	}
	rs.close();
} catch (Exception e) {
	out.println("Mysql 데이터베이스 univdb의 student에 삽입 또는 레코드 조회에 문제가 있습니다. <hr>");
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