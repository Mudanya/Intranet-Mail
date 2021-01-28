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

/**
 *
 * @author Nexo Bentola
 */
public class staffUpdate extends HttpServlet {

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
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         
         try{
              out.println("<html><head>");
     out.println(" <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        <link rel=\"stylesheet\" href=\"font_awesome/css/font-awesome.min.css\">\n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
     out.println("<body text=blue>");
     out.println("<div class='container-fluid col-sm-10'>");
             
             String upd=request.getParameter("upd");
             String fpd=request.getParameter("fpd");
             String sel="select * from staff_id where staff_id=?";
             pst=con.prepareStatement(sel);
             pst.setString(1, upd);
             res=pst.executeQuery();
             if(res.next()){
               out.println("<div class='alert alert-danger col-sm-9'>Staff ID already exists!</div>");
           response.setHeader("Refresh","2;staffid.jsp");  
             }
             else{
             String ins="insert into staff_id values(?,?)";
             
             pst=con.prepareStatement(ins);
             pst.setString(1,fpd);
             pst.setString(2,upd);
             pst.execute();
             out.println("<div class='alert alert-success col-sm-9'>Staff ID updated Successfully!</div>");
           response.setHeader("Refresh","2;staffid.jsp");
             }
             out.println("</div>");
              out.println("</body>");
               out.println("</html>");
         }
         catch(Exception e){
             
         }
         
         
    }

    
}
