<%@page import="java.util.List"%>
<%@page import="org.comstudy21.MemberDao"%>
<%@page import="org.comstudy21.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 100%;
}
table, tr, td, th {
	border: 1px solid #444;
	color : #444;
	border-collapse: collapse;
}
th:nth-child(1) {width: 10%;}
th:nth-child(2) {width: 30%;}
th:nth-child(3) {width: 30%;}
th:nth-child(4) {width: 30%;}
</style>
</head>
<body>

<h1>::: 회원 목록 :::</h1>
<table>
	<tr>
		<th>NO</th>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>PHONE</th>
	</tr>
<%
List<MemberVo> list = MemberDao.selectAll();
for(int i=0; i<list.size(); i++) {
	MemberVo member = list.get(i);
%>
	<tr>
		<td><%=member.getNo() %></td>
		<td><a href="detail.jsp?no=<%=member.getNo() %>"><%=member.getName() %></a></td>
		<td><%=member.getEmail() %></td>
		<td><%=member.getPhone() %></td>
	</tr>
<%}// end of for %>
</table>
<a href="form.html">회원 정보 입력</a>

</body>
</html>