<%-- 
    Document   : register_page
    Created on : 2 Feb, 2024, 6:18:32 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
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
        <main class="primary_background p-5 banner-background" style="padding-bottom: 80px;">
            <div class="container">
                <div class="col-md-6 offset-md-3" >
                    <div class="card"> 
                        <div calss="card-header text-center primar-background text-white">
                            <span class="fa fa-3x fa-user-circle"></span>
                            <br>
                                  Register here
                        </div>
                        
                        <div class="card-body">
                            <form id="reg-form"  action="RegisterServlet"  method="post">
                             <div class="mb-3">
                      <label for="user_name" class="form-label">User Name</label>
                      <input name="user-name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name">
                             <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                              </div>
                                <div class="mb-3">
                     <label for="user_email" class="form-label">User Email</label>
                        <input name="user-email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
               </div>
                                
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input name="user-password" type="password" class="form-control" id="exampleInputPassword1" placeholder="password">
  </div>
                                
        <div class="mb-3">
    <label for="gender" >Select Gender</label>
    <br>
    <input type="radio" id="gender" name="gender" value="male">Male
    <input type="radio" id="gender" name="gender" value="female">Female
    
  </div>
        <div class="form-group" >
            <textarea name="about" class="form-control" id="" cols="30" rows="10" placeholder="enter something yourself"></textarea>                       
        </div>
  <div class="mb-3 form-check">
    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Agree terms and conditions</label>
  </div>
    <br>
    <div class="container text-center" id="loader" style=" display:none;">
      <span class="fa fa-refresh  fa-spin  fa-4x "></span> 
      <h4>please wait... </h4>
    </div>
    <br>
  <button id="submit-button" type="submit" class="btn primary-background text-white">Submit</button>
</form>
                        </div>
                        <div class="card-footer">
                            
                        </div>
                    </div>
                </div>
                
            </div>
        </main>
        
<!--javascript-->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="JS/myjs.js" type="text/javascript"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script>
           $(document).ready(function(){
           console.log("loaded.........")
           $('#reg-form').on('submit',function(event){
               event.preventDefault();
               let form=new FormData(this);
               $('#submit-button').hide();
               $('#loader').show();
               $.ajax({
                   url: 'RegisterServlet',
                   type: 'post',
                   data:  form,
                   
                   success: function(data,textStatus,jqXHR){
                       console.log(data)
                        $('#submit-button').show();
                     $('#loader').hide();
                     if(data.trim() === 'done...')
                     {
                    swal("register successful.")
                             .then((value) => {
                           window.location="login_page.jsp"
                          });
                      }
                      else{
                        swal(data);  
                      }
                   },
                  error: function(jqXHR,textStatus,errorThrown)
                  {
                     
                     console.log(jqXHR)
                       $('#submit-button').hide();
                       $('#loader').show();
                      swal("something went worng")
                                   
                  },
                  processData:false,
                          contentType:false
               });
           });
           
           
           
           });
               
        
        </script>
    </body>
</html>
