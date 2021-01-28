

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Option extends HttpServlet {
Connect dbcon;
Connection con;
ResultSet rs;
String nem,pd;
 PrintWriter out;  
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            dbcon=new Connect();
            con=dbcon.setConnection();
           out=response.getWriter();
           HttpSession ses=request.getSession(true);
           nem=ses.getValue("name").toString();
           rs=dbcon.getResult("select password from register where username='"+nem+"'",con);
           pd="";
           try{
               rs.next();
               pd=rs.getString(1);
           }
           catch(Exception e){}
        
           out.println("<html><body><form action='Changepwd' method=post>"
                   + "Old Password: <input type=password name=odp value="+pd+"/><br><br>"
                   + "New Password:<input type=password name=npd value=''/><br><br>"
                   + "<input type=submit value='Change Password' name=sub/></form></body></html>");
             }
        catch(Exception e){
            e.printStackTrace();
        }

    
    }
}
