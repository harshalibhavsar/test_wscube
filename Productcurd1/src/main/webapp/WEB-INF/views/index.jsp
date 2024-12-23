<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<h1>hiii this is index page</h1>

<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome to product</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">S.No</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
<c:forEach items="${product}" var="p">
 <tr>
      <th scope="row">TECH${p.id}</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td class="font-weight-bold">&#x20B9; ${p.price}</td>
      <td><a href="delete/${p.id}"><i class="fas fa-trash text-danger" style="font-size:30px"></i></a>
     <a href="update/${p.id}"><i class="fas fa-pen-nib text-primary" style="font-size:30px"></i></a></td>
      
    </tr>
</c:forEach>
</tbody>
</table>

<div class="container text-center">
<a href="addproduct" class="btn btn-outline-success">Add Product </a>
</div>
</div>

</div>



</div>
</body>
</html>