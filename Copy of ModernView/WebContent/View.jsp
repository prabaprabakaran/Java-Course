<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="2">
<c:forEach var="mass" items="${list}">
<tr>
<td><c:out value="${mass.stu_id}"></c:out></td>
<td><c:out value="${mass.stu_name}"></c:out></td>
<td><c:out value="${mass.sal}"></c:out></td>
<td><c:out value="${mass.stu_date}"></c:out></td>
</tr>
</c:forEach>
</table>
<body>

</body>
</html>