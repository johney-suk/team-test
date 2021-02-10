<%@page import="org.comstudy21.MemberDao"%>
<%@page import="org.comstudy21.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String no = request.getParameter("no");
MemberDao.delete(new MemberVo(no));

response.sendRedirect("list.jsp");
%>