package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .tdtheme{\n");
      out.write("            border-radius: 20px;\n");
      out.write("            width: 15%;\n");
      out.write("            height: 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-family: arial;\n");
      out.write("              \n");
      out.write("        }\n");
      out.write("        .tdtheme:hover{\n");
      out.write("            background-color:none;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<!--    <div> <table style=\"background: rgba(0,0,0,0.2);\n");
      out.write("           margin-left: 550px;padding-bottom: 100px;border-radius: 20px;width: 400px;height:300px;\">\n");
      out.write("                \n");
      out.write("      </table>  -->\n");
      out.write("    <body background=\"hoodie.jpg\" style=\"background-repeat:no-repeat;width:30%;height:50%;background-size:100% 100%;\">\n");
      out.write("    <div style=\"background-color:rgba(0,0,0,0.6);padding-right:1500px;padding-top:-80px;\">\n");
      out.write("<!--        <div style=\"width:400px;height:200px;background-image:url(\"292929.png\");\n");
      out.write("             margin-left:550px;margin-top:-200px;border-radius:30px;\">-->\n");
      out.write("                \n");
      out.write("                 <div style=\"background:rgba(0,0,0,0.7); height:100px;width:1500px\">\n");
      out.write("                  \n");
      out.write("            <table width=\"100%\">\n");
      out.write("            <tr   align=\"center\">\n");
      out.write("                <td style=\"margin-left:50px;padding-bottom:15px;\">\n");
      out.write("                 <div style=\"background-color :rgba(255,189,222,0.4);\">   \n");
      out.write("                <div><img src=\"L.png\" style=\"width:100px;height: 100px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;\"></td>\n");
      out.write("                   \n");
      out.write("                <td>\n");
      out.write("                </div>\n");
      out.write("        <div style=\"width:500px; color:white;padding-right:800px;margin-left:-150px;\">\n");
      out.write("            <h1>HUMANE SOCIETY FOR<br> PETS</a></h1>\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("    <div style=\"width:400px;height:200px;margin-left:950px;margin-bottom:550px;margin-top:-100px;\">\n");
      out.write("       \n");
      out.write("<table width=\"100%\" style=\"margin-right:100px;padding-right:250px;\">\n");
      out.write("        \n");
      out.write("    <tr  align=\"center\">\n");
      out.write("            \n");
      out.write("                <td class=\"tdtheme\"><img src=\"home.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-left:50px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-right:50px;font-size:16px;\"><a href=\"homepage.jsp\">HOME</a></td>\n");
      out.write("                \n");
      out.write("                <td class=\"tdtheme\"><img src=\"icon_info.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-right:0px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"aboutus.jsp\">ABOUT US</a></td>\n");
      out.write("               \n");
      out.write("                <td class=\"tdtheme\"><img src=\"contactus1.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-left:0px;padding-left:50px;\">\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"padding-top:20px;font-size:16px;\"><a href=\"contactus.jsp\">CONTACT US</a></td>\n");
      out.write("                  \n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("   \n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("       <tr align=\"center\">\n");
      out.write("        <div>   <img src=\"c.png\" style=\"width:700px;height:500px;margin-left:25px;border:inset;\n");
      out.write("                     margin-top:30px;border-radius:5px;\">\n");
      out.write("<!--       <div style=\"color:purple;margin-left:900px;\">-->\n");
      out.write("<!--                     <p>fgfhgfhsdghfgsf fghsgf sgfhe hff hh dfhjh</p>-->\n");
      out.write("<!--                    </div>            -->\n");
      out.write("              </tr></div>\n");
      out.write("        <div style=\"background-color:rgba(0,183,235,0.4);margin-bottom:500px;margin-top: 110px;\n");
      out.write("             width: 1500px;height: 80px;\">\n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <marquee scrollamount=\"10\" behavior=\"scroll\" direction=\"right\">\n");
      out.write("                    <h2><i><b>Please do visit our other social media accounts\n");
      out.write("                       <img src=\"fit1.jpg\" style=\"width:80px;height:50px;border-radius:15px;margin-bottom: -20px;\"></b></i></h2>\n");
      out.write("                    \n");
      out.write("        </marquee>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
