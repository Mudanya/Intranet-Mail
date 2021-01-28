package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Compose_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("          <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>i-Mail</title>\n");
      out.write("   <script language=javascript>\n");
      out.write("\tfunction checkfornull()\n");
      out.write("\t{\n");
      out.write("\t\tif(document.f1.to.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"You must enter Recipient's address\");\n");
      out.write("\t\t\tdocument.f1.to.focus();\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t\tdocument.f1.submit();\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("          <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("          <style>\n");
      out.write("              .bg-1{\n");
      out.write("                  padding-top:20px;\n");
      out.write("                  padding-bottom:10px;\n");
      out.write("                 \n");
      out.write("              }\n");
      out.write("              .alen{text-align: right;\n");
      out.write("                 color:purple;\n");
      out.write("              }\n");
      out.write("              .msgPad{padding-top: 10px;}\n");
      out.write("              body{\n");
      out.write("                \n");
      out.write("              }\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("<body >\n");
      out.write("<!--<h2 align=center><font face=\"times new roman\" color=blue>Compose your message</font></h2>-->\n");
      out.write("<div class=\"container-fluid msgPad\">\n");
      out.write("<form class=\"form-horizontal\" action=\"composeMsg\" method=post name=f1 enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("<div class=\"form-group row\"> \n");
      out.write("    <label for=\"rec\" class=\"control-label col-sm-1 alen\">To:</label>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("<input class=\"form-control\" type=text id=\"rec\" name=to size=50 placeholder=\"Recipient\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group row\"> \n");
      out.write("        <label for=\"sub\" class=\"control-label col-sm-1 alen\">Subject:</label>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("<input class=\"form-control\" type=text name=sub id=\"sub\" size=50 placeholder=\"Subject\" >\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <div class=\"form-group row\"> \n");
      out.write("        <label for=\"msg\" class=\"control-label col-sm-1 alen\" >Message:</label>\n");
      out.write("        <div class=\"col-sm-6 \">\n");
      out.write("    <textarea  class=\"form-control\" rows=5 id=\"msg\" name=msg placeholder=\"Enter your message here\"></textarea>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group row\"> \n");
      out.write("        <label  class=\"col-sm-1\"></label>\n");
      out.write("       <div class=\"custom-file col-sm-6\"> \n");
      out.write("    <input class=\"custom-file-input\" id=\"fle\" type=\"file\" name=\"file\">\n");
      out.write("    <label for=\"fle\" class=\"custom-file-label\">Attachments</label>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<div class=\"form-group row\"> \n");
      out.write("    <label  class=\"col-sm-1\"></label>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("\t<input class=\"btn btn-block btn-outline-primary\" id=\"snd\" type=button name=sendmail value=Send onclick=\"checkfornull();\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("</div>\n");
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
