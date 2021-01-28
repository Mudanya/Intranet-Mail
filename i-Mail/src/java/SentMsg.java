

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SentMsg extends HttpServlet {
Connect dbcon;
Connection con;
ResultSet res;
PreparedStatement pst;
String to,sub,date,msg;
int col=1,a;
PrintWriter out; 
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        try{
           
           dbcon=new Connect();  
         con=dbcon.setConnection();
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
           
            String sent="select * from sent where msg_from=?";
            
            pst=con.prepareStatement(sent);
            pst.setString(1, unem);
            res=pst.executeQuery();
            out.println("<html>");
             out.println("<head>");
     out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
            out.println("<body background=\"bak.JPG\" text=blue>");
            out.println("<div class='container-fluid'>");
            out.println("<div >");
            out.println("<table class='table table-hover'><tr class='table-info'><th></th><th>To</th><th>Subject</th><th>Date</th></tr>");
            while(res.next()){
                out.println("<form method=post action='deleteMail' name=ff>"); 
                to=res.getString("msg_to");
                sub=res.getString("subject");
                msg=res.getString("message");
                date=res.getString("date");
                String id=res.getString("id");
                out.println("<tr class='table-warning'><td><input type=checkbox name='chek' value="+id+"></td><td>"+to+"</td><td>"+sub+"</td><td>"+date+"</td></tr>");
            }
            out.println("</table>");
            out.println("<input class='btn btn-warning' type=submit value='Delete' onclick=location.href='http://localhost:8080/servlet/deleteMail' >");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body></html>");
        
        
        
        
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }

}
