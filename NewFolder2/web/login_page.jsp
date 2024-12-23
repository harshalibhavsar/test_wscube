<%-- 
    Document   : login_page
    Created on : 2 Feb, 2024, 5:41:44 AM
    Author     : HP
--%>

<%@page import="com.tech.blog.entitites.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="CSS/mystyle.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <style>
        .banner-background{
       clip-path: polygon(50% 0%, 83% 0, 100% 0, 100% 100%, 80% 97%, 51% 100%, 11% 98%, 0 100%, 0 0, 21% 0);


        }
    </style>
    
    </head>
    <body>
        <%@include file="normal_navbar.jsp" %>
        <main calss="d-flex align-items-center primary-background text-white banner-background" style="height: 100vh">
            <div  class="container">
                <div class="row">
                    <div  class="col-md-4  offser-md-4">
                        <div  class="card">
                            <div class="card-header primary-background text-white text-center">
                                <span calss="fa fa-user-plus fa-x3"> </span>
                                <p>
                                    login here
                                </p>
                            </div>
                           <%
                           
                           
                       Message m=(Message)session.getAttribute("msg");
                           if(m!=null){
                              %>
                              
                              <div class="alert <%= m.getCssClass()%>" role="alert">
                              <%=m.getContent()%>
                               
                              </div>
                              
                              <%
                               session.removeAttribute("msg");
                           }
                           %>
                                
                                
                                
                            <div class="card-body">
                  <form  action="LoginServlet" method="post">
 
                                    
      <div class="form-group">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input name="password" required type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="container  text-center mt-3">
   <button type="submit" class="btn primary-background text-white">Submit</button>
  </div>
  
</form>
                            </div>
                        </div> 
                    </div>
                </div>
            </div>
        
        
        
        </main>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!--javascript-->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="JS/myjs.js" type="text/javascript"></script>
    
    </body>
</html>
