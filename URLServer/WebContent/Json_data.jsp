<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String user = request.getParameter("user");
String message = request.getParameter("message");

String str = String.format("{user:%s, message:%s}", user, message);
%>
<%=str%>