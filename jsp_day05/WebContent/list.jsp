<%@page import="org.comstudy21.MemberVo"%>
<%@page import="org.comstudy21.MemberDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>고객 정보 목록</h1>
<table border="1" width="100%">
<%
// Dao에서 ArrayList 목록 객체를 받아서 출력한다.
List memList = MemberDao.selectAll();
for(int i=0; i<memList.size(); i++) {
   MemberVo member = (MemberVo)memList.get(i);
%>
   <tr>
      <td><%=member.getNo() %></td>
      <td><%=member.getName() %></td>
      <td><%=member.getEmail() %></td>
      <td><%=member.getPhone() %></td>
   </tr>
<%
} // end of for
%>
</table>
<a href="form.html">회원등록</a>

</body>
</html>