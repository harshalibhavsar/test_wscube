<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false"%>
<!doctype html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container mt-5" >
  <div class="container text-center">
  <h1>Registration Form</h1>
  <p>${heading}</p></div>
   <form action="processform" method="post">
   
    <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email"
     class="form-control" 
     id="exampleInputEmail1" 
     aria-describedby="emailHelp" 
     placeholder="Enter email"
     name="email">
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputName1">name</label>
    <input type="name"
     class="form-control"
      id="exampleInputName1" 
      aria-describedby="nameHelp" 
      placeholder="Enter name"
      name="name">
  
  </div>
  <div class="form-group">
    <label for="exampleInputpassword">password</label>
    <input type="password" 
    class="form-control" 
    id="exampleInputPassword"
     aria-describedby="passwordHelp" 
    placeholder="Enter password"
    name="password">
    
  </div>
  <div class=" container text-center">
  <button type="submit" class="btn btn-success">Sign up </button>
  </div>
 <div>
 <h1>name is ${email}</h1>
  <h1>name is ${name}</h1>
   <h1>name is ${password}</h1>
 </div>
   </form>
   </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>