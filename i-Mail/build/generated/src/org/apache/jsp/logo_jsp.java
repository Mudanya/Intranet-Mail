package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;

public final class logo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Logo</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("          <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("          \n");
      out.write("          <style>\n");
      out.write("              .bg-1{\n");
      out.write("                  background-color:#545b62;\n");
      out.write("              }\n");
      out.write("              body{\n");
      out.write("                background-color:#545b62;   \n");
      out.write("              }\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid bg-1\">\n");
      out.write("           ");

               PreparedStatement ps;
               
               Connection con;
               ResultSet res;
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   con =DriverManager.getConnection("jdbc:mysql://localhost/maildata","root","");
                   
                       String nem=null;
              Cookie c[]=request.getCookies();
             if(c!=null){
             for(int i=0;i<c.length;i++)
               {
               if(c[i].getName().equals("signin"))
               {
                   nem=c[i].getValue();
                   break;
               }
               }
             }
                   
                   String file="select filename from register where username='"+nem+"'";
                   ps=con.prepareStatement(file);
                   res=ps.executeQuery();
                   while(res.next()){
                       String filename=res.getString("filename");
                   
           
      out.write("\n");
      out.write("           <image src=\"images/");
      out.print(filename);
      out.write("\" width=\"10\" height=\"10\" />\n");
      out.write("           ");
 }
                   
               }
               catch(Exception e)
               {
                   
               }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
