<%@page import="health.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
    
<%@ page import = "health.UserDAO" %>
<%@ page import="java.io.PrintWriter"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id = "user" class ="health.User" scope ="page" />
<jsp:setProperty name= "user" property ="userID" />
<jsp:setProperty name= "user" property ="userPassword" />

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">

<title>관리자 로그인 액션</title>

</head>


<body>
<%
	UserDAO userDAO = new UserDAO();
	int result = userDAO.login(user.getUserID(), user.getUserPassword());
	if (result ==1){
		PrintWriter script = response.getWriter();
		script.print("<script>");
		script.print("location.href = 'search.jsp'");
		script.print("</script>");
	}
	else if (result == 0){
		PrintWriter script = response.getWriter();
		script.print("<script>");
		script.print("alert('패스워드가 틀립니다')");
		script.print("</script>");
	}
	else if (result ==-1){
		PrintWriter script = response.getWriter();
		script.print("<script>");
		script.print("alert('아이디가 틀립니다')");
		script.print("</script>");
	}
	else if (result ==2){
		PrintWriter script = response.getWriter();
		script.print("<script>");
		script.print("alert('오류가 발생 했습니다')");
		script.print("</script>");
	}
%>
 
	
</body>
</html>