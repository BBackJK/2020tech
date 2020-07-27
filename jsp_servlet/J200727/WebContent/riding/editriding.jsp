<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라이딩 게시판</title>
</head>
<body>
<script language=JavaScript src="ridingform.js"></script>

<%@ page import = "riding.*" %>
<%
	String todo="";
	String bossChallenger = "";
	int maxPerson = 1;
	int curPerson = 1;
	String content = "";
	String money = "";
	String headline = "등록";
	
	String id = request.getParameter("id");
	if (id != null) {
		int idnum = Integer.parseInt(id);
		RidingDBCP ridingdb = new RidingDBCP();
		RidingEntity rider = ridingdb.getSelectList(idnum);
		
		todo = rider.getTodo();
		bossChallenger = rider.getBossChallenger();
		maxPerson = rider.getMaxPerson();
		curPerson = rider.getCurPerson();
		content = rider.getContent();
		money = rider.getMoney();
		headline = "수정 / 삭제";
	};
%>

<h2>게시판 <%=headline %></h2><hr>

<center>
<form name=ridingform method=post action="processriding.jsp">
	<input type=hidden name="menu" value="insert">
	<input type=hidden name="id" value="<%=id %>">
	<input type=hidden name="curPerson" value="<%=curPerson %>">
	
<table width="100%" border = 0 cellspacing=0 cellpadding=7>
	<tr>
		<td align=center>
			<table border = 0>
				<tr>
					<td colspan=2>
						<table>
							<tr>
								<td width=50>주최자</td>
								<td width=100>
									<input type=text name=bossChallenger value="<%=bossChallenger %>" size=30 maxlength=20>
								</td>
								
								<td width=200>인원 (현재 인원/최대 인원) </td>
								<td width=250>
									<%=curPerson %> / <input type="number" name=maxPerson value="<%=maxPerson%>">
								</td>
							</tr>
							<tr>
								<td width=50>할 일</td>
								<td colspan=3>
									<input type=text name=todo value="<%=todo%>" maxlength=100>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan=2>
						<textarea name=content rows=10 cols=90><%=content %></textarea>
					</td>
				</tr>
				
				<tr>
					<td colspan=2> 회비
						<input type=text name=money value="<%=money%>">
					</td>
				</tr>
				<tr>
					<td colspan=2 height=5><hr size=2></td>
				</tr>
				<tr>
					<td colspan=2>
					<%
						if (id == null) {
					%>
						<input type=button value="등록" onClick="insertCheck()">
					<%
						} else {
					%>
						<input type=button value="수정" onClick="updateCheck()">
						<input type=button value="삭제" onClick="deleteCheck()">
					<%
						}
					%>
					
						<input type=button value="목록보기" onClick="location.href='listriding.jsp'">
						<input type=reset value="reset">
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</form>
</center>

</body>
</html>