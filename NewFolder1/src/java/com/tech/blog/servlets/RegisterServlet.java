
package com.tech.blog.servlets;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entitites.User;

import com.tech.blog.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
          //featch all form deta 
              String check=request.getParameter("check");
        if(check==null){
            out.println("please fill the details");
        }
        else{
           
          String name=request.getParameter("user-name");
         String email= request.getParameter("user-email");
          String password= request.getParameter("user-password");
         String gender= request.getParameter("gender");
         String about= request.getParameter("about");///yha pe form se derta fectch kiya hai 
         //create 1 object usme detais add kro (vo object user ka hi create krna ye vali kyuki user dao user class ki details hmne fectch ki hai )and vo abject pass krdo user dao ke object me 
         // user me details kaha seaaayegi db me dalne ke liye,or yha ki details  bhi backend me kese dalege [to front ki details backend ke class ke object me dalo ]
         //and vo abject method me dalo and method ko yha se call kro 
         // yha se backend ke class ke obj me details dalo us class ki
         //method ko call krna  and yha se pass krna 
         User user =new User(name,email,password,gender,about);
         
         
         
         
          //create user dao object    
            UserDao dao= new UserDao(ConnectionProvider.getConnection()); //yha database me dalna hai to vapas db me dalne ki query and all nahi k=likh na hai 
                      if(dao.saveUser(user)){//user ki details jo yha pe upr aai he vo save krna hai to 1k iser ka aobj bnao and use details ko save kro and vo onject yha pe pass krdo 
                      //agr isne tru return ki y athat means ye save ho gya 
                      //save
                      out.println("done...");
                     }
                      else{
                          out.println("error");
                      }
        }
          
        
          
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
