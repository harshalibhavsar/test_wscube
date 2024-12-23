<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entitites.Post"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<div  class="row"><!--yaha pe 1 row banaya -->
<%
   
PostDao dao=new PostDao(ConnectionProvider.getConnection());//treat this as servlet 
                                  
                int cid =Integer.parseInt(request.getParameter("cid")); 
                 List<Post> posts=null;//taki posts dodno jgh if me bhi and else me bhi use krte aaye 
                   if(cid==0){
                       
                   
                      posts=dao.getAllPost();//agr 0 he to sare posts ko lelo 
                   }
                   else{
                    posts=dao.getPostByCatId(cid);//agr o nhi hai to catagory ki hisab se lelo 
                   }
                   if(posts.size()==0){
                       out.println("<h3 class='display-3 text-center'>no posts in this catagory</h3>");
                       return;
                   }
                for(Post p: posts){
       %>
       <div class="col-md-6 mt-2"><!--yaha pe 1 colm bnaya -->
           <div class="card"><!--then 1 by 1 hme content dikhana hai jitne bhi post ho vo sb inside card body -->
               <img src="blog_pics/<%=p.getpPic()%>" class="card-img-top" alt="Card image cap"> 
               <div class="card-body">
                   
                   
                   <b> <%= p.getpTitle()%> </b>
                    <p> <%= p.getpContent()%> </p>
                     <pre> <%= p.getpCode()%> </pre>
                    
               </div>
                     <div  class="card-footer text-center">
                         
                     
                         <a  href="#"  class="btn btn-outline-primary btn-sm"><i class="fa fa-thumbs-o-up"><span>10</span></i></a>
                     <a  href="show_blog_page.jsp?post_id=<%= p.getPid()%>" class="btn btn-outline-primary btn-sm">Read More...</a><!--this is for button-->
                      <!--read more pe click krne pe usse related details next page pe dikhni chahiye to uski id se lelena url rewritting ke through -->   
                    <!--ye trika hai yha se post id url ke through bhejne ka -->
                      <a  href="#"  class="btn btn-outline-primary btn-sm"><i class="fa fa-commenting-o"><span>20</span></i></a>
                     </div>
                   
           </div>
       </div>
       
       <%
      }

%>
</div>