<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.tcgi.simplespringmvc.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee e = (Employee) request.getAttribute("e1");
	for(int i=0;i<5;++i){
	%>
	
	<h2><%=e.getFirstName()%></h2>
	<h2><%=e.getDob()%></h2>

<%}
	%>

</body>
</html>