package libary.management.system;
import java.sql.*;
public class conn {
	 Connection c;
	    Statement s;
	    public conn(){  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            c =DriverManager.getConnection("jdbc:mysql:///Libary Management System","","harsha");    
	            s =c.createStatement();  
	            
	           
	        }catch(Exception e){ 
	            System.out.println(e);
	        }  
	    }  
	}
	

	

