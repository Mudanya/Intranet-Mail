package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("           <script src=\"jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bundle.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bundle.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write(" \n");
      out.write("  .carousel-inner img {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 100%;\n");
      out.write("  }\n");
      out.write("  #demo{\n");
      out.write("      width: 80%;\n");
      out.write("      height: 60%;\n");
      out.write("      align-content: center;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div id=\"imail\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#imail\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#imail\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#imail\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#imail\" data-slide-to=\"3\"></li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"send.png\" alt=\"Send\" width=\"200px\" height=\"150px\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Send</h3>\n");
      out.write("        <p>Mails</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"receive.jpg\" alt=\"Receive\" width=\"200px\" height=\"150px\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Receive</h3>\n");
      out.write("        <p>Mails</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"intra.jpg\" alt=\"New York\" width=\"200px\" height=\"150px\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Over</h3>\n");
      out.write("        <p>The Intranet</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img src=\"intranet.jpg\" alt=\"New York\" width=\"200px\" height=\"150px\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>i-Mail</h3>\n");
      out.write("        <p>Intranet Mailing system</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#imail\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#imail\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
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
