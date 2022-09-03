package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepagepet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
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
      out.write("<!--<div style=\"width: 400px;height: 200px;background-image: url('signup.jpg');             \n");
      out.write("            margin-left: 100px;margin-top: 200px;border-radius: 30px\"></div>-->\n");
      out.write("    <body background=\"hoodie.jpg\" style=\"background-repeat:no-repeat;width:100%;height:100%;background-size:100% 100%;\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div style=\"background-color:rgba(0,0,0,0.9);padding-top:-80px;border:inset;height:720px;\">\n");
      out.write("<!--        <div style=\"width:400px;height:200px;background-image:url(\"292929.png\");\n");
      out.write("             margin-left:550px;margin-top:-200px;border-radius:30px;\">-->\n");
      out.write("                \n");
      out.write("                 <div style=\"background:rgba(0,0,0,0.7); height:100px;width:1500px\">\n");
      out.write("                  \n");
      out.write("            <table width=\"100%\">\n");
      out.write("            <tr   align=\"center\">\n");
      out.write("                <td style=\"margin-left:50px;padding-bottom:15px;\">\n");
      out.write("                 <div style=\"background-color :rgba(255,189,222,0.4);\" >   \n");
      out.write("                <div><img src=\"L.png\" style=\"width:70px;height: 70px;border-radius: 5px;\n");
      out.write("                         font-size: 200px;\"></td>\n");
      out.write("                   \n");
      out.write("                <td>\n");
      out.write("                </div>\n");
      out.write("        <div style=\"width:500px; color:white;padding-right:800px;margin-left:-190px; \">\n");
      out.write("            <h1>HUMANE SOCIETY FOR<br> PETS</a></h1>\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("    <div style=\"width:400px;height:200px;margin-left:870px;margin-bottom:550px;margin-top:-90px;\">\n");
      out.write("       \n");
      out.write("<table width=\"100%\" style=\"margin-left:60px;\">\n");
      out.write("        \n");
      out.write("    <tr  align=\"center\">\n");
      out.write("            \n");
      out.write("                <td class=\"tdtheme\"><img src=\"home.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-left:-70px;padding-left:50px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"font-size:16px;padding-top:10px;\"><a href=\"homepagepet.jsp\">HOME</a></td>\n");
      out.write("                \n");
      out.write("                <td class=\"tdtheme\"><img src=\"icon_info.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"aboutuspet.jsp\">ABOUT US</a></td>\n");
      out.write("                <td class=\"tdtheme\"><img src=\"OIP.jfif\" style=\"width:40px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;padding-top:5px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"servicespet.jsp\">OUR SERVICES</a></td>\n");
      out.write("               \n");
      out.write("                <td class=\"tdtheme\"><img src=\"contactus1.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-left:0px;padding-left:50px;\">\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"padding-top:20px;font-size:16px;\"><a href=\"contactuspet.jsp\">CONTACT US</a></td>          \n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("   \n");
      out.write("            </div>\n");
      out.write("<div style='margin-top:-700px;margin-left:370px;height:200px;width:1000px;'><video src=\"pet care.mp4\" width=\"800px\"\n");
      out.write("      height=\"600px\" autoplay=\"true\" controls ></video></div>\n");
      out.write("<!--       <div><video src=\"video2.mp4\" width=\"600px\" height=\"400px\" autoplay=\"true\" controls ></video></div>-->\n");
      out.write("</div>\n");
      out.write("       <tr align=\"center\">\n");
      out.write("        <div>   <img src=\"c.png\" style=\"width:900px;height:600px;margin-left:300px;border:inset;\n");
      out.write("                     margin-top:700px;border-radius:5px;\">\n");
      out.write("\n");
      out.write("              </tr></div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("       \n");
      out.write("        <div style=\"background-color:rgba(0,183,235,0.4);margin-bottom:500px;margin-top: 20px;\n");
      out.write("             width: 1500px;height: 80px;\">\n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <marquee scrollamount=\"4\" behavior=\"scroll\" direction=\"right\">\n");
      out.write("                    <h2><i><b>Please do visit our other social media accounts</b></i></h2>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("        </marquee>\n");
      out.write("<!--                <img src=\"facebook.png\" style=\"width:100px;height:60px;margin-left:500px;\n");
      out.write("                     margin-top:30px;border-radius:5px;\">-->\n");
      out.write("            </table>\n");
      out.write("            <div style=\"background-color:rgba(255,255,255,0.4);margin-bottom:500px;margin-top: 110px;\n");
      out.write("             width: 100px;height: 150px;\">\n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                <td><a href=\"https://www.facebook.com/search/top?q=petcare%20community\"><img src=\"facebook.png\" style=\"width:100px;height:70px;margin-left:500px;\n");
      out.write("                     margin-top:-50px;border-radius:5px;\"></a></td>\n");
      out.write("                <td><a href=\"https://www.instagram.com/pet.w0rld/\"><img src=\"in.png\" style=\"width:80px;height:70px;margin-left:100px;\n");
      out.write("                     margin-top:-40px;border-radius:5px;\"></a></td>\n");
      out.write("                <td><a href=\"https://www.instagram.com/pet.w0rld/\"><img src=\"twitter.png\" style=\"width:100px;height:60px;margin-left:100px;\n");
      out.write("                     margin-top:-40px;border-radius:5px;\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("         </div>\n");
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
