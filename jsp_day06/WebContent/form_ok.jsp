<%@page import="org.comstudy21.MemberDao"%>
<%@page import="org.comstudy21.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! // 선언부 - 필드, 메소드 선언
%>
<%
// _service() 메소드 내부
// 클라이언트 HTML)에서 전달한 파라미터 값을 받는다.
// 파라미터 값을 이용해서 MemberVo객체 생성
// MemberVo객체를 MemberDao의 insert()에 전달한다.
// list.jsp로 redirect한다.
String no = request.getParameter("no");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");

MemberVo vo = new MemberVo(no, name, email, phone);
System.out.println(vo);
MemberDao.insert(vo);

// 처리가 완료되면 list.jsp로 이동한다.
response.sendRedirect("list.jsp");
%>