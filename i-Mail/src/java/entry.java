
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class entry extends HttpServlet {
Connection con;
ResultSet res, rst;
String user,pass,query;
Connect dbcon;
PrintWriter out;
   
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         
        
        try{
           
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
       // user=request.getParameter("usr");
        pass=request.getParameter("pwd");
        dbcon=new Connect();
        con=dbcon.setConnection();
         HttpSession session = request.getSession(true);
         session.putValue("name",request.getParameter("usr"));
         user=session.getValue("name").toString();
         if(user.equals("admin")){
         String adm="select * from admin where username='"+user+"' and password='"+pass+"'";
         rst=dbcon.getResult(adm,con);   
         if(rst.next()){
           Cookie cookn=new Cookie("signin",user);
	response.addCookie(cookn); 
             
       response.sendRedirect("admin");   
         }
         else{
              out.println("<html><head><script>{" +

"alert('Wrong username and password combination for administrator. Try Again!');window.history.go(-1);}</script></head></html>");
            
            response.setHeader("Refresh","1;URL=signin.jsp");   
         }
         }
         else{
        query="select * from register where username ='"+user+"'";
        
        res=dbcon.getResult(query,con);
       
        if(res.next()){
         rst=dbcon.getResult("select * from register where username ='"+user+"' and password='"+pass+"'",con);   
         if(rst.next())
         {
        Cookie cookin=new Cookie("signin",user);
	response.addCookie(cookin); 
             
       response.sendRedirect("imail.jsp");
         }
       
        else
        {
         out.println("<html><head><script>{" +

"alert('Wrong username and password combination. Try Again!');window.history.go(-1);}</script></head></html>");
            
            response.setHeader("Refresh","1;URL=home.jsp");   
        }
        
            }
        else{
           out.println("<html><head><script>{" +

        "alert('The username does not exist!');window.history.go(-1);}</script></head></html>");
            response.setHeader("Refresh","1;URL=home.jsp");
        }
        }
        }
  catch(Exception e)
               {
          out.println("Error"+e.toString());
               }
}
   

}
