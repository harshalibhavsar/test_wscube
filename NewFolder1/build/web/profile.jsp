
<%@page import="com.tech.blog.entitites.Message"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entitites.Catagory"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.entitites.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<%

        User user= (User)session.getAttribute("currentUser");
if(user==null){
    response.sendRedirect("login_page.jsp");
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="CSS/mystyle.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .banner-background{
        clip-path: polygon(50% 0%, 83% 0, 100% 0, 100% 100%, 80% 97%, 51% 100%, 11% 98%, 0 100%, 0 0, 21% 0);



        }
        body{
            background: url(img/download.jpg);
            background-attachment: fixed;
            background-size: cover;
        }
        
    </style>
        <!--navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark primary_background">
  <div class="container-fluid">
      <a class="navbar-brand" href="index.jsp"><span class="fa fa-asterisk"></span>Our Technical Blog</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#"><span class="fa fa-bell-o"> </span>Learn cide with durgesh</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              <span class="fa fa-check-square-o"></span> Our Categories
          </a>
           <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Coding Language</a></li>
            <li><a class="dropdown-item" href="#">Project Debugging </a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Data Structure</a></li>
            <li><a class="dropdown-item" href="#">Algorithm</a></li>
             <li><a class="dropdown-item" href="#">Machine Learning</a></li>
            
          </ul>
        </li>
         <li class="nav-item">
             <a class="nav-link" href="#"> <span class="fa fa-address-o"></span> Contact With Us</a>
        </li>
        
         
         <li class="nav-item">
             <a class="nav-link" href="#" data-bs-toggle="modal" data-bs-target="#add-post-modal"> <span class="fa fa-asterisk"></span>DO POST</a>
        </li>
        
      </ul>
        <ul  class="navbar-nav mr-right">
            <li class="nav-item">
                <a class="nav-link" href="#!" data-bs-toggle="modal" data-bs-target="#profile-modal"> <span class="fa fa-user-circle"></span><%= user. getName()%></a>
        </li>
            
            <li class="nav-item">
             <a class="nav-link" href="LogoutServlet"> <span class="fa fa-user-plus"></span>Logout</a>
        </li>
            
        </ul>
    </div>
  </div>
</nav>
        <!--end of nav bar-->
         <%
                           
                           
                       Message m=(Message)session.getAttribute("msg");
                           if(m!=null){
                              %>
                              
                              <div class="alert <%= m.getCssClass() %>" role="alert">
                              <%=m.getContent()%>
                               
                              </div>
                              
                              <%
                               session.removeAttribute("msg");
                           }
                           %>
       
        <br>
       
            <!--end of message-->
        <!--main body of the page -->    
           
        <main>
            <div class="container">
                <div  class="row mt-4">
                    <!--first col-->
                    <div  class="col-md-4">
                        <!--this is for catagories-->
                        <div class="list-group">
  <a href="#" onclick="getPosts(0),this" class="list-group-item  c-link list-group-item-action active" aria-current="true">
   All Posts 
  </a>
                            <!--Catagories ko get krna hai yha pe jsp page pe to java me likhna hota hai to post ki catagories lena hai vo post dao me hai to class ka object and function  banana pdt ahai call  krna pdta hai  -->
                            <%
                               PostDao dao=new PostDao(ConnectionProvider.getConnection() ) ;//yaha pe sare catagories leliya tha 
                             ArrayList<Catagory> list1=dao.getAllCatagories();
                             for(Catagory cc:list1){//jisbhi catagoriey ke name pe click krege vo usse related post dikhaye vese bhi hmare pass call ing hai ki getpost ki to click pe vo lga do  
                                 %>
                                 <a href="#" onclick="getPosts(<%=cc.getCid()%>,this)" class="c-link list-group-item list-group-item-action"><%=cc.getName()%> </a>
                           <!--means yaha pe click krte hi usee releted posts aajaye  and and us post me  -->
                           <!--to sare post thodi dikhana hai to specific dikhana hai na to us catagoriey ke hisab se mtlb usko jo id ka no he uske hisab se dikhana pdega  -->
                           <!--accourding to this catid   t design ka code profile pe hai and -->
                             <%
}
                              %>
 
 
             </div>
                    </div>
                    <!--second call-->
                    <div class="col-md-8">
                        <!--this is for post-->
                        
                        <div class="container text-center" id="loader">
                            <i class="fa fa-refresh fa-4x fa-spin"></i>
                            <h3 class="mt-2">
                                Loading.........
                            </h3>
                        </div>
                        
                        <div class="container-fluid" id="post-container">
                            
                        </div>
                        
                    </div>
                </div>
                </div>
                
        </main>
            
            
            
            
            
         <!--end of main body of the page -->   
      <!--profile model-->       
<!-- Modal -->
<div class="modal fade" id="profile-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header  primary_background  text-white">
          <h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
          <div class="container text-center">
              <img src="pics/<%= user.getProfile()%>" class="img-fluid"  style="border-radius: 50%; max-width: 150px;">
        <h5 class="modal-title" id="exampleModalLabel"><%= user.getName()%></h5>
        
        
        <!--details-->
<div id="profile-details">
        
 <table class="table">
  
  <tbody>
    <tr>
      <th scope="row">ID:</th>
      <td><%= user.getId()%></td>
      
    </tr>
    <tr>
      <th scope="row">Email:</th>
      <td><%= user.getEmail()%></td>
     
    </tr>
    <tr>
      <th scope="row">Gender:</th>
      <td colspan="2"><%= user.getGender()%></td>
      
    </tr>
     <tr>
      <th scope="row">Status:</th>
      <td colspan="2"><%= user.getAbout()%></td>
      
    </tr>
    <tr>
      <th scope="row">Registered on:</th>
      <td colspan="2"><%= user.getDateTime().toString()%></td>
      
    </tr>
     
  </tbody>
</table>
  </div>     
      <!--profile edit-->
      <div id="profile-edit" style="display: none;">
          <h2>
              please edit carefully
          </h2>
          <form action="EditServlet"  method="post"  enctype="multipart/form-data">
              <table  class="table">
                  <tr>
                      <td>Id:</td>
                      <td><%=user.getId()%></td>
                  </tr>
                   <tr>
                      <td>Email:</td>
                      <td><input type="email"  class="form-control" name="user_email" value="<%=user.getEmail()%>"></td>
                  </tr>
                  <tr>
                      <td>Name:</td>
                      <td><input type="name"  class="form-control" name="user_name1" value="<%=user.getName()%>"></td>
                  </tr>
                  <tr>
                      <td>Password:</td>
                      <td><input type="password"  class="form-control" name="user_password" value="<%=user.getPassword()%>"></td>
                  </tr>
                  <tr>
                      <td>Gender:</td>
                      <td><input type="gender"  class="form-control" name="user_gender" value="<%=user.getGender()%>"></td>
                  </tr>
                   <tr>
                      <td>About:</td>
                      <td>  <textarea class="form-control"  name="user_about">
                       <%= user.getAbout()%>
                   </textarea>
                      </td>
                  </tr>
                  
                  <tr>
                      <td>Select profile:</td>
                      <td> <input type="file" name="image" calss="form-control">
                      
                  
                      </td>
                  </tr>
              </table>
                   
                   <div class="container">
                       <button  type="submit" class="btn btn-outline-primary">Save</button>
                   </div>
          </form>
      </div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button  id="edit-profile-button"  type="button" class="btn btn-primary">Edit</button>
      </div>
    </div>
  </div>
</div>
    <!--end of profile model-->     
    
    <!--add post model-->
    
   


<!-- Modal -->
<div class="modal fade" id="add-post-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Provide the post Details....</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
          <div class="container">
              <form id="add-post-form" method="post" action="AddPostServlet">
                  
                  <div class="form-group">
                   <select class="form-control" name="cid">
                       <option selected desiabled>......Select Category.......</option> 
                       
                       <%
                       PostDao postd=new PostDao(ConnectionProvider.getConnection());
                    ArrayList<Catagory> list= postd.getAllCatagories();
                          for(Catagory c:list)
                          {
                              
                       %>
                       
                       <option  value="<%= c.getCid()%>"><%= c.getName()%></option> 
                          
                          <%
                          }
%>
                  </select>
                  </div>
                  <br>
                  <div>
                      <input   name="pTitle" type="text" placeholder="Enter post Title" class="form-control"/>
                      </div>
                  <br>
                   <div class="form-group">
                       <textarea name="pContent" placeholder="Enter your content" style="height:300px ;width:300px"  calss="form-control"> </textarea>  
                  </div> 
                  <br>
                  <div class="form-group">
                     <textarea name="pCode"  placeholder="Enter your program (if any)"  style="height:300px;width:300px" calss="form-control"> </textarea>  
                  </div>
                  <br>
                  <div class="form-group ">
                      <label>Select  your pic</label>
                      <br>
                      <input type="file" name="pic" >   
                  </div>
                  
                  <div class="conatiner text-center">
                      <button type="submit"  class="btn btn-outline-primary">Post</button>
                  </div>
                  
                  
              </form>
       </div>
      </div>
           
    </div>
  </div>
</div>
    
    
    <!---->
    <!--javascript-->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
       <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="JS/myjs.js" type="text/javascript"></script>
        
        
        <script>
            $(document).ready(function(){
                
                let editStatus =false;//for checking
                 $('#edit-profile-button').click(function(){
                    if(editStatus==false){
                        
               // alert("buuton clicked")
                   $("#profile-details").hide();
                   $("#profile-edit").show();
                   editStatus=true;
                   $(this).text("back");
               }
               else{
                  $("#profile-details").show();
                   $("#profile-edit").hide();
                   editStatus=false; 
                   $(this).text("edit");
               }
               });
            });
                
            
            </script>
            
            
            <!--now add post js-->
            
            <script>//pehele hum data bhejage then yha form sibmit hoga to hum  servlet ko requstbhejage 
                $(document).ready(function(event){
                   $("#add-post-form").on("submit",function(event){
                       //this cade is call when form is submitted
                      
                     event.preventDefault();//form ka normal behaviour ruk jayega synchronous trika 
                     console.log("you have click on submit.......");
                     let form =new  FormData(this);//yha pe form ka pura data nikl jayega 
                     
                     
                    // now requesting to servlet
                    $.ajax({
                         url: "AddPostServlet",
                         type: 'post',
                         data: form,//yaha hum form form ko bhej rhe hai
                        success: function(data,textStatus,jqXHR){
                           console.log(data);
                           
                           if(data.trim() == 'done'){
                             swal("good job!","save successful","success"); 
                           }
                           else{
                               swal("good job!","something went worong","error");
                           }
                     },
                        error: function(jqXHR,textStatus,errorThrown){
                 swal("good job!","something went worong","error");
                    },
                    processData: false,
                    contentType: false
                });
                });
            });
                </script>
                <!--loading posts -->
                <script>
                    
               
    
                      function getPosts(catId,temp){        //code ko bs function me dal diya haior yaha link ka referance pass krna hai temp me  
                        $('#loader').hide();//loader ko hide krega 
                        $('#post-container').show();
                         $('.c-link').removeClass('active')
                           $.ajax({
                          url: "load_posts.jsp",//is script ko konse page se relate krna hai ye jsp page se data lega and html page pe dikhaga profile ke 
                         data: {cid: catId}, //yah pe hum cid ko bhej rhe hai  
                           success: function(data,textStatus,jqXHR){
                               
                               console.log(data);//profile ke console pe dilha aga data
                               $('#loader').hide();//loader ko hide krega 
                               
                               $('#post-container').html(data);// yaha pe html pe data show show krega 
                               $(temp).addClass('active');
                           },
                                error:function(jqXHR,textStatus,errorThrown){
                                    
                                       }
                               }) 
                           }
                    $(document).ready(function(){
                        let allPostRef=$('.c-link')[0]//ye array hai 0th no ke ref vala 
                     getPosts(0,allPostRef)//yaha p efunction call ho jayega 
                    })
                        
                    </script>
                    
    </body>
</html>
