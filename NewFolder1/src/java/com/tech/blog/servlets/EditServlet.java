/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlets;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entitites.Message;
import com.tech.blog.entitites.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author HP
 */
@MultipartConfig
public class EditServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            
         String userEmail= request.getParameter("user_email");
         out.println("<h1>emailvalue"+userEmail+"come form html page</h1>");
          String userName= request.getParameter("user_name1");
           String userPassword= request.getParameter("user_password");
             String userAbout= request.getParameter("user_about");
             Part part =request.getPart("image");
         String imageName   = part.getSubmittedFileName();
         //get the user from the session
         //purana deta chal rha he session me vo nikalna hai
         HttpSession s=request.getSession();//login servlet me user ka object set kiya tha current user u vha oe bhi session ka obj bnaya tha 
               User user=(User)s.getAttribute("currentUser");//type cat kiya user me 
               user.setEmail(userEmail);//user me set kiya current user ki details 
               user.setName(userName);
               user.setPassword(userPassword);
               user.setAbout(userAbout);
               String oldFile=user.getProfile();//old file me purani vali file uplode hogi //1st//
               user.setProfile(imageName);//yha use ki new profile hai 
               //update this inside database also 
                  UserDao dao=new UserDao(ConnectionProvider.getConnection());
              boolean ans= dao.updateUser(user);
             
                  if(ans){
                      out.println("update to db");
                      //data base me update krne ke bad 
                 String path = request.getRealPath("/")+"pics"+File.separator+user.getProfile();//kahape update krvani hai/file.dseperator krna /user ki profile
                   
                 //this is the code for deleting the file
                  String pathOldFile = request.getRealPath("/")+"pics"+File.separator+oldFile;//path old file //2nd 
                if(!oldFile.equals("default.png")){
                  Helper.deleteFile(pathOldFile);//call methode class name se static method call hui hai //3rd
                }   
                  if( Helper.saveFile(part.getInputStream(),path))//save krne ke liye ye use kro 
                         {
                        out.println("profile updated");
                         Message msg=new Message("profile details updated","success","aleart-success");
                             s.setAttribute("msg",msg);
                         
                         }else
                         {
                               Message msg=new Message("something went wrong...!!","error","aleart-danger");
                                   s.setAttribute("msg",msg);
                                 }
                  } else{
            out.println("not updated......");
            Message msg=new Message("something went wrong...!!","error","aleart-danger");
              s.setAttribute("msg",msg);
        }
                  response.sendRedirect("profile.jsp");
          out.println("</body>");
            out.println("</html>");
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
