/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class getSpam extends HttpServlet {

   ResultSet res=null;
PreparedStatement pst=null;
Connection con=null;
Connect dbcon;
 
@Override
public void init(ServletConfig sc) throws ServletException{
   try{
       super.init(sc);
       dbcon=new Connect();
       con=dbcon.setConnection();
   } 
   catch(Exception e){
       System.out.println(e.toString());
   }
}

   @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
    
       try{
           
       String mfrm=request.getParameter("msgf");
       String mid=request.getParameter("msgd");
           
           String unem=null;
     Cookie []c=request.getCookies();
     if(c!=null)
     {
         for(int u=0;u<c.length;u++)
         {
             if(c[u].getName().equals("signin"))
             {
                 unem=c[u].getValue();
                 break;
             }
         }
     }
     
      
     res=dbcon.getResult("select * from spam where msgfrom='"+mfrm+"' and id='"+mid+"'", con);
     out.println("<html><head>");
     out.println(" <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        <link rel=\"stylesheet\" href=\"font_awesome/css/font-awesome.min.css\">\n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
     out.println("<body text=blue>");
     out.println("<div class='col-sm-10'>");
     out.println("<table class='table table-hover'>");
       out.println("<tr class='table-primary'><th>Message from</th><th>Subject</th><th>Message</th> </tr>");
     while(res.next()){
         String from=res.getString("msgfrom");
         String subject=res.getString("subject");
         String msg=res.getString("msg");
         out.println("<tr class='table-danger'><td>"+from+"</td><td>"+subject+"</td><td>"+msg+"</td></tr>");
        
			
     }
     out.println("</table>");
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
     
       }
       catch(Exception e){
           
       }
    
    }

   
    }

   

