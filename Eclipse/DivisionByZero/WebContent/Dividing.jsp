<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    errorPage="errorhandling.jsp" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int n1=Integer.parseInt(request.getParameter("t1"));
int n2=Integer.parseInt(request.getParameter("t2"));

%>
the div is : <%= n1/n2  %>

</body>
</html>