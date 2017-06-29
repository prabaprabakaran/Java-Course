<%@page import="com.jsp.jspone"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="mathi" uri="http://training.org/one-taglib" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OneTag</title>
</head>
<body>

<%
List<jspone> em=new ArrayList<>();
for(int i=0;i<5;i++){
	jspone emp=new jspone();
	emp.setId(12+i);
	emp.setName("Mathi");
	em.add(emp);
}
request.setAttribute("li",em);
%>
<mathi:New data='<%=em %>'/>
${requestScope.li[0].name }
</body>
</html>