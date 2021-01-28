

import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.SQLException;
//import java.sql.DriverManager;

@WebServlet(urlPatterns = {"/signup"})
public class signup extends HttpServlet {

  Connection con;
  Connect dbcon;
  ResultSet res,rst;
  PrintWriter out;
  PreparedStatement pre,pres,prep;
  Statement stm,stl;
  public void init(ServletConfig sc) throws ServletException{
    try{
        super.init(sc);
        dbcon=new Connect();
       con=dbcon.setConnection();
       stm=con.createStatement();
       }
    catch(Exception e){
       System.out.println("error"+e.toString());
    }
  }
  
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         try{
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        String fname=request.getParameter("v1");
        String uname=request.getParameter("v2");
        String gender=request.getParameter("v5");
        String sex=null;
        if(gender.equals("Male"))
            sex="Male";
        else if(gender.equals("Female"))
            sex="Female";
        String date=request.getParameter("v6");
        String email=request.getParameter("v7");
        String num=request.getParameter("v8");
        int id=Integer.parseInt(request.getParameter("v9"));
        String  pwd=request.getParameter("v3");
        Cookie cookup=new Cookie("singup",uname);
        response.addCookie(cookup);
        
     
          
        res=dbcon.getResult("select * from register where username='"+uname+"'",con);
        if(res.next()){
            
            out.println("<html><head><script>{" +

"          alert('The user already exists use another one!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signup.jsp");
        }
         
        else{ 
            
            res=dbcon.getResult("select * from staff_id where staff_id='"+id+"'",con);
            if(res.next()){
            
                 res=dbcon.getResult("select full_name from staff_id where staff_id='"+id+"' and full_name='"+fname+"'",con);
            if(res.next()){
                res=dbcon.getResult("select * from register where staff_id='"+id+"'",con);
                if(res.next()){
                    out.println("<html><head><script>{" +

"          alert('Sorry the Staff_ID is already in use!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signup.jsp"); 
                }
                else{
                     res=dbcon.getResult("select full_name from staff_id where staff_id='"+id+"'",con);
            if(res.next())
                     if(uname.endsWith("@imail.org")){
       pre=con.prepareStatement("insert into register(full_name,username,gender,dob,email_address,"
               + "phone_number,staff_id,password) values(?,?,?,?,?,?,?,?)");
       String kanem=uname;
       pre.setString(1,fname);
       pre.setString(2,kanem);
       pre.setString(3,sex);
       pre.setString(4,date);
       pre.setString(5,email);
       pre.setString(6,num);
       pre.setInt(7,id);
       pre.setString(8,pwd);
       pre.execute();
       
       out.println("<html><head><script>{" +

"          alert('Successfully registered as "+kanem+" proceed to Login!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signin.jsp"); 
       
                     }
                     else{
                       pre=con.prepareStatement("insert into register(full_name,username,gender,dob,email_address,"
               + "phone_number,staff_id,password) values(?,?,?,?,?,?,?,?)");
             String kanem=uname+"@imail.org";          
       pre.setString(1,fname);
       pre.setString(2,kanem);
       pre.setString(3,sex);
       pre.setString(4,date);
       pre.setString(5,email);
       pre.setString(6,num);
       pre.setInt(7,id);
       pre.setString(8,pwd);
       pre.execute(); 
       
       out.println("<html><head><script>{" +

"          alert('Successfully registered as "+kanem+" proceed to Login!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signin.jsp"); 
       
                     }
       
            
                }
        } 
         
            else{
               out.println("<html><head><script>{" +

"          alert('The user not associated with the staff ID!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signup.jsp"); 
            }   
        }
            else{
               out.println("<html><head><script>{" +

"          alert('The staff ID is not registered in the system "
                       + "!');window.history.go(-1);}</script></head></html>");
                 
         
            response.setHeader("Refresh","3;URL=signup.jsp"); 
            }
            
         }
        
    }
         catch(Exception e){
       System.out.println("error"+e.toString());
    }
   
    }

    
  

}

