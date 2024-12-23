<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="org.springframework.format.datetime.joda.LocalDateTimeParser"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<% 

/*String name=(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/

%>
 <h1>this is help page my name is ${name}
<%-- <%=name %> --%></h1>
<h1>roll no is ${rollnumber } <%--<%=rollnumber %> --%></h1>
<h1>date and time is  ${time}<%--<%=time.toString() %> --%></h1>
<h1>hello</h1> 
<hr/>
<c:forEach var="item" items="${marks }">
<h1>${item}</h1>
</c:forEach>

</body>
</html>