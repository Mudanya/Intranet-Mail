

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class newAdress extends HttpServlet {
PrintWriter out;
Connect dbcon;
Connection con;
PreparedStatement pst;
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
        response.setContentType("text/html;charset=UTF-8");
       try{
           out=response.getWriter();
           
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
           
         
           String name=request.getParameter("nem");
           
           String addr=request.getParameter("adr");
           
           try{
           String nw="insert into addressbook(name,author,addr) values('"+name+"','"+unem+"','"+addr+"')";
           pst=con.prepareStatement(nw);
           pst.execute();
           }
           catch(Exception e)
           {
               out.println("Error"+e.getMessage());
           }
           out.println("Adress Book updated successfully!");
           //response.setHeader("Refresh","2;URL=address");
           
           
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }

}
