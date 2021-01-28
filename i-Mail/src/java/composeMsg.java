

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class composeMsg extends HttpServlet {
PrintWriter out;
Connect dbcon;
Connection con;
Statement stm;
PreparedStatement pst;
ResultSet res;
 public void init(ServletConfig sc) throws ServletException{
   try{
       super.init(sc);
       dbcon=new Connect();
       con=dbcon.setConnection();
       stm=con.createStatement();
       
   } 
   catch(Exception e){
       System.out.println(e.toString());
   }
 }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        response.setContentType("text/html;charset=UTF-8");
        out=response.getWriter();
        
        String to=request.getParameter("to");
        String sub=request.getParameter("sub");
        String msg=request.getParameter("msg");
        
        //file
        Part part=request.getPart("file");
        
        String filename=extractFileName(part);
        
        String savepath="E:\\i-Mail\\web\\images\\"+File.separator+filename;
        File filesavedir=new File(savepath);
        
        part.write(savepath+File.separator);
        
        
        
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
        java.util.Date det=new java.util.Date();
        int day=det.getDay();
        int month=det.getMonth()+1;
        int year =det.getYear()+1900;
         res=dbcon.getResult("select * from register where username='"+to+"'", con);
               if(res.next())
               {
                   res=dbcon.getResult("select * from register where username='"+unem+"'", con);
                   if(res.next()){
                String snd="insert into inbox(msg_to,msgfrom,subject,msg,msgdate,filename,path) values('"+to+"','"+unem+"','"+sub+"','"+msg+"','"+day+"/"+month+"/"+year+"','"+filename+"','"+savepath+"')";
        stm.execute(snd);
        try{
        String sent="insert into sent(msg_from,msg_to,subject,message,date) values('"+unem+"','"+to+"','"+sub+"','"+msg+"','"+day+"/"+month+"/"+year+"')";
        pst=con.prepareStatement(sent);
        pst.execute();
        }
        catch(Exception e){
           out.println("error"+e); 
        }
        
         out.println("<html><head><script>{" +

"          alert('Message send successfully to "+to+"');window.history.go(-1);}</script></head></html>");
        
        response.setHeader("Refresh","2;URL=Compose.jsp");
                   }
                   else{
                       String un="Unknown";
                       String spam="insert into spam(msgfrom,subject,msg,msgdate,filename,path,msgto) values('"+un+"','"+sub+"','"+msg+"','"+day+"/"+month+"/"+year+"','"+filename+"','"+savepath+"','"+to+"')";
                       pst=con.prepareStatement(spam);
                       pst.execute();
                       
                        out.println("<html><head><script>{" +

"          alert('Message send to "+to+"');window.history.go(-1);}</script></head></html>");
        
        response.setHeader("Refresh","2;URL=Compose.jsp");
                   }
       
               }
               else
               {
                  
                   out.println("<html><head><script>{alert('Invalid address-The user might be unregistered');"
                           + "window.history.go(-1);}</script></head></html>");
               }
         
    } catch (SQLException ex) {
        out.println("Data too long,unable to send "+ex);
        //response.setHeader("Refresh","2;URL=Compose.jsp");
    }
    }

    private String extractFileName(Part part) {
       String contentDisp=part.getHeader("content-disposition");
       String[] items=contentDisp.split(";");
       for(String s:items){
           if(s.trim().startsWith("filename")){
             return s.substring(s.indexOf('=')+2, s.length()-1);
           }
       }
       return "=";
    }

}
