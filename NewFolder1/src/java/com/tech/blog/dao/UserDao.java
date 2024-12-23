
package com.tech.blog.dao;

import com.tech.blog.entitites.User;
import java.sql.*;
public class UserDao {
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    //method to insert the user1 to data base
     
    public boolean saveUser(User user)//ye user class he 
    {
        boolean f=false;//simple thought for ckeacking 
        try{
            //user database=>
          //  boolean f=false;//simple thought for ckeacking 
            String q="insert into user1(name,email,password,gender,about)values(?,?,?,?,?)";
       PreparedStatement pstmt=     this.con.prepareStatement(q);
       pstmt.setString(1, user.getName());
       pstmt.setString(2, user.getEmail());
       pstmt.setString(3, user.getPassword());
       pstmt.setString(4, user.getGender());
       pstmt.setString(5, user.getAbout());      
       pstmt.executeUpdate();
       f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return f;
    }
    
    //get user by useremail and user password user se database se email and password nikalna hai 
    public User getUserByUserEmailAndPassword(String email, String password)
    {
        User user=null;
        try{
            String q="select * from user1 where email=? and password=?";
        PreparedStatement pstmt= con.prepareStatement(q);
         pstmt.setString(1, email);//yha hum set kr rhe hai string ko 
       pstmt.setString(2, password);
      ResultSet set= pstmt.executeQuery();//deta nikalne ke liye //result set me dalna hotahai deta jb deta base se nikala hota hai 
      if(set.next())
      {
        user=new User();//new user bnayege and purane vale useer me rkhe ge 
        //get user form db
   String name=set.getString("name");
   //set db user to this user
   user.setName(name);
   user.setId(set.getInt("id"));
   user.setEmail(set.getString("email"));
   user.setPassword(set.getString("password"));
   user.setGender(set.getString("gender"));
   user.setAbout(set.getString("about"));
   user.setDateTime(set.getTimestamp("rdate"));
    user.setProfile(set.getString("profile"));             
      }
      
      
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        
        
        
        return user;
     }
    public boolean updateUser(User user){
        boolean f=false;
        try{
            String q=" update user1 set name=? , email=? , password=? , gender=? , about=? , profile=? where id=?";
            PreparedStatement pstmt= con.prepareStatement(q);
            pstmt.setString(1,user.getName());//update krna hai vo jo uer ke andar hai 
            pstmt.setString(2,user.getEmail());
            pstmt.setString(3,user.getPassword());
            pstmt.setString(4,user.getGender());
            pstmt.setString(5,user.getAbout());
             pstmt.setString(6,user.getProfile());
            pstmt.setInt(7,user.getId());
            
              pstmt.executeUpdate();
              f=true;
              
        }
        catch(Exception e){
           e.printStackTrace();
        }
        return f;
    }
    
    
    public User getUserByPostId(int userId){
     User user=null;
      String q="select * from user1 where userId=?";
     
        try {
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setInt(1,userId);
               ResultSet set=pstmt.executeQuery();
            if(set.next()){
                  user=new User();//new user bnayege and purane vale useer me rkhe ge 
        //get user form db
   String name=set.getString("name");
   //set db user to this user
   user.setName(name);
   user.setId(set.getInt("id"));
   user.setEmail(set.getString("email"));
   user.setPassword(set.getString("password"));
   user.setGender(set.getString("gender"));
   user.setAbout(set.getString("about"));
   user.setDateTime(set.getTimestamp("rdate"));
    user.setProfile(set.getString("profile"));    
                 }
        }catch (Exception e) {
            e.printStackTrace();
                            
            }
 
        return user;
}  

}