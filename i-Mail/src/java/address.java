

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class address extends HttpServlet {
Connection con;
Connect dbcon;
ResultSet res=null;
PreparedStatement pst;
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
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        
try {
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
            
           
            out.println("<html>");
            out.println("<head>");
     out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("<style type='text/css'>");
    out.println(".addn{padding-top:20px;}");
     out.println("</style>");
     out.println("</head><body background=\"bak.JPG\">");
            out.println("<div class='container-fluid'>");
            out.println("<table class='table'><tr class='table-info'><th></th><th>Name</th><th>Address</th><th>Message</th> </tr>");
            
            
            String val="select * from addressbook where author=?";
            pst=con.prepareStatement(val);
            pst.setString(1,unem);
            res=pst.executeQuery();
            
         
            while(res.next())
            { 
            out.println("<form class='form-horizontal' action='deleteMail' method='post' >");
              String nam=res.getString("name");
              
              String adr=res.getString("addr");
              int id=res.getInt("id");
              out.println("<tr class='table-warning'><td><input type=checkbox class='custom-checkbox' name='addr' value="+id+"/></td><td>"+nam+"</td><td>"+adr+"</td><td><a href='addressMsg?to="+adr+"'>Send Message</a></td></tr>");  
            }
           
            
            out.println("</table>");
            out.println("<div class='form group row'>");
           
             out.println("<input type='submit' class='btn btn-outline-warning btn-block col-sm-2' value='delete' onclick=location.href='http://localhost:8080/servlet/deleteMail' />");
            
            out.println("</div>");
            out.println("<div class='form group row'>");
            out.println("<div class='addn col-sm-3'>");
          out.println("<button class='btn btn-outline-info '><a href='addressNew.jsp'  target=rightside>Add new address</a></button>");
          out.println("</div>");out.println("</div>");
          out.println("</form>");
          out.println("</div>");
           out.println("</body></html>"); 
        }
        catch(Exception e){
            out.println("Something went wrong"+e);
        }
    }

    
}
