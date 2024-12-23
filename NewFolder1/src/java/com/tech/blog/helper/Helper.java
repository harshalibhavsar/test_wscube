
package com.tech.blog.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class  Helper{
    
    public static boolean deleteFile(String path)//method for deleteFile,isko last me static banaya taki class name se call kr ske 
    {
        boolean f=false;
        try{
            File file=new File(path);//file class ka object provide path ,file name ki class banahai 
            f=file.delete();//agr file delete ho jayegi f tru ho jayega 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public static boolean saveFile(InputStream is, String path){
        boolean f=false;
        try{
            byte b[]=new byte[is.available()];//is available store it in byte
            is.read(b);
            
            FileOutputStream fos=new FileOutputStream(path);
            fos.write(b);
            fos.flush();
            fos.close();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        return f;
        
    
    
    }  
}