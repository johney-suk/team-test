<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public String sX = "300";
	public String sY = "300";
%>
<%
    String x = "0";
	String y = "0";
	String cmd = "v";
	if(request.getParameter("x")!=null && request.getParameter("y")!=null) {
		x = request.getParameter("x");
		y = request.getParameter("y");
	}
	if( request.getParameter("cmd") != null) {
		cmd = request.getParameter("cmd");
	}
	
	if(cmd.equals("c")) {
		sX = x;
		sY = y;
		System.out.printf("%s, %s\n", sX, sY);
	} else if(!x.equals(sX) || !y.equals(sY)) {
%>
{"x":<%=sX %>, "y":<%=sY %>}
<%	} %>