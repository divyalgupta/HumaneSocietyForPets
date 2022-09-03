package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutuspet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div style=\"background-color:rgba(0,0,0,0.9);padding-top:-80px;border:inset;height:2000px;margin-left:-5px;margin-top:-5px;\">\n");
      out.write("<!--        <div style=\"width:400px;height:200px;background-image:url(\"292929.png\");\n");
      out.write("             margin-left:550px;margin-top:-200px;border-radius:30px;\">-->\n");
      out.write("                \n");
      out.write("                 <div style=\"background:rgba(0,0,0,0.7); height:100px;width:1500px\">\n");
      out.write("                  \n");
      out.write("            <table width=\"100%\">\n");
      out.write("            <tr   align=\"center\">\n");
      out.write("                <td style=\"margin-left:50px;padding-bottom:15px;\">\n");
      out.write("                 <div style=\"background-color :rgba(255,189,222,0.4);\" >   \n");
      out.write("                <div><img src=\"L.png\" style=\"width:70px;height: 70px;border-radius: 5px;padding-left:5px;padding-top:5px;\n");
      out.write("                         font-size: 200px;border-color: red;border:inset;\"></td>\n");
      out.write("                \n");
      out.write("<!--          <td></div><div style=\"width: 350px;height: 50px;\n");
      out.write("           border-radius:8px;margin-left:115px;margin-top:-490px;color:white;padding-top:5px;\n");
      out.write("           background:rgba(0,0,0,0.6);\"><i><h1>\"Welcome to our website\"</i></h1></td>-->\n");
      out.write("                <td>\n");
      out.write("                </div>\n");
      out.write("        <div style=\"width:815px;height:100px;;color:white;padding-right:800px;margin-left:-190px;border:inset;border-radius:5px; \">\n");
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
      out.write("                <td style=\"font-size:16px;\"><a href=\"homepagepet.jsp\">HOME</a></td>\n");
      out.write("                \n");
      out.write("                <td class=\"tdtheme\"><img src=\"icon_info.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;\">\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"aboutuspet.jsp\">ABOUT US</a></td>\n");
      out.write("                <td class=\"tdtheme\"><img src=\"icon_info.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;\">\n");
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
      out.write("                     <tr align=\"center\">\n");
      out.write("        <div style=\"background:rgba(34,23,12,0.6);\">   \n");
      out.write("               \n");
      out.write("              </tr></div>\n");
      out.write("                     \n");
      out.write(" \n");
      out.write(" <div>\n");
      out.write("     <td>\n");
      out.write("     <img src=\"pet3.jpg\" style=\"width:400px;height:250px;\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write(" </td>    \n");
      out.write(" </div>\n");
      out.write("<div>\n");
      out.write("     <td>\n");
      out.write("     <img src=\"white_1.jpg\" style=\"width:1100px;height:530px;margin-top:-700px;margin-left:200px;\n");
      out.write("          font-size: 200px;\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write(" </td>    \n");
      out.write(" </div>\n");
      out.write("<div style=\"color:purple;margin-left:400px;font-size:20px;margin-top:-1380px;\">\n");
      out.write("     <p><i><b>ABOUT US</b></i></p>\n");
      out.write("<!--     <p><i>Welcome to our website we are having number of different<br> organizations here to help you always \n");
      out.write("        according to your <br>needs and will take care of your pet for the number of <br>days until you come and take them back.\n");
      out.write("     </i></p>-->\n");
      out.write("     <td><img src=\"pet1.jpg\" style=\"margin-top:-50px;margin-left:350px;width:500px;\n");
      out.write("          \" alt=\"\" class=\"img_inner fleft i1\"></td>\n");
      out.write("      </div>    \n");
      out.write("<div class=\"grid_7\" style=\"font-size:23px;padding-left:250px;padding-top:5px;color:pink;\">\n");
      out.write("      <tr><td><h1><i><u>What we do</i></u></h1></td>\n");
      out.write("      <td class=\"tdtheme\"><img src=\"icon1.png\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;padding-left:260px;margin-top:-73px;\"> </td>\n");
      out.write("      </tr>\n");
      out.write("      <br>\n");
      out.write("      <img src=\"pet2.jpg\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write("      <div class=\"extra_wrapper\" style=\"color:pink;font-size:18px;margin-left:50px;margin-top:600px;\">\n");
      out.write("          <p class=\"col1\"><a href=\"\"></a></p>\n");
      out.write("       <i> <b>Welcome to our website we are having number of different<br> organizations here to help you always \n");
      out.write("        according to your <br>needs and will take care of your pet for the number of <br>days until you come and take them back.\n");
      out.write("     </b></i> </div></div>\n");
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
