<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html>
<body>
<h2>Hello World!</h2>
<h1>login<a href="NewFile">its me</a></h1>
<h1>login<a href="login">its me</a></h1>

<%  String name=(String)request.getAttribute("name");
 String id=(String)request.getAttribute("name");
 List<String> friends=(List<String>)request.getAttribute("f");
%>

<h1>Name is <%=name %></h1>
<h1>id is <%=id %></h1>

<% 
for(String s:friends) {
	%>
	<h1><%=s %></h1>

<% 

}

%>

</body>
</html>
