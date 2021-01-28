package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome/css/all.css\">\n");
      out.write("          <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Sign in</title>\n");
      out.write("        \n");
      out.write("        <!--Java script-->\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("           function validUsr(){\n");
      out.write("               if(document.Login.usr.value==\"\"){\n");
      out.write("                   document.getElementById(\"errorUsr\").innerHTML=\"You must input your username\";\n");
      out.write("                   document.getElementById(\"errorUsr\").style.color=\"red\";\n");
      out.write("               }\n");
      out.write("             else if(document.Login.pwd.value==\"\"){\n");
      out.write("                   document.getElementById(\"errorPwd\").innerHTML=\"Provide Password\";\n");
      out.write("                   document.getElementById(\"errorPwd\").style.color=\"red\";\n");
      out.write("                   \n");
      out.write("               }\n");
      out.write("               else\n");
      out.write("               {\n");
      out.write("                document.Login.submit();\n");
      out.write("               }\n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("             \n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    \n");
      out.write("           .bg-1{\n");
      out.write("                /* background-color: #1abc9c;  Green */\n");
      out.write("                 color: #545b62;\n");
      out.write("                 \n");
      out.write("                 padding-bottom: 50px;\n");
      out.write("                 top:55%;\n");
      out.write("                 left:75%;\n");
      out.write("                 position: absolute;\n");
      out.write("                 transform: translate(-50%,-50%);\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                .pr{\n");
      out.write("                    color:#1abc9c;\n");
      out.write("                }\n");
      out.write("                body{\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                .alf{text-align: right;s}\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("<body background=\"bak.JPG\"> \n");
      out.write("        \n");
      out.write("      <!--Header container-->   \n");
      out.write("     <nav class=\"navbar navbar-expand-sm bg-primary navbar-dark justify-content-between\">\n");
      out.write(" <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("     Intranet Mail \n");
      out.write(" </a>\n");
      out.write(" <span class=\"navbar-text\">SignIn</span>\n");
      out.write(" <ul class=\"navbar-nav \"> \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  </ul>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</nav>  \n");
      out.write("      \n");
      out.write("      <!--Body container-->   \n");
      out.write("    <div class=\"container-fluid bg-1 \">\n");
      out.write("            \n");
      out.write("     \n");
      out.write("        <form class=\"form-horizontal\" name=\"Login\" method=\"post\" action=\"entry\"> \n");
      out.write("          <!-- Log in details--> \n");
      out.write("          \n");
      out.write("  <!--username-->\n");
      out.write("    <div class=\"form-group row\">\n");
      out.write("       <label for=\"usr\" class=\"col-sm-2 control-label alf\" >User Name:</label>\n");
      out.write("           <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-user-circle\"></i></span>  </div>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usr\" name=\"usr\" >\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <div class=\"form-group row has-error\">\n");
      out.write("     <label class=\"col-sm-2 \"></label><label class=\"col-sm-3 control-label\" id=\"errorUsr\"></label>  \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write(" <!--password--> \n");
      out.write("       <div class=\"form-group row\">\n");
      out.write("           <label for=\"pwd\" class=\"col-sm-2 control-label alf\" > Password: </label>\n");
      out.write("               <div class=\"input-group col-sm-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"fa fa-unlock-alt\"></i></span>  </div>\n");
      out.write("                 <input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pwd\">\n");
      out.write("              </div>\n");
      out.write("       </div>\n");
      out.write(" \n");
      out.write(" <div class=\"form-group row\">\n");
      out.write("     <label class=\"col-sm-2 \"></label><label class=\"col-sm-3 control-label\" id=\"errorPwd\"></label> \n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write(" <!--signin-->\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("            <label class=\"col-sm-2 control-label\"></label>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("             <input type=\"button\" class=\"form-control btn-primary   \" Value=\"Sign in\" onclick=\"validUsr();\">\n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
      out.write("          \n");
      out.write("         <div class=\"form-group row\">\n");
      out.write("    <label class=\"col-sm-4\"></label> \n");
      out.write(" </div>\n");
      out.write(" <!--signup-->\n");
      out.write("        <div class=\"form-group row pr\">\n");
      out.write("          <label  class=\"col-sm-2 control-label \">Don't have an account?</label>\n");
      out.write("            <div class=\"col-sm-3\" >  \n");
      out.write("             <a href=\"signup.jsp\" class=\"form-control btn btn-secondary \">Sign up</a>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write(" \n");
      out.write("          \n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
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
