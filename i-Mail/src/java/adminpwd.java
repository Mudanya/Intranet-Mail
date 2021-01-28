

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class adminpwd extends HttpServlet {
PrintWriter out;
Connect dbcon;
Connection con;
ResultSet res;
Statement stm;
PreparedStatement ps;
   
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try{
        out=response.getWriter();
        dbcon=new Connect();
        con=dbcon.setConnection();
        String oldp=request.getParameter("opd");
        String newp=request.getParameter("npd");
        
        
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
       
        
       
      res=dbcon.getResult("select password from admin where password='"+oldp+"'", con);
     
      if(res.next())
      {
          stm=con.createStatement();
          String updet="update admin set password='"+newp+"'";
          stm.executeUpdate(updet);
          
         
          
          out.println("<font color='green'>You have successfully changed your password</font>");
           response.setHeader("Refresh", "2;URL=adminpwd.jsp");
      }
      else{
           out.println("<html><head><script>{" +

"          alert('Wrong old password!');window.history.go(-1);}</script></head></html>");
            response.setHeader("Refresh", "2;URL=adminpwd.jsp");
           
          }  
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
