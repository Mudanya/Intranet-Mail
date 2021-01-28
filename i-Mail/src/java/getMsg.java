

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getMsg extends HttpServlet {
Connect dbcon;
Connection con;
ResultSet res;
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
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        String mfrm=request.getParameter("msgf");
       String mid=request.getParameter("msgd");
       
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
     
     res=dbcon.getResult("select * from inbox where msgfrom='"+mfrm+"' and id='"+mid+"'", con);
     out.println("<html><head>");
     out.println(" <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        <link rel=\"stylesheet\" href=\"font_awesome/css/font-awesome.min.css\">\n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
     out.println("<body text=blue>");
     out.println("<div class='col-sm-10'>");
     out.println("<table class='table table-hover'>");
       out.println("<tr class='table-primary'><th>Message from</th><th>Subject</th><th>Message</th><th>File</th> </tr>");
     while(res.next()){
         String from=res.getString("msgfrom");
         String subject=res.getString("subject");
         String msg=res.getString("msg");
         String file=res.getString("filename");
         out.println("<tr class='table-danger'><td>"+from+"</td><td>"+subject+"</td><td>"+msg+"</td><td><a href='download?getn="+from+"&getid="+mid+"' target='rightside'>"+file+"</a></td></tr>");
        
			
     }
     out.println("</table>");
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
        }
        catch(Exception exe)
        {
         exe.printStackTrace();
        }
    }

   

}
