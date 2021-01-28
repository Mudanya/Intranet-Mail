

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Changepwd extends HttpServlet {
Connection con;
Connect dbcon;
ResultSet rst;
Statement stm;
PrintWriter wot;
String un;
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            wot=response.getWriter();
            HttpSession sen=request.getSession();
            un=sen.getValue("name").toString();
            dbcon=new Connect();
            con=dbcon.setConnection();
            stm=con.createStatement();
            String psd=request.getParameter("npd");
            int chng=stm.executeUpdate("update register set password='"+psd+"' where username='"+un+"'");
            wot.println("<html><body>Password changed!</body></html>");
            response.setHeader("Refresh","2;URL=reset.jsp");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    
}
