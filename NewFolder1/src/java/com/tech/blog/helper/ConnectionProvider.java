
package com.tech.blog.helper;

import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection()
            
    {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","harsha123");
      System.out.println("Connection established successfully");
   } catch (ClassNotFoundException e) {
        System.err.println("JDBC Driver not found: " + e.getMessage());
   } catch (SQLException e) {
       System.err.println("Error establishing connection: " + e.getMessage());
  }
    
    return con;   
        
        
        
    }
        
    }
