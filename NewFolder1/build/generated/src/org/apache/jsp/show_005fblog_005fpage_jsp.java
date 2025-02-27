package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.tech.blog.entitites.Catagory;
import com.tech.blog.entitites.User;
import com.tech.blog.entitites.Post;
import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConnectionProvider;

public final class show_005fblog_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


        User user= (User)session.getAttribute("currentUser");
if(user==null){
    response.sendRedirect("login_page.jsp");
}

      out.write('\n');


                      int postId = Integer.parseInt(request.getParameter("post_id"));
                     PostDao dao=new PostDao(ConnectionProvider.getConnection());
                               Post p =dao.getPostByPostId(postId);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(p.getpTitle());
      out.write("|| techblog by learn code with durgesh</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"CSS/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        .banner-background{\n");
      out.write("        clip-path: polygon(50% 0%, 83% 0, 100% 0, 100% 100%, 80% 97%, 51% 100%, 11% 98%, 0 100%, 0 0, 21% 0);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .post-title{\n");
      out.write("            font-weight:100;\n");
      out.write("            font-size: 30px;\n");
      out.write("        }\n");
      out.write("        .post-content{\n");
      out.write("             font-weight:100;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        .post-date{\n");
      out.write("            font-style: italic;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .post-user-info{\n");
      out.write("            font-style: italic;\n");
      out.write("            font-weight:300;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!--navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark primary_background\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-asterisk\"></span>Tech Blog</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"profile.jsp\"><span class=\"fa fa-bell-o\"> </span>Learn cide with durgesh</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("              <span class=\"fa fa-check-square-o\"></span>  Categories\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Programming Language</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Project Implementation </a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Data Stricture</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"#\"> <span class=\"fa fa-address-o\"></span> Contact</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#add-post-modal\"> <span class=\"fa fa-asterisk\"></span>DO POST</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("        <ul  class=\"navbar-nav mr-right\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("               <a class=\"nav-link\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#profile-modal\"> <span class=\"fa fa-user-circle\"></span>");
      out.print( user.getName());
      out.write("</a>\n");
      out.write("        </li>\n");
      out.write("            \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"LogoutServlet\"> <span class=\"fa fa-user-plus\"></span>Logout</a>\n");
      out.write("        </li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <!--end of nav bar-->\n");
      out.write("       <!-- main content of body -->\n");
      out.write("       <div  class=\"container\">\n");
      out.write("           <div class=\"row my-4\">\n");
      out.write("               <div class=\"col-md-8 offset-md-2\">\n");
      out.write("                   <div  calss=\"card\">\n");
      out.write("                       <div class=\"card-header\">\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           <p class=\"post-title\">   ");
      out.print( p.getpTitle());
      out.write("  </p>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                       \n");
      out.write("                   </div>\n");
      out.write("                           <div class=\"card-body\">\n");
      out.write("                               <p>\n");
      out.write("                                    <img src=\"blog_pics/");
      out.print(p.getpPic());
      out.write("\" class=\"card-img-top my-2\" alt=\"...\"> \n");
      out.write("                                    \n");
      out.write("                               <div class=\"row  my-3\">\n");
      out.write("                                   <div  class=\"col-md-8\">\n");
      out.write("                                       <p class=\"post-user-info\"><a href=\"3\"> durgesh tiwari </a>has posted...\n");
      out.write("                                       </p>\n");
      out.write("                                      \n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-md-4\">\n");
      out.write("                                       <p class=\"post-date\">");
      out.print(p.getpDate().toLocaleString());
      out.write("</p>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>  \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                   <p  class=\"post-content\">  ");
      out.print( p.getpContent());
      out.write("</P>\n");
      out.write("                               </p>\n");
      out.write("                               <br>\n");
      out.write("                               <br>\n");
      out.write("                               <div  class=\"post-code\">\n");
      out.write("                               <pre>\n");
      out.write("                                   ");
      out.print(p.getpCode());
      out.write("\n");
      out.write("                               </pre>\n");
      out.write("                           </div>\n");
      out.write("                               <div  class=\"card-footer primary_background\">\n");
      out.write("                                    <a  href=\"#\"  class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-thumbs-o-up\"><span>10</span></i></a>\n");
      out.write("                     \n");
      out.write("                      <a  href=\"#\"  class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-commenting-o\"><span>20</span></i></a>\n");
      out.write("                                   \n");
      out.write("                               </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <!--end of main content of body -->\n");
      out.write("         <!--profile model-->       \n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header  primary_background  text-white\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Tech Blog</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("              \n");
      out.write("              <img src=\"pics/");
      out.print( user.getProfile());
      out.write("\" class=\"img-fluid\"  style=\"border-radius: 50%; max-width: 150px;\">\n");
      out.write("       \n");
      out.write("              <h5 class=\"modal-title\" id=\"exampleModalLabel\">");
      out.print( user.getName());
      out.write("</h5>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--details-->\n");
      out.write("<div id=\"profile-details\">\n");
      out.write("        \n");
      out.write(" <table class=\"table\">\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">ID:</th>\n");
      out.write("      <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Email:</th>\n");
      out.write("      <td>");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Gender:</th>\n");
      out.write("      <td colspan=\"2\">");
      out.print( user.getGender());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("      <th scope=\"row\">Status:</th>\n");
      out.write("      <td colspan=\"2\">");
      out.print( user.getAbout());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Registered on:</th>\n");
      out.write("      <td colspan=\"2\">");
      out.print( user.getDateTime().toString());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("     \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("  </div>     \n");
      out.write("      <!--profile edit-->\n");
      out.write("      <div id=\"profile-edit\" style=\"display: none;\">\n");
      out.write("          <h2>\n");
      out.write("              please edit carefully\n");
      out.write("          </h2>\n");
      out.write("          <form action=\"EditServlet\"  method=\"post\"  enctype=\"multipart/form-data\">\n");
      out.write("              <table  class=\"table\">\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Id:</td>\n");
      out.write("                      <td>");
      out.print(user.getId());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                   <tr>\n");
      out.write("                      <td>Email:</td>\n");
      out.write("                      <td><input type=\"email\"  class=\"form-control\" name=\"user_email\" value=\"");
      out.print(user.getEmail());
      out.write("\"></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Name:</td>\n");
      out.write("                      <td><input type=\"name\"  class=\"form-control\" name=\"user_name1\" value=\"");
      out.print(user.getName());
      out.write("\"></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Password:</td>\n");
      out.write("                      <td><input type=\"password\"  class=\"form-control\" name=\"user_password\" value=\"");
      out.print(user.getPassword());
      out.write("\"></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Gender:</td>\n");
      out.write("                      <td><input type=\"gender\"  class=\"form-control\" name=\"user_gender\" value=\"");
      out.print(user.getGender());
      out.write("\"></td>\n");
      out.write("                  </tr>\n");
      out.write("                   <tr>\n");
      out.write("                      <td>About:</td>\n");
      out.write("                      <td>  <textarea class=\"form-control\"  name=\"user_about\">\n");
      out.write("                       ");
      out.print( user.getAbout());
      out.write("\n");
      out.write("                   </textarea>\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>Select profile:</td>\n");
      out.write("                      <td> <input type=\"file\" name=\"image\" calss=\"form-control\">\n");
      out.write("                      \n");
      out.write("                  \n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("              </table>\n");
      out.write("                   \n");
      out.write("                   <div class=\"container\">\n");
      out.write("                       <button  type=\"submit\" class=\"btn btn-outline-primary\">Save</button>\n");
      out.write("                   </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("        <button  id=\"edit-profile-button\"  type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <!--end of profile model-->     \n");
      out.write("    \n");
      out.write("    <!--add post model-->\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-post-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Provide the post Details....</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <form id=\"add-post-form\" method=\"post\" action=\"AddPostServlet\">\n");
      out.write("                  \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                   <select class=\"form-control\" name=\"cid\">\n");
      out.write("                       <option selected desiabled>......Select Category.......</option> \n");
      out.write("                       \n");
      out.write("                       ");

                       PostDao postd=new PostDao(ConnectionProvider.getConnection());
                    ArrayList<Catagory> list= postd.getAllCatagories();
                          for(Catagory c:list)
                          {
                              
                       
      out.write("\n");
      out.write("                       \n");
      out.write("                       <option  value=\"");
      out.print( c.getCid());
      out.write('"');
      out.write('>');
      out.print( c.getName());
      out.write("</option> \n");
      out.write("                          \n");
      out.write("                          ");

                          }

      out.write("\n");
      out.write("                  </select>\n");
      out.write("                  </div>\n");
      out.write("                  <br>\n");
      out.write("                  <div>\n");
      out.write("                      <input   name=\"pTitle\" type=\"text\" placeholder=\"Enter post Title\" class=\"form-control\"/>\n");
      out.write("                      </div>\n");
      out.write("                  <br>\n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                       <textarea name=\"pContent\" placeholder=\"Enter your content\" style=\"height:300px ;width:300px\"  calss=\"form-control\"> </textarea>  \n");
      out.write("                  </div> \n");
      out.write("                  <br>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                     <textarea name=\"pCode\"  placeholder=\"Enter your program (if any)\"  style=\"height:300px;width:300px\" calss=\"form-control\"> </textarea>  \n");
      out.write("                  </div>\n");
      out.write("                  <br>\n");
      out.write("                  <div class=\"form-group \">\n");
      out.write("                      <label>Select  your pic</label>\n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"file\" name=\"pic\" >   \n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  <div class=\"conatiner text-center\">\n");
      out.write("                      <button type=\"submit\"  class=\"btn btn-outline-primary\">Post</button>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </form>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("           \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!---->\n");
      out.write("    <!--javascript-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.1.min.js\" integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("       <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"JS/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                \n");
      out.write("                let editStatus =false;//for checking\n");
      out.write("                 $('#edit-profile-button').click(function(){\n");
      out.write("                    if(editStatus==false){\n");
      out.write("                        \n");
      out.write("               // alert(\"buuton clicked\")\n");
      out.write("                   $(\"#profile-details\").hide();\n");
      out.write("                   $(\"#profile-edit\").show();\n");
      out.write("                   editStatus=true;\n");
      out.write("                   $(this).text(\"back\");\n");
      out.write("               }\n");
      out.write("               else{\n");
      out.write("                  $(\"#profile-details\").show();\n");
      out.write("                   $(\"#profile-edit\").hide();\n");
      out.write("                   editStatus=false; \n");
      out.write("                   $(this).text(\"edit\");\n");
      out.write("               }\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--now add post js-->\n");
      out.write("            \n");
      out.write("            <script>//pehele hum data bhejage then yha form sibmit hoga to hum  servlet ko requstbhejage \n");
      out.write("                $(document).ready(function(event){\n");
      out.write("                   $(\"#add-post-form\").on(\"submit\",function(event){\n");
      out.write("                       //this cade is call when form is submitted\n");
      out.write("                      \n");
      out.write("                     event.preventDefault();//form ka normal behaviour ruk jayega synchronous trika \n");
      out.write("                     console.log(\"you have click on submit.......\");\n");
      out.write("                     let form =new  FormData(this);//yha pe form ka pura data nikl jayega \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    // now requesting to servlet\n");
      out.write("                    $.ajax({\n");
      out.write("                         url: \"AddPostServlet\",\n");
      out.write("                         type: 'post',\n");
      out.write("                         data: form,//yaha hum form form ko bhej rhe hai\n");
      out.write("                        success: function(data,textStatus,jqXHR){\n");
      out.write("                           console.log(data);\n");
      out.write("                           \n");
      out.write("                           if(data.trim() == 'done'){\n");
      out.write("                             swal(\"good job!\",\"save successful\",\"success\"); \n");
      out.write("                           }\n");
      out.write("                           else{\n");
      out.write("                               swal(\"good job!\",\"something went worong\",\"error\");\n");
      out.write("                           }\n");
      out.write("                     },\n");
      out.write("                        error: function(jqXHR,textStatus,errorThrown){\n");
      out.write("                 swal(\"good job!\",\"something went worong\",\"error\");\n");
      out.write("                    },\n");
      out.write("                    processData: false,\n");
      out.write("                    contentType: false\n");
      out.write("                });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("                </script>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
