package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class staffid_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("           <script src=\"jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bundle.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bundle.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Staff ID</title>\n");
      out.write("        \n");
      out.write("         <script language=javascript>\n");
      out.write("\tfunction check()\n");
      out.write("\t{\n");
      out.write("\t\tif(document.fmr.upd.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"You must enter a value\");\n");
      out.write("\t\t\tdocument.fmr.upd.focus();\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t\tdocument.fmr.submit();\n");
      out.write("\t}\n");
      out.write("        \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  .bgy{padding-top: 20px;\n");
      out.write("                 top:50%;\n");
      out.write("                 left:50%;\n");
      out.write("                 position: absolute;\n");
      out.write("                 transform: translate(-50%,-50%);\n");
      out.write("                 background-color: paleturquoise;\n");
      out.write("  } \n");
      out.write("  .aln1{text-align: right;\n");
      out.write("  color: #10707f}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"bak.JPG\">\n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-primary navbar-dark\">\n");
      out.write(" <a class=\"navbar-brand\" href=\"admin\">Administrator</a>\n");
      out.write(" <ul class=\"navbar-nav\"> \n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Options\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"staffid.jsp\">Update Staff ID</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Change Password</a>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("   <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Logout</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("         ");

               PreparedStatement ps;
               
               Connection con;
               ResultSet res;
               try{
                   
                   Class.forName("com.mysql.jdbc.Driver");
                   con =DriverManager.getConnection("jdbc:mysql://localhost/maildata","root","");
                   PrintWriter ot=response.getWriter();
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
                   ot.println("<table class='table'><tr class='table-info'><th>Staff IDs</th></tr>");
                   String file="select * from staff_id";
                   ps=con.prepareStatement(file);
                   res=ps.executeQuery();
                   while(res.next()){
                       String staff=res.getString("staff_id");
                       ot.println("<tr><td>"+staff+"</td></tr>");
                       }
                   ot.println("</table>");
               }
               catch(Exception e){
                   
               }
                
             
                   
           
      out.write("\n");
      out.write("        <div class=\"container-fluid bgy col-sm-6\">\n");
      out.write("      \n");
      out.write("            <form method=\"post\" action=\"staffUpdate\" name=\"fmr\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"updet\" class=\"control-label col-sm-3 aln1\">Update Staff ID:</label>  \n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"updet\" name=\"upd\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group row\">\n");
      out.write("                     <label class=\"col-sm-3\"></label> \n");
      out.write("                     <div class=\"col-sm-9\">\n");
      out.write("                         <input class=\"btn btn-block btn-outline-info\" type=\"button\" value=\"Update ID\" onclick=\"check();\"/>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
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
