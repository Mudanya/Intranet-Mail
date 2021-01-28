
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.StringTokenizer;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class deleteMail extends HttpServlet {
PrintWriter out;
Connect dbcon;
Connection con;
ResultSet res;
Statement stm;   
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        out.println("<html>");
        out.println("<head>");
         out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
            out.println("<body>");
            out.println("<div class='container-fluid'>");
        //cookie
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
     
      String []inbox=request.getParameterValues("chk1");
      
      String []sent=request.getParameterValues("chek");
      
      String []addr=request.getParameterValues("addr");
      
      String []usr=request.getParameterValues("user");
      
      String []spam=request.getParameterValues("sek");
      int cnt=0;
        if(inbox!=null&&inbox.length!=0)
        {
           for(String ch:inbox){
               cnt++;
               String del="delete from inbox where id=?";
               pst=con.prepareStatement(del);
               pst.setString(1, ch);
               pst.execute();
               
           }
            out.println("<div class='alert alert-success col-sm-9'>"+cnt+" record(s) deleted!</div>");
           response.setHeader("Refresh","2;inbox.jsp");
        }
        
       else if(spam!=null&&spam.length!=0)
        {
           for(String ck:spam){
               cnt++;
               String kil="delete from spam where id=?";
               pst=con.prepareStatement(kil);
               pst.setString(1, ck);
               pst.execute();
               
           }
           out.println("<div class='alert alert-success col-sm-9'>"+cnt+" record(s) deleted!</div>");
           response.setHeader("Refresh","2;Spam");
        } 
       
       else if(sent!=null&&sent.length!=0)
        {
           for(String snt:sent){
               cnt++;
               String kil="delete from sent where id=?";
               pst=con.prepareStatement(kil);
               pst.setString(1, snt);
               pst.execute();
               
           }
           out.println("<div class='alert alert-success col-sm-9'>"+cnt+" record(s) deleted!</div>");
           response.setHeader("Refresh","2;SentMsg");
        } 
       
      else if(usr!=null&&usr.length!=0)
        {
           for(String ck:usr){
               cnt++;
               String kil="delete from register where username=?";
               pst=con.prepareStatement(kil);
               pst.setString(1, ck);
               pst.execute();
               
             
               
           }
           out.println("<div class='alert alert-success col-sm-9'>"+cnt+" record(s) deleted!</div>");
           response.setHeader("Refresh","2;admin");
        }
        else if(addr!=null&&addr.length!=0)
        {
           for(String ad:addr){
               cnt++;
               String kil="delete from addressbook where id=?";
               pst=con.prepareStatement(kil);
               pst.setString(1, ad);
               pst.execute();
               
           }
           out.println("<div class='alert alert-success col-sm-9'>"+cnt+" record(s) deleted!</div>");
           response.setHeader("Refresh","2;address");
        }
        else
        out.println("<div class='alert alert-danger col-sm-9'>"
               
                + "<strong>No record(s)</strong> to delete make sure to select one</div>");
       
    out.println("</div>");
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    }
        
        catch(Exception e){
            
        }
    
     
    
     
    }
   
}
