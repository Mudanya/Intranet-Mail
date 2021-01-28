

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addressMsg extends HttpServlet {
PrintWriter out;

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            out=response.getWriter();
            out.println("<html>\n" +
"    <head>" +
       
"   <script language=javascript>\n" +
"	function checkfornull()\n" +
"	{\n" +
"		if(document.f1.to.value==\"\")\n" +
"		{\n" +
"			alert(\"You must enter Recipient's address\");\n" +
"			document.f1.to.focus();\n" +
"		}\n" +
"		else\n" +
"			document.f1.submit();\n" +
"	}\n" +
"</script>"
                    + "<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n" +
"          <script src=\"bootstrap/jquery.min.js\"></script>\n" +
"          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n" +
"          <style>\n" +
"              .bg-1{\n" +
"                  padding-top:20px;\n" +
"                  padding-bottom:10px;\n" +
"                 \n" +
"              }\n" +
"              .alen{text-align: right;\n" +
"                 color:purple;\n" +
"              }\n" +
"              .msgPad{padding-top: 10px;}\n" +
"              body{\n" +
"                \n" +
"              }\n" +
"          </style>"
                    
                    + "</head>");
            String mto=request.getParameter("to");
            out.println("<body background=\"bak.JPG\"> <div class=\"container-fluid msgPad\">\n" +
"<form class=\"form-horizontal\" action=\"composeMsg\" method=post name=f1 enctype=\"multipart/form-data\">\n" +
"\n" +
                    
        " <div class=\"form-group row\"> \n" +
"        <label for=\"to\" class=\"control-label col-sm-2 alen\">Send message To:</label>\n" +
"        <div class=\"col-sm-6\">\n" +
"<input class=\"form-control \" value="+mto+" type=text name=to id=\"to\" size=50  >\n" +
"        </div>\n" +
"    </div>\n" +
                    
"    <div class=\"form-group row\"> \n" +
"        <label for=\"sub\" class=\"control-label col-sm-2 alen\">Subject:</label>\n" +
"        <div class=\"col-sm-6\">\n" +
"<input class=\"form-control\" type=text name=sub id=\"sub\" size=50 placeholder=\"Subject\" >\n" +
"        </div>\n" +
"    </div>\n" +

"    <div class=\"form-group row\"> \n" +
"        <label for=\"msg\" class=\"control-label col-sm-2 alen\" >Message:</label>\n" +
"        <div class=\"col-sm-6 \">\n" +
"    <textarea  class=\"form-control\" rows=5 id=\"msg\" name=msg placeholder=\"Enter your message here\"></textarea>\n" +
"        </div>\n" +
"    </div>\n" +
"    \n" +
"    <div class=\"form-group row\"> \n" +
"        <label  class=\"col-sm-2\"></label>\n" +
"       <div class=\"custom-file col-sm-6\"> \n" +
"    <input class=\"custom-file-input\" id=\"fle\" type=\"file\" name=\"file\">\n" +
"    <label for=\"fle\" class=\"custom-file-label\">Attachments</label>\n" +
"       </div>\n" +
"    </div>\n" +
"    \n" +
"<div class=\"form-group row\"> \n" +
"<label  for='snd' class=\"control-label col-sm-2\"></label>\n" +
"    <div class=\"col-sm-3\">\n" +
"	<input class=\"form-control btn btn-block btn-outline-primary\" id=\"snd\" type=button name=sendmail value=Send onclick=\"checkfornull();\">\n" +
"    </div>\n" +
"</div>\n" +
"    \n" +
"</form>\n" +
"</div></body></html>");
        }
        catch(Exception e){
            
        }
    }
}
