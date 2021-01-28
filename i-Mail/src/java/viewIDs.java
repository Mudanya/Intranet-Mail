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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class viewIDs extends HttpServlet {

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
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
         try{
                  
                   PrintWriter out=response.getWriter();
                       
             
                       
                       
                       
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
                     out.println("<div class='col-sm-5'>");  
                   out.println("<table class='table'><tr class='table-info'><th>Full Name</th><th>Staff ID</th></tr>");
                   String file="select * from staff_id";
                   pst=con.prepareStatement(file);
                   res=pst.executeQuery();
                   while(res.next()){
                       String staff=res.getString("staff_id");
                        String staf=res.getString("full_name");
                       out.println("<tr><td>"+staf+"</td><td>"+staff+"</td></tr>");
                       }
                   out.println("</table>");
                   out.println("</div>");
                   out.println("</div>");
                   out.println("</body>");
               }
               catch(Exception e){
                   
               }
        
        
        
        
    }

}
