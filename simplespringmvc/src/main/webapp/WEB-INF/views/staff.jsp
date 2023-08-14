<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.tcgi.simplespringmvc.domain.Employee"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="border:1px blue solid">
<tr><th>Name</th><th>DOB</th>
</tr>
	<%
	Employee e = (Employee) request.getAttribute("e1");
	List l = (List)request.getAttribute("el1");
	for(int i=0;i<l.size();++i){
		Employee tmp = (Employee)l.get(i);
	%>
	
	
	<tr style="border:1px blue solid">
	<td style="border:1px red solid"><%=tmp.getFirstName() %></td>
	<td style="border:1px red solid"><%= tmp.getDob()%></td>
	</tr>
	

<%}%>
</table>

</body>
</html>