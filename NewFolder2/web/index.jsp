<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
    clip-path: polygon(52% 0, 100% 0, 100% 100%, 41% 100%, 93% 93%, 0 100%, 0 0);





}
    </style>
    </head>
    <body>
       
            
            
            
            <!--navbar-->
            <%@include file="normal_navbar.jsp"%>
            <!-- banner-->
            <div class="container-fluid p-0 m-0">
                <div class="jumbotron secondary_background text-white banner-background">
                    <div class="container">
                        
                   
                    <h3 class="display-3"> Welcome to Our Blogs</h3>
                    
                    <P>
                        Whether you want to develop a mobile application, get certification for programming knowledge, or learn new skills, you need to learn the right programming language. Below you’ll learn about the best programming languages in demand among employers in 2024.
                    </P>
                    <p>
                        Programming languages consist of a set of rules that allows string values to be converted into various ways of generating machine code, or, in the case of visual programming languages, graphical elements.
                    </p>
                   <button class="btn btn-outline-light btn-lg"> <span class="fa fa-user-plus"> </span>Start ! with free</button>
                   <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span>Login</a>
                    </div>
                </div>
            </div>
            
            <br>
            <br>
            <br>
             <!--cards-->   
             <div class="container">
             <div class="row mb-2"><!--first row -->
                     <!--firstcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">Java Programming </h5>
    <p class="card-text">Java is a popular, versatile, and powerful programming language widely used for building web applications, mobile apps, enterprise software, and more. If you're new to Java programming or looking for guidance, here's an overview and some key points to help you get started:</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                     
                     
                     
                      <!--2ndcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">Python Programming </h5>
    <p class="card-text">Python is a powerful, easy-to-learn programming language that has become one of the most popular languages due to its readability, versatility, and vast ecosystem of libraries. It's widely used in web development, data science, artificial intelligence, automation, and many other fields</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                      
                       <!--3rdcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">GoLang Programming </h5>
    <p class="card-text">Go (also known as Golang) is a statically typed, compiled programming language designed by Google. It is known for its simplicity, efficiency, and strong support for concurrent programming. Go is widely used for building scalable, high-performance applications, especially for backend systems, cloud services, and microservices.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                       
                       
              </div>
                 
                 
                 
                  <div class="row mb-4"><!--2nd row-->
                     <!--firstcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">Node.js Programming </h5>
    <p class="card-text">Node.js is a runtime environment that allows you to run JavaScript on the server side. It is built on Chrome's V8 JavaScript engine and is known for its non-blocking, event-driven architecture, making it ideal for building scalable and efficient applications, particularly for real-time web apps and APIs.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                     
                      <!--2ndcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">SpringBoot Framework</h5>
    <p class="card-text">Spring Boot is a framework built on top of the Spring Framework, designed to simplify the setup and development of Java applications. It is an open-source framework that allows developers to create stand-alone, production-grade Spring-based applications with minimal effort. It does this by embedding servers (like Tomcat, Jetty, or Undertow) and reducing the complexity of configuration. </p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                      
                      
                      
                      
                      <!--3rdcol-->
                  <div class="col-md-4">
                         <div class="card" >
                 
            <div class="card-body">
    <h5 class="card-title">Linux Programming </h5>
    <p class="card-text">Linux programming refers to the practice of developing software applications that run on Linux-based operating systems. These applications can be command-line tools, system utilities, daemons, or graphical applications, all of which interact with the operating system's features, such as file systems, network protocols, memory management, and hardware access.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
              </div>
                 </div>
                  </div>
                       
                       
                       
             </div>  
             <br>
             <br>
        
        <!--javascript-->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="JS/myjs.js" type="text/javascript"></script>
    
    
       
    </body>
</html>
