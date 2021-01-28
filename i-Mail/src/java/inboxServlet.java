

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/inboxServlet"})
public class inboxServlet extends HttpServlet {
Connection con;
Connect dbcon;
String query;
ResultSet re=null;
PrintWriter out;

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
   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
      response.setContentType("Text/Html");
     
     out.println("<html>");
     out.println("<head>");
     out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
     out.println("<body background=\"bak.JPG\" text=blue>");
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
     try{
     String mail="select msgfrom,subject,msgdate,id from inbox where msg_to='"+unem+"'";
     re=dbcon.getResult(mail, con);
     }
     catch(Exception e){
         out.println(e);
     }
     out.println("<div class='container-fluid'>");
     
  
     out.println("<table class='table table-hover'>");
     out.println("<thead class='thead'>");
     out.println("<tr class='table-info'><th></th><th>From</th><th>Subject</th><th>Date</th></tr>");
     out.println("</thead>");
     out.println("<tbody>");
     out.println("<form method=post action='deleteMail' name=ff>");
     while(re.next())
     {
         String frm=re.getString(1);
         String sub=re.getString(2);
	 String dat=re.getString(3);
         int id=re.getInt(4);
         out.println("<tr class='table-warning'><td><input type=checkbox name='chk1' value="+id+"></td>");
         out.println("<td  ><a href=getMsg?msgf="+frm+"&msgd="+id+" target=rightside>"+frm+"</a></td>");
         out.println("<td  >"+sub+"</td><td >"+dat+"</td></tr>");
         
     }   
    
     
      out.println("</tbody>");
      out.println("</table>");
      out.println("<input class='btn btn-warning' type=submit value='Delete' onclick=location.href='http://localhost:8080/servlet/deleteMail'>");
      out.println("</form>");
      out.println("</div>");
        
      out.println("</body>");
      out.println("</html>");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

   

}
