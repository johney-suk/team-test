<%@page import="org.comstudy21.MemberVo"%>
<%@page import="org.comstudy21.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String no = request.getParameter("no");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");

MemberDao.modify(new MemberVo(no, name, email, phone));
response.sendRedirect("detail.jsp?no="+no);
%>