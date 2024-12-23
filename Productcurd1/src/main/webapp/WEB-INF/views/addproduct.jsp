<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<%@include file="./base.jsp" %>
<link rel="stylesheet" href=""/>
</head>
<body background="download.jpg">

<div class="conyainer mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center md-3">Fill the product details</h1>
<form action="handel-product" method="post">
<div class="form-group">
<label for="name">Product name</label>
<input type="text"
 class="form-control"
  id="name" 
  aria-describedby="emailHelp"
   name="name" 
   placeholder="enter the product name here">
</div>

<div class="form-group">
<label for="name">Product Discription</label>
<textarea
 class="form-control" 
 rows="5" 
 id="description"
 name="description" 
   placeholder="enter the product description here"></textarea>
</div>

<div class="form-group">
<label for="name">Product price</label>
<input type="text"
 class="form-control" 
 id="price" 
 aria-describedby="emailHelp"
  name="price" 
  placeholder="enter the product price here">
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath}/"
class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>
</div>

</div>
</div>



</body>
</html>