

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


public class Spam extends HttpServlet {
ResultSet res=null;
PreparedStatement pst=null;
Connection con=null;
Connect dbcon;
   
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
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
   
       try{
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
     out.println("<html><head>");
       out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
    
     out.println("<body background=\"bak.JPG\">");
     out.println("<form method='post' action='deleteMail'>");
     out.println("<table class='table table-hover'>");
     out.println("<tr class='table-info'><th></th><th>From</th><th>Subject</th><th>Date</th></tr>");
     
     String sel="select * from spam where msgto=?";
     pst=con.prepareStatement(sel);
     pst.setString(1,unem);
     res=pst.executeQuery();
      
     while(res.next()){
         String from=res.getString("msgfrom");
         String sub=res.getString("subject");
         String date=res.getString("msgdate");
         int id=res.getInt("id");
         
         out.println("<tr class='table-warning'><td><input type=checkbox name='sek' value="+id+"></td><td><a href=getSpam?msgf="+from+"&msgd="+id+" target=rightside>"+from+"</a></td><td>"+sub+"</td><td>"+date+"</td>");
     }
      out.println("</table>");
      out.println("<input class='btn btn-warning' type='submit' value='Delete' onclick=location.href='http://localhost:8080/servlet/deleteMail'>");
      out.println("<form>");
       out.println("</body></html>");
       }
    catch(Exception e){
        
    }
    
    }

   
  

}
