
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class download extends HttpServlet {

    Connect dbcon;
    Connection con;
    ResultSet res;
    PrintWriter out;
    PreparedStatement pst = null;

    public void init(ServletConfig sc) throws ServletException {
        try {
            super.init(sc);
            dbcon = new Connect();
            con = dbcon.setConnection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            out.println("<html>");
     out.println("<head>");
     out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"        \n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>");
     out.println("</head>");
     out.println("<body background=\"bak.JPG\" text=blue>");
            
            
            
            String frm = request.getParameter("getn");
            String id = request.getParameter("getid");

            String unem = null;
            Cookie[] c = request.getCookies();
            if (c != null) {
                for (int u = 0; u < c.length; u++) {
                    if (c[u].getName().equals("signin")) {
                        unem = c[u].getValue();
                        break;
                    }
                }
            }

            String sel = "select * from inbox where id=? and msgfrom=?";
            pst = con.prepareStatement(sel);
            pst.setString(1, id);
            pst.setString(2, frm);
            res = pst.executeQuery();
            while (res.next()) {
                String filenem = res.getString("filename");
                String filePath ="E:\\i-Mail\\web\\images\\";
                response.setContentType("APPLICATION/OCTET-STREAM");
                response.setHeader("content-Disposition","attachment;filename=\""+filenem+"\"");
                FileInputStream fis=new FileInputStream(filePath+filenem);
                int i;
                while((i=fis.read())!=-1)
                
                    out.write(i); 
                out.println("<html><head><script>{alert('Succesfully downloaded your file!');"
                           + "window.history.go(-1);}</script></head></html>");
                    out.close();
                    fis.close();
                
                
               
            }
            
        
      out.println("</body>");
      out.println("</html>");
        } catch (Exception e) {
out.println(e);
        }
    }

}
