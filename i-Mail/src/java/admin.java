

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


public class admin extends HttpServlet {

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
     out.println(" <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        <link rel=\"stylesheet\" href=\"font_awesome/css/font-awesome.min.css\">\n" +
"           <script src=\"jquery/3.3.1/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bundle.js\"></script>\n" +
"          <script src=\"bootstrap/js/bundle.min.js\"></script>" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("<style type='text/css'>");
     out.println(".bgf{padding-top:20px;}");
     out.println("</style>");
     out.println("</head>");
     out.println("<body background=\"bak.JPG\" text=blue>");
     
     out.println("<nav class=\"navbar navbar-expand-sm bg-primary navbar-dark\">\n" +
"  <a class=\"navbar-brand\" href=\"#\">Administrator</a>\n" +
"  <ul class=\"navbar-nav\">\n" +
"    <li class=\"nav-item dropdown\">\n" +
"      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n" +
"        Options\n" +
"      </a>\n" +
"      <div class=\"dropdown-menu\">\n" +
"        <a class=\"dropdown-item\" href=\"staffid.jsp\">Update Staff ID</a>\n" +
"        <a class=\"dropdown-item\" href=\"#\">Change Password</a>\n" +
"     </div>\n" +
"    </li>\n" +
"    <li class=\"nav-item\">\n" +
"      <a class=\"nav-link\" href=\"signin.jsp\">Logout</a>\n" +
"    </li>\n" +
"  </ul>\n" +
"</nav>");
     
     out.println("<div class='container-fluid bgf'>");
      out.println("<p>Registered Users</p>");
      out.println("<form method='post' action='deleteMail'>");
     out.println("<table class='table table-hover'>");
       out.println("<tr class='table-primary'><th></th><th>FullName</th><th>Username</th><th>Gender</th><th>DOB</th><th>Email address</th><th>Phone number</th><th>Staff ID</th> </tr>");
     
       String reg="select * from register";
       pst=con.prepareStatement(reg);
       res=pst.executeQuery();
       while(res.next()){
         String ful=res.getString("full_name");
         String usr=res.getString("username");
         String gen=res.getString("gender");
         String dob=res.getString("dob");
         String eml=res.getString("email_address");
         String phn=res.getString("phone_number");
         String sid=res.getString("staff_id");
         out.println("<tr class='table-danger'><td><input type=checkbox name='user' value="+usr+"></td><td>"+ful+"</td><td>"+usr+"</td><td>"+gen+"</td><td>"+dob+"</td><td>"+eml+"</td>"
                 + "<td>"+phn+"</td><td>"+sid+"</td></tr>");
        
			
     }
     out.println("</table>");
     out.println("<input class='btn btn-warning' type='submit' value='Delete' onclick=location.href='http://localhost:8080/servlet/deleteMail'>");
    out.println("</form>");
    
     
    
     out.println("</div>");
    out.println("</body>");
    out.println("</html>");
     
     
        }
        catch(Exception e){
            out.println(e);
            
        }
        
        
        
        
    }

  
}
