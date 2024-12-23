package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.tech.blog.entitites.Post;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDao;

public final class load_005fposts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<div  class=\"row\"><!--yaha pe 1 row banaya -->\n");

    Thread.sleep(1000);
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
       
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("       <div class=\"col-md-6 mt-2\"><!--yaha pe 1 colm bnaya -->\n");
      out.write("           <div class=\"card\"><!--then 1 by 1 hme content dikhana hai jitne bhi post ho vo sb inside card body -->\n");
      out.write("               <img src=\"blog_pics/");
      out.print(p.getpPic());
      out.write("\" class=\"card-img-top\" alt=\"...\"> \n");
      out.write("               <div class=\"card-body\">\n");
      out.write("                   <b> ");
      out.print( p.getpTitle());
      out.write(" </b>\n");
      out.write("                    <p> ");
      out.print( p.getpContent());
      out.write(" </p>\n");
      out.write("                     <pre> ");
      out.print( p.getpCode());
      out.write(" </pre>\n");
      out.write("                    \n");
      out.write("               </div>\n");
      out.write("                     <div class=\"card-footer text-center\">\n");
      out.write("                     <a  href=\"#\"  class=\"btn btn-outline-primary btn-sm\"><i class=\"fa fa-thumbs-o-up\"><span>10</span></i></a>\n");
      out.write("                     <a  href=\"show_blog_page.jsp?post_id=");
      out.print( p.getPid());
      out.write("\"  class=\"btn btn-outline-primary btn-sm\">Read More...</a><!--this is for button-->\n");
      out.write("                      <!--read more pe click krne pe usse related details next page pe dikhni chahiye to uski id se lelena url rewritting ke through -->   \n");
      out.write("                    <!--ye trika hai yha se post id url ke through bhejne ka -->\n");
      out.write("                      <a  href=\"#\"  class=\"btn btn-outline-primary btn-sm\"><i class=\"fa fa-commenting-o\"><span>20</span></i></a>\n");
      out.write("                     </div>\n");
      out.write("                   \n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("       ");

      }


      out.write("\n");
      out.write("</div>");
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
