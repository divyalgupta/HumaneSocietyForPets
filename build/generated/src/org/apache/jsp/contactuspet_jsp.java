package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactuspet_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("        .tdtheme{\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            width: 15%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-family: arial;\r\n");
      out.write("              \r\n");
      out.write("        }\r\n");
      out.write("        .tdtheme:hover{\r\n");
      out.write("            background-color:none;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <body background=\"hoodie.jpg\" style=\"background-repeat:no-repeat;width:100%;height:100%;background-size:100% 100%;\">       \r\n");
      out.write("        \r\n");
      out.write("            <div style=\"background-color:rgba(0,0,0,0.9);padding-top:-80px;border:inset;height:2500px;margin-left:-5px;margin-top:-5px;\">\r\n");
      out.write("           \r\n");
      out.write("                 <div style=\"background:rgba(0,0,0,0.7); height:100px;width:1500px\">\r\n");
      out.write("                  \r\n");
      out.write("            <table width=\"100%\">\r\n");
      out.write("            <tr   align=\"center\">\r\n");
      out.write("                <td style=\"margin-left:50px;padding-bottom:15px;\">\r\n");
      out.write("                 <div style=\"background-color :rgba(255,189,222,0.4);\" >   \r\n");
      out.write("                <div><img src=\"L.png\" style=\"width:70px;height: 70px;border-radius: 5px;padding-left:5px;padding-top:5px;\r\n");
      out.write("                         font-size: 200px;border-color: red;border:inset;\"></td>\r\n");
      out.write("              <td>\r\n");
      out.write("                </div>\r\n");
      out.write("        <div style=\"width:815px;height:100px;;color:white;padding-right:800px;margin-left:-190px;border:inset;border-radius:5px; \">\r\n");
      out.write("            <h1>HUMANE SOCIETY FOR<br> PETS</a></h1>\r\n");
      out.write("                    </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("    <div style=\"width:400px;height:200px;margin-left:870px;margin-bottom:550px;margin-top:-90px;\">\r\n");
      out.write("       \r\n");
      out.write("<table width=\"100%\" style=\"margin-left:60px;\">\r\n");
      out.write("        \r\n");
      out.write("    <tr  align=\"center\">\r\n");
      out.write("            \r\n");
      out.write("                <td class=\"tdtheme\"><img src=\"home.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;margin-left:-70px;padding-left:50px;\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td style=\"font-size:16px;padding-top:10px;\"><a href=\"homepagepet.jsp\">HOME</a></td>\r\n");
      out.write("                \r\n");
      out.write("                <td class=\"tdtheme\"><img src=\"icon_info.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"aboutuspet.jsp\">ABOUT US</a></td>\r\n");
      out.write("                <td class=\"tdtheme\"><img src=\"OIP.jfif\" style=\"width:40px;height: 35px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;margin-right:0px;padding-left:50px;padding-top:5px;\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td style=\"padding-top:20px;font-size:16px;\"><a href=\"servicespet.jsp\">OUR SERVICES</a></td>\r\n");
      out.write("               \r\n");
      out.write("                <td class=\"tdtheme\"><img src=\"contactus1.jpg\" style=\"width:35px;height: 35px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;margin-left:0px;padding-left:50px;\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td style=\"padding-top:20px;font-size:16px;\"><a href=\"contactuspet.jsp\">CONTACT US</a></td>          \r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("   \r\n");
      out.write("            </div>\r\n");
      out.write("                     <tr align=\"center\">\r\n");
      out.write("        <div style=\"background:rgba(34,23,12,0.6);\">   \r\n");
      out.write("               \r\n");
      out.write("              </tr></div>\r\n");
      out.write("                     \r\n");
      out.write("  <div>\r\n");
      out.write("     <td>\r\n");
      out.write("     <img src=\"wbg.jfif\" style=\"width:1100px;height:1600px;margin-top:-600px;margin-left:200px;\r\n");
      out.write("          font-size: 200px;\" alt=\"\" class=\"img_inner fleft i1\">\r\n");
      out.write(" </td>    \r\n");
      out.write("<!-- </div>\r\n");
      out.write(" <div style=\"color:blue;margin-left:280px;font-size:30px;margin-top:-580px;font-family:'Paprika', cursive;\">\r\n");
      out.write("     <p><b><i>CONTACT US</i></b></p>\r\n");
      out.write("\r\n");
      out.write("     <td><img src=\"pet1.jpg\" style=\"margin-top:-60px;margin-left:350px;width:500px;\r\n");
      out.write("          \" alt=\"\" class=\"img_inner fleft i1\"></td>\r\n");
      out.write("      </div>  -->\r\n");
      out.write("<div class=\"grid_7\" style=\"font-size:23px;padding-left:250px;padding-top:100px;margin-top:70px;color:lawngreen;font-family:'Paprika', cursive;\r\n");
      out.write("    \">\r\n");
      out.write("<!--      <tr><td><h1><u><i>What we do</i></u></h1></td>-->\r\n");
      out.write("      <td class=\"tdtheme\"><img src=\"contact-us.jpg\" style=\"width:380px;height: 130px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;padding-left:10px;margin-top:-1730px;\"> </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <br>\r\n");
      out.write(" <div class=\"grid_7\" style=\"font-size:23px;padding-left:250px;padding-top:100px;margin-top:70px;color:lawngreen;font-family:'Paprika', cursive;\r\n");
      out.write("    \">\r\n");
      out.write("<!--      <tr><td><h1><u><i>What we do</i></u></h1></td>-->\r\n");
      out.write("      <td class=\"tdtheme\"><img src=\"map.png\" style=\"width:750px;height:400px;border-radius: 15px;\r\n");
      out.write("                         font-size: 200px;margin-left:-130px;margin-top:-1730px;\"> </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <br>\r\n");
      out.write("      <div class=\"extra_wrapper\" style=\"color:black;font-size:22px;margin-left:-750px;margin-top:-1300px;\">\r\n");
      out.write("          <p class=\"col1\"><a href=\"\"></a></p></div></div>\r\n");
      out.write("       <div style=\"color:black;margin-left:130px;font-size:20px;margin-top:-400px;\"><b><u>Address</u>: 23/B,Humane Society For Pets\r\n");
      out.write("                   <br>Suryadev Nagar,Indore (M.P)<br><br>\r\n");
      out.write("\r\n");
      out.write("Contact No.: +91 8955965801<br>\r\n");
      out.write("Telephone : 07364-4367254\r\n");
      out.write("      </b></div>\r\n");
      out.write("      <!--\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"extra_wrapper\" style=\"color:black;font-size:22px;margin-left:-750px;margin-top:-600px;\">\r\n");
      out.write("          <p class=\"col1\"><a href=\"\"></a></p></div></div>-->\r\n");
      out.write("          \r\n");
      out.write("<!--<div style=\"margin-top:-390px;margin-left:780px;\"> <img src=\"pet2.jpg\" alt=\"\" class=\"img_inner fleft i1\"></div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-top:220px;margin-left:180px;\"> <img src=\"pet3.jpg\" alt=\"\" class=\"img_inner fleft i1\"></div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-top:-390px;margin-left:800px;\"> <img src=\"pet6.jpg\" alt=\"\" class=\"img_inner fleft i1\"></div>-->\r\n");
      out.write("\r\n");
      out.write("<table style=\"background: rgba(0,0,0,0.3);margin-left: 200px;padding-top: 60px;border:inset;\r\n");
      out.write("           padding-bottom: 30px;border-radius: 15px;width: 600px;margin-top:400px;\">\r\n");
      out.write("            \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"font-size: 20px;padding-left:25px;color:blue;\">Name</td>\r\n");
      out.write("<!--        </tr>\r\n");
      out.write("        <tr>-->\r\n");
      out.write("            <td><input type = \"text\" name = \"uName\" placeholder = \"Enter your name here\" \r\n");
      out.write("                       style=\"width: 325px;height: 35px;border-radius:10px; margin-left:-90px;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"font-size: 20px;padding-left:25px;color:blue;\">Email</td>\r\n");
      out.write("<!--        </tr>\r\n");
      out.write("        <tr>-->\r\n");
      out.write("            <td><input type = \"text\" name = \"uEmail\" placeholder = \"Enter Email id here\" \r\n");
      out.write("                       style=\"width: 325px; height: 35px;border-radius:10px; margin-left:-90px;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"font-size: 20px;height:100px;padding-left:25px;color:blue;\">Query</td>\r\n");
      out.write("<!--        </tr>\r\n");
      out.write("        <tr>-->\r\n");
      out.write("            <td><textarea type = \"text\" name = \"uAdd\" placeholder = \"Enter your query here\" \r\n");
      out.write("                       style=\"width: 325px;height: 100px;border-radius:10px; margin-left:-90px;\"></textarea></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("           <tr>\r\n");
      out.write("                   \r\n");
      out.write("            <td > <input type = \"submit\" value = \"Send\" \r\n");
      out.write("                        style=\"width: 130px;height: 35px;border-radius:15px;background:orange; margin-left:100px; \">\r\n");
      out.write("            </td>\r\n");
      out.write("           <td>\r\n");
      out.write("               <input type = \"reset\" value = \"Clear\" \r\n");
      out.write("                        style=\"width: 130px;height: 35px;border-radius:15px;background:orange; margin-left:30px;\"></td>\r\n");
      out.write("                   \r\n");
      out.write("            </tr>\r\n");
      out.write("           </table>  \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--What is the Pet Care Services Association?\r\n");
      out.write("Pet Care Services Association members offer a variety of services to pet owners including boarding, dog daycare, grooming, animal training,\r\n");
      out.write("pet supply sales and shipping.\r\n");
      out.write("\r\n");
      out.write("How do I plan for the future care of a pet with a long lifespan?\r\n");
      out.write("Please see our Planning for the Future Care of Equines and Exotics if you are the owner of a pet with a long lifespan. \r\n");
      out.write("A Pet Trust may be a good option for expensive pets or those with long life spans.\r\n");
      out.write("\r\n");
      out.write("Are there pet retirement homes?\r\n");
      out.write("Yes. There are several pet retirement homes sponsored by schools for veterinary medicine and others that are privately operated.\r\n");
      out.write("As a pet guardian, you must make a decision as to which situation works best for you. \r\n");
      out.write("Do your homework and thoroughly investigate all possibilities, especially the organization you ultimately select.\r\n");
      out.write("\r\n");
      out.write("Que. What happens if my pet becomes injured or ill?\r\n");
      out.write("ANS. We are dedicated to the excellent care of your pet. In the event of an emergency, \r\n");
      out.write("we will take your pet to the nearest animal hospital or your own vet. \r\n");
      out.write("We will also contact you or your designated emergency contact. \r\n");
      out.write("The pet sitter will stay with your pet until you are reached and appropriate action is taken.\r\n");
      out.write("\r\n");
      out.write("Q. How do I pay?\r\n");
      out.write("A. We accept cash, checks, and all major credit cards through Paypal. Checks are made payable to Society Pet Sitter. \r\n");
      out.write("We will email you a confirmation / invoice prior to your service. \r\n");
      out.write("There is a Paypal button to click on just right of the total to pay on line.\r\n");
      out.write("\r\n");
      out.write("-->");
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
