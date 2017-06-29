<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.jsp.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>
<jsp:useBean id="emp1" class="com.jsp.jspone" scope="request" ></jsp:useBean>
<jsp:setProperty property="id" name="emp1" value="900" />
<jsp:getProperty property="id" name="emp1" />
</h1>
</body>
</html>