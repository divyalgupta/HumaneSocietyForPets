package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class servicespet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <body background=\"hoodie.jpg\" style=\"background-repeat:no-repeat;width:100%;height:100%;background-size:100% 100%;\">       \n");
      out.write("        \n");
      out.write("            <div style=\"background-color:rgba(0,0,0,0.9);padding-top:-80px;border:inset;height:1000px;margin-left:-5px;margin-top:-5px;\">\n");
      out.write("           \n");
      out.write("                 <div style=\"background:rgba(0,0,0,0.7); height:100px;width:1500px\">\n");
      out.write("                  \n");
      out.write("            <table width=\"100%\">\n");
      out.write("            <tr   align=\"center\">\n");
      out.write("                <td style=\"margin-left:50px;padding-bottom:15px;\">\n");
      out.write("                 <div style=\"background-color :rgba(255,189,222,0.4);\" >   \n");
      out.write("                <div><img src=\"L.png\" style=\"width:70px;height: 70px;border-radius: 5px;padding-left:5px;padding-top:5px;\n");
      out.write("                         font-size: 200px;border-color: red;border:inset;\"></td>\n");
      out.write("              <td>\n");
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
      out.write("                     <tr align=\"center\">\n");
      out.write("        <div style=\"background:rgba(34,23,12,0.6);\">   \n");
      out.write("               \n");
      out.write("              </tr></div>\n");
      out.write("                     \n");
      out.write("  <div>\n");
      out.write("     <td>\n");
      out.write("     <img src=\"gray1.jpg\" style=\"width:1300px;height:800px;margin-top:-650px;margin-left:100px;\n");
      out.write("          font-size: 200px;\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write(" </td>    \n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" <div class=\"grid_7\" style=\"font-size:20px;padding-left:200px;padding-top:100px;margin-top:-870px;\n");
      out.write("        color:white;font-family:'Paprika', cursive;\">\n");
      out.write("      <tr><td><h1><u><i>What we offer</i></u></h1></td>\n");
      out.write("      <td class=\"tdtheme\"><img src=\"icon1.png\" style=\"width:35px;height: 35px;border-radius: 15px;\n");
      out.write("                         font-size: 200px;padding-left:320px;margin-top:-65px;\"> </td>\n");
      out.write("      </tr>\n");
      out.write("      <br></div>\n");
      out.write("<div>\n");
      out.write("     <td>\n");
      out.write("     <img src=\"petfood.jpg\" style=\"width:400;height:250px;margin-top:10px;margin-left:270px;\n");
      out.write("          font-size: 200px;\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write(" </td>    \n");
      out.write(" </div>\n");
      out.write("                     \n");
      out.write("<div>\n");
      out.write("     <td>\n");
      out.write("     <img src=\"M3.jpg\" style=\"width:400;height:250px;margin-top:-250px;margin-left:830px;\n");
      out.write("          font-size: 200px;\" alt=\"\" class=\"img_inner fleft i1\">\n");
      out.write(" </td>    \n");
      out.write(" </div>\n");
      out.write("                     \n");
      out.write("<div class=\"extra_wrapper\" style=\"color:black;font-size:22px;margin-left:-750px;margin-top:-600px;\">\n");
      out.write("          <p class=\"col1\"><a href=\"\"></a></p></div></div>\n");
      out.write("       <div style=\"color:white;margin-left:250px;font-size:20px;margin-top:500px;\"><i><b> 1. First of all We care for your pets alot.\n");
      out.write("                   Veterinarian services, <br>pet care and animal care. To heal the world one pet at a time. <br>We love your pets.\n");
      out.write("                   Pets are like family.Caring means everything.</b></i> </div>\n");
      out.write("\n");
      out.write("<div style=\"color:white;margin-left:830px;font-size:20px;margin-top:-65px;\"><i><b> 2. We Feed your pet with a good and \n");
      out.write("                   high-quality foods .<br>Take them for a walk every day for at least half an hour.</b></i> </div>\n");
      out.write("                     \n");
      out.write("<div style=\"color:white;margin-left:250px;font-size:20px;margin-top:550px;\"><i><b> 1. First of all We care for your pets alot.\n");
      out.write("                   Veterinarian services, <br>pet care and animal care. To heal the world one pet at a time. <br>We love your pets. You can?t pet a vet.\n");
      out.write("                   Pets are like family.<br>Caring means everything.</b></i> </div>\n");
      out.write("<!--<video src=\"pet care.mp4\" width=\"600px\" height=\"400px\" autoplay=\"true\" controls ></video>-->\n");
      out.write("                     \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
