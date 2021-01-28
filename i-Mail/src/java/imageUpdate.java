/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class imageUpdate extends HttpServlet {
PreparedStatement ps;
Connection con;
Connect dbcon;
   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out=response.getWriter();
        try{
            dbcon=new Connect();
           con=dbcon.setConnection();
             String nem=null;
       Cookie c[]=request.getCookies();
       if(c!=null){
           for(int i=0;i<c.length;i++)
           {
               if(c[i].getName().equals("signin"))
               {
                   nem=c[i].getValue();
                   break;
               }
           }
       }
            
            Part part =request.getPart("file");
        String filename=getFileName(part);
        String savepath="E:\\i-Mail\\web\\images\\"+File.separator+filename;
        File filesavedir=new File(savepath);
        part.write(savepath+File.separator);
       
       
        String image="update register set filename='"+filename+"',path='"+savepath+"' where username='"+nem+"'";
        ps=con.prepareStatement(image);
        ps.execute();
            out.println("<html><head><script>{" +

"          alert('Image updated successfully!');window.history.go(-1);}</script></head></html>");
                 response.setHeader("Refresh", "2;URL=logo.jsp");
        response.setHeader("Refresh", "2;URL=imail.jsp");
        }
        catch(Exception e){
            out.println("<html><head><script>{" +

"          alert('No image selected for upload!');window.history.go(-1);}</script></head></html>");
            response.setHeader("Refresh", "2;URL=reset.jsp");
        }
       
    }
    private String getFileName(Part part) {
       String contentDisp=part.getHeader("content-disposition");
       String[] items=contentDisp.split(";");
       for(String s:items){
           if(s.trim().startsWith("filename")){
             return s.substring(s.indexOf('=')+2, s.length()-1);
           }
       }
       return "=";  
    }

}
