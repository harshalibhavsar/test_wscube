
package com.tech.blog.dao;

import com.tech.blog.entitites.Catagory;
import com.tech.blog.entitites.Post;
import com.tech.blog.entitites.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostDao {
    Connection con;//creat veriable 

public PostDao(Connection con){//method conn obj came from connection class pass in the method
        this.con=con;
}

public ArrayList<Catagory> getAllCatagories() throws SQLException{  //method and the return type 
         ArrayList<Catagory> list =new ArrayList<>() ;
         
         try{
             String q="select * from categories";
             Statement st=this.con.createStatement();
            ResultSet set= st.executeQuery(q);//is set se data featch krna hai to iske liye object banana hoga to 
             while(set.next()){
                 int cid = set.getInt("cid");
              String name   = set.getString("name");
             String description   = set.getString("description");
               
                Catagory c = new Catagory(cid,name,description);
                list.add(c);
             }      
         }
         catch(Exception e){
             
             e.printStackTrace();
         }
         
return list;
}



     
   public boolean savePost(Post p){
       boolean f=false;
       
  try{
      String q="insert into posts(pTitle,pContent,pCode,pPic,catid,userId) values(?,?,?,?,?,?)";
      PreparedStatement pstmt=con.prepareStatement(q);
           pstmt.setString(1,p.getpTitle());
           pstmt.setString(2,p.getpContent());
            pstmt.setString(3,p.getpCode());
             pstmt.setString(4,p.getpPic());
             pstmt.setInt(5,p.getCatId());
              pstmt.setInt(6,p.getUserId());
             pstmt.executeUpdate();
             f=true;
             
  }
  catch(Exception e)
  {
      e.printStackTrace();
  }  
  return f;
 }
   //get all the post
   
   public ArrayList<Post> getAllPost(){    //make a method no of chize ho tb us type ka array use kro 
      
       
       ArrayList<Post> list=new ArrayList<>();
       try{
           PreparedStatement pstmt=con.prepareStatement("select * from posts");
           ResultSet set=pstmt.executeQuery();
           while(set.next()){
               int pid=set.getInt("pid");//data base se sre column nikalna hote hai 
               String pTitle=set.getString("pTitle");
               String PContent=set.getString("pContent");
               String pCode=set.getString("pCode");
               String pPic=set.getString("Ppic");
                Timestamp date=set.getTimestamp("PDate");
                 int  catId=set.getInt("catid"); 
                 int UserId=set.getInt("UserId"); 
                Post post=new Post(pid,pTitle,PContent,pCode,pPic,date,catId,UserId);//cllass ka obj and constructor call hoga 
                
                 list.add(post);//and here obg pass hoga
               
               
               
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
       
       
        return list;
       
   
}
   public ArrayList<Post> getPostByCatId(int catId){ // particular type ho tb parameter and parameter use kro and catid ke trought sari details get krna 
         ArrayList<Post> list=new ArrayList<>();
    try{
           PreparedStatement pstmt=con.prepareStatement("select * from posts where catid=?");
           pstmt.setInt(1, catId);
           ResultSet set=pstmt.executeQuery();
           while(set.next()){
               int pid=set.getInt("pid");//data base se sre column nikalna hote hai 
               String pTitle=set.getString("pTitle");
               String PContent=set.getString("pContent");
               String pCode=set.getString("pCode");
               String pPic=set.getString("Ppic");
                Timestamp date=set.getTimestamp("PDate");//catid argument me aahi rhi hai isliye hum yaha nahi le rhe 
                
                 int UserId=set.getInt("UserId"); 
                Post post=new Post(pid,pTitle,PContent,pCode,pPic,date,catId,UserId);//cllass ka obj and constructor call hoga 
                
                 list.add(post);//and here obg pass hoga
                    
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
        return list;
       
   }
   
   public Post getPostByPostId(int postId) {
       Post post=null;
       String q="select * from posts where pid=?";
     
        try {
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setInt(1,postId);
               ResultSet set=pstmt.executeQuery();
            if(set.next()){
                 int pid=set.getInt("pid");//data base se sre column nikalna hote hai 
               String pTitle=set.getString("pTitle");
               String PContent=set.getString("pContent");
               String pCode=set.getString("pCode");
               String pPic=set.getString("Ppic");
                Timestamp date=set.getTimestamp("PDate");//catid argument me aahi rhi hai isliye hum yaha nahi le rhe 
              int cid=  set.getInt("catId");
                 int UserId=set.getInt("UserId"); 
                 post=new Post(pid,pTitle,PContent,pCode,pPic,date,cid,UserId);//cllass ka obj and constructor call hoga 
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       
       
       
       
        return post;
       
   }
   
   
 
   
 }