<%@page import="org.comstudy21.MemberDao"%>
<%@page import="org.comstudy21.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 클라이언트에서 서버로 보낸 파라미터 값을 전달 받는다.
String no = request.getParameter("no");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");

// 파라미터 값을 이용해서 객체 생성.
MemberVo vo = new MemberVo(no, name, email, phone);
// 생성된 vo객체를 Dao에 전달한다.
//MemberDao dao = new MemberDao();
MemberDao.insert(vo);

// 입력이 끝나면 list.jsp로 페이지 전환하기
response.sendRedirect("list.jsp");
%>