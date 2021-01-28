package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome/css/all.css\">\n");
      out.write("          <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Signup</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"jquery-ui-1.12.1/jquery-ui.css\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <script src=\"jquery-ui-1.12.1/jquery-ui.js\"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("            function checkpwd(){\n");
      out.write("           if (document.getElementById(\"v3\").value !== document.getElementById(\"v4\").value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password Mismatch!\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .aln{text-align: right;}\n");
      out.write("            .bg_valuz{\n");
      out.write("                padding-top: 20px;\n");
      out.write("                margin-left: 20%;\n");
      out.write("                 \n");
      out.write("                }\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body background=\"bak.JPG\" onload=document.fm.v1.focus();>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-primary navbar-dark justify-content-between\">\n");
      out.write(" <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("     Intranet Mail \n");
      out.write(" </a>\n");
      out.write(" <span class=\"navbar-text\">SignUp</span>\n");
      out.write(" <ul class=\"navbar-nav \"> \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  </ul>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</nav>  \n");
      out.write("         <div class=\"container-fluid bg_valuz\">  \n");
      out.write("             \n");
      out.write("       <form class=\"form-horizontal\" action=\"signup\" method=\"post\" name=\"fm\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("          <div class=\"form-group row \">\n");
      out.write("              \n");
      out.write("               <label for=\"fnm\" class=\"col-sm-2 control-label aln\" >Full Name:\n");
      out.write("              </label> \n");
      out.write("             \n");
      out.write("              <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-user\"></i></span>  </div>\n");
      out.write("           <input pattern=\".{5,}\" required title=\"name too short\" class=\"form-control\" name=\"v1\" id=\"fnm\" />\n");
      out.write("                 \n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row\">\n");
      out.write("               <label for=\"unm\" class=\"col-sm-2 control-label aln\" placeholder=\"username@imail.org\">Username:</label> \n");
      out.write("             \n");
      out.write("                    <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-user-circle\"></i></span>  </div>\n");
      out.write("                      \n");
      out.write("               <input class=\"form-control\"  name=\"v2\"  id=\"unm\" pattern=\".{3,}\" required title=\"name too short\" />\n");
      out.write("               <div class=\"input-group-append\">\n");
      out.write("                      <span class=\"input-group-text\">@imail.org</span>  </div>\n");
      out.write("                    </div>  \n");
      out.write("              \n");
      out.write("           </div> \n");
      out.write("           \n");
      out.write("           <div class=\"form-group row\">\n");
      out.write("              <label for=\"pwdi\" class=\"col-sm-2 control-label aln\">Password:</label> \n");
      out.write("                <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-lock\"></i></span>  </div>\n");
      out.write("               <input class=\"form-control\" type=\"password\" name=\"v3\" id=\"v3\" pattern=\".{6,}\" required title=\"Password should be atleast 6 in length\"  />\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row\">\n");
      out.write("               <label for=\"pwdc\" class=\"col-sm-2 control-label aln\">Confirm Password:</label> \n");
      out.write("               <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-key\"></i></span>  </div>\n");
      out.write("               <input class=\"form-control \"  type=\"password\" name=\"v4\" id=\"v4\" required/>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row \">\n");
      out.write("               <label  class=\"col-sm-2 control-label aln\">Gender:</label> \n");
      out.write("               <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"custom-control custom-radio custom-control-inline col-sm-1\">\n");
      out.write("                   <input class=\"custom-control-input\" type=\"radio\"  name=\"v5\" id=\"gen1\" value=\"Male\" required/>\n");
      out.write("                   <label class=\"custom-control-label\" for=\"gen1\">Male:</label>\n");
      out.write("                   </div>\n");
      out.write("                   <label class=\"control-label col-sm-1\"></label>\n");
      out.write("                   <div class=\"custom-control custom-radio custom-control-inline col-sm-1\">\n");
      out.write("                   <input class=\"custom-control-input\" type=\"radio\" name=\"v5\" id=\"gen\" value=\"Female\" required/>\n");
      out.write("                   <label class=\"custom-control-label\" for=\"gen\">Female:</label>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("               </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row \">\n");
      out.write("               <label for=\"dob\" class=\"col-sm-2 control-label aln\">Date of Birth:</label> \n");
      out.write("                <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-calendar-check\"></i></span>  </div>\n");
      out.write("               <input class=\"form-control\" type=\"date\" name=\"v6\" id=\"dob\" required/>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row\">\n");
      out.write("               <label for=\"eml\" class=\"col-sm-2 control-label aln\">Email address:</label> \n");
      out.write("                <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-envelope-open\"></i></span>  </div>\n");
      out.write("               <input type=\"email\" class=\"form-control\"  name=\"v7\" id=\"email\" required/>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row \">\n");
      out.write("              <label for=\"phn\" class=\"col-sm-2 control-label aln\">Phone Number:</label> \n");
      out.write("                <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-phone\"></i></span>  </div>\n");
      out.write("              <input class=\"form-control\" type=\"number\" name=\"v8\" id=\"phn\" pattern=\".{8,20}\" required title=\"name too short or too long(8-20)\" />\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row\">\n");
      out.write("               <label for=\"stf\" class=\"col-sm-2 control-label aln\">Staff Id:</label> \n");
      out.write("                <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-id-card\"></i></span>  </div>\n");
      out.write("               <input class=\"form-control\" name=\"v9\" id=\"stf\" />\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"form-group row \">\n");
      out.write("               <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("               <input class=\"form-control btn-warning\" type=reset value=\"Reset\"/><br/>\n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("               <input class=\"form-control btn-primary\" type=submit value=\"Register\"  onClick=\"checkpwd();\"/>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           </form>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       \n");
      out.write("        <script src=\"validate.js\" type=\"text/css\"></script>\n");
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
