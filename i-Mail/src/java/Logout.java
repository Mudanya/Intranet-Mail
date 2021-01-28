
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {
PrintWriter out;
   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    try{
        
        String unem;
       Cookie []c=request.getCookies();
        if(c!=null)
        {
            for(int u=0;u<c.length;u++)
            {
                if(c[u].getName().equals("signin"))
                {
                    unem=c[u].getValue();
                    c[u].setValue(null);
                }
            }
          out=response.getWriter();
    out.println("<p><h3><i>Thank you for visiting i-Mail</i></h3><p><a href='home.jsp'>Login Again </a>");
    response.setHeader("Refresh","1;URL=signin.jsp");   
        }    
    }
    catch(Exception e){
        e.printStackTrace();
    }
   
}
}