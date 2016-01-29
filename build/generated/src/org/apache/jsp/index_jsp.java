package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    \r\n");
      out.write("\t\t <head>\r\n");
      out.write("\t\t <title>Home</title>\r\n");
      out.write("\t\t <meta charset=\"utf-8\">\r\n");
      out.write("\t\t <link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("\t\t <link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\r\n");
      out.write("\t\t <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t\t <link rel=\"stylesheet\" href=\"css/slider.css\">\r\n");
      out.write("\t\t <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/jquery-migrate-1.1.1.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/superfish.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/sForm.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/jquery.jqtransform.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/jquery.equalheights.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/tms-0.4.1.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery-ui-1.10.3.custom.min.js\"></script>\r\n");
      out.write("\t\t <script src=\"js/jquery.ui.totop.js\"></script>\r\n");
      out.write("\t\t <script>\r\n");
      out.write("\t\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t$('.slider')._TMS({\r\n");
      out.write("\t\t\t\t\t\t\tshow:0,\r\n");
      out.write("\t\t\t\t\t\t\tpauseOnHover:false,\r\n");
      out.write("\t\t\t\t\t\t\tprevBu:'.prev',\r\n");
      out.write("\t\t\t\t\t\t\tnextBu:'.next',\r\n");
      out.write("\t\t\t\t\t\t\tplayBu:false,\r\n");
      out.write("\t\t\t\t\t\t\tduration:800,\r\n");
      out.write("\t\t\t\t\t\t\tpreset:'random', \r\n");
      out.write("\t\t\t\t\t\t\tpagination:false,//'.pagination',true,'<ul></ul>'\r\n");
      out.write("\t\t\t\t\t\t\tpagNums:false,\r\n");
      out.write("\t\t\t\t\t\t\tslideshow:8000,\r\n");
      out.write("\t\t\t\t\t\t\tnumStatus:false,\r\n");
      out.write("\t\t\t\t\t\t\tbanners:true,\r\n");
      out.write("\t\t\t\t\twaitBannerAnimation:false,\r\n");
      out.write("\t\t\t\tprogressBar:false\r\n");
      out.write("\t\t\t})\t;\r\n");
      out.write("\t\t\t $( \"#tabs\" ).tabs();\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t </script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style2 {font-size: 16px}\r\n");
      out.write(".style3 {font-size: 24px}\r\n");
      out.write(".style5 {font-size: 20px}\r\n");
      out.write("-->\r\n");
      out.write("         </style>\r\n");
      out.write("\t\t </head>\r\n");
      out.write("\t\t <body\tclass=\"page1\">\r\n");
      out.write("<!--==============================header=================================-->\r\n");
      out.write("<header>\r\n");
      out.write("  <div class=\"container_12\">\r\n");
      out.write("    <div class=\"grid_12\">\r\n");
      out.write("      <h1><a href=\"controller?RT=index\"><img src=\"images/logo.png\" alt=\"Gerald Harris attorney at law\"></a> </h1>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"menu_block\">\r\n");
      out.write("      <nav\tclass=\"\" >\r\n");
      out.write("        <ul class=\"sf-menu\">\r\n");
      out.write("          <li class=\"current\"><a href=\"controller?RT=index\" class=\"style3\">Home</a></li>\r\n");
      out.write("          <li><a href=\"controller?RT=gallery\" class=\"style3\">Gallery</a></li>\r\n");
      out.write("          <li><a href=\"controller?RT=tours\" class=\"style3\">Tours</a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("           ");

                  HttpSession sess = request.getSession(false);
                  if(sess == null)
                  {
           
      out.write("\r\n");
      out.write("\t\t  <li><a href=\"#\">Login</a>\r\n");
      out.write("\t\t  \t<ul>\r\n");
      out.write("                <li><a href=\"controller?RT=a_login&type=resort\">Agency</a></li>\r\n");
      out.write("                <li><a href=\"controller?RT=c_login\">Customer</a></li>\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("\t\t  </li> \t\r\n");
      out.write("\t\t  <li><a href=\"#\">Register</a>\r\n");
      out.write("\t\t  \t<ul>\r\n");
      out.write("                <li><a href=\"controller?RT=a_signup\">Agency</a></li>\r\n");
      out.write("                <li><a href=\"controller?RT=c_signup\">Customer</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\t\t  </li> \r\n");
      out.write("                  <li><a href=\"controller?RT=admin&type=admin\">Admin Login</a></li>\r\n");
      out.write("            ");
   }
                  else
                 {
                     String s=(String)sess.getAttribute("type");
                        if(s.equals("customer"))
                        { 
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <li><a href=\"#\">Resorts</a>\r\n");
      out.write("                  <ul>\r\n");
      out.write("              \r\n");
      out.write("                ");
  
                     
                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        int count=0;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\Users\MuhammadUmar\Documents\NetBeans\myWeb\src\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM agencyInfo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                          <a href=\"controller?RT=resort&name=");
      out.print(rs.getString("aname"));
      out.write("\" class=\"sf-menu style5\"> ");
      out.print(rs.getString("aname"));
      out.write(" </a>\r\n");
      out.write("                              <br>\r\n");
      out.write("                            \r\n");
      out.write("                                 \r\n");
      out.write("              ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
                        
      out.write("\r\n");
      out.write("                          </ul>             \r\n");
      out.write("              </li>   \r\n");
      out.write("                        \r\n");
      out.write("                     ");
   
                        }else
                        { 
      out.write("\r\n");
      out.write("                              \r\n");
      out.write("              <li><a href=\"addInfo.jsp\">Add Info</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                                   ");
 } 
      out.write("\r\n");
      out.write("                                   \r\n");
      out.write("                                   <li><a href=\"controller?RT=profile\">View Profile</a></li>\r\n");
      out.write("                                   <li><a href=\"controller?RT=logout\">Logout</a></li>\r\n");
      out.write("                  \r\n");
      out.write("             ");
 } 
      out.write("\r\n");
      out.write("\t\t \t\t  \r\n");
      out.write("        </ul>\r\n");
      out.write("\t\r\n");
      out.write("      </nav>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t\t<div class=\"grid_12\">\r\n");
      out.write("\t <div class=\"slider-relative\">\r\n");
      out.write("\t\t\t<div class=\"slider-block\">\r\n");
      out.write("\t\t\t\t<div class=\"slider\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"prev\"></a><a href=\"#\" class=\"next\"></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"items\">\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/slide.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>THERE ARE PLENTY OF PLACES</div><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span> that are worth seeing</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/slide1.jpg\" alt=\"\" width=\"1127\" height=\"724\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/slide2.jpg\" alt=\"\" width=\"1127\" height=\"724\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/slide3.jpg\" alt=\"\" width=\"1127\" height=\"724\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/slide4.jpg\" alt=\"\" width=\"5127\" height=\"824\"></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div></div>\r\n");
      out.write("\t\r\n");
      out.write("<!--=======content================================-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\"><div class=\"ic\">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t<h3>Top Destinations</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxes\">\r\n");
      out.write("\t\t  <div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div><img src=\"images/page1_img1.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Venice</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t  <p><em>\" (...) In Venice Tasso's echoes are no more;</em><em>And silent runs the songless gondolier;</em><em>Her palaces are crimbling to the shore;</em><em>And music meets not always the ear;</em><em>Those days are gone - but beauty still is here.\"</em></p>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  </figcaption>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div><img src=\"images/page1_img2.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>New York</h3>\r\n");
      out.write("\t\t\t\t\t\t  <em>There isn't another like it.<br>\r\n");
      out.write("\t\t\t\t\t\t\tNo matter where you go.<br>\r\n");
      out.write("\t\t\t\t\t\t\tAnd nobody can compare it.It's win and place and show.<br>\r\n");
      out.write("\t\t\t\t\t\t\tNew York is special.<br>\r\n");
      out.write("\t\t\t\t\t\t\tNew York is diff'rent' cause there's no place else<br>\r\n");
      out.write("\t\t\t\t\t\t  on earth quite like New York and that's why I Luv NY</em>\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div><img src=\"images/page1_img3.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Paris</h3>\r\n");
      out.write("\t\t\t\t\t\t\t <p>If you are lucky enough to have lived in Paris as a young man, then wherever you go for the rest of your life it stays with you, for Paris is a moveable feast.<br>\r\n");
      out.write("\t\t\t\t\t\t  .</p>\r\n");
      out.write("\t\t\t\t\t\t\t <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t  </figcaption>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t\t <div id=\"tabs\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"#tabs-1\">TRIP IDEAS</a></li>\r\n");
      out.write("\t\t<li></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("\t<div class=\"tab_cont\" id=\"tabs-1\">\r\n");
      out.write("\t  <img src=\"images/page3_img8.jpg\" alt=\"\" width=\"259\" height=\"166\">\r\n");
      out.write("\t  <div class=\"extra_wrapper\">\r\n");
      out.write("\t\t\t<div class=\"text1 style2\">\r\n");
      out.write("\t\t\t  <p>Weekend in Paris </p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t<p class=\"style1\"><a class=\"col2\" href=\"http://blog.templatemonster.com/free-website-templates/\" rel=\"nofollow\"></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("Paris, the world's most popular city destination, has plenty of must-see places but make sure you spend at least a day strolling off the beaten path, as this is the only way to discover the real Paris:\r\n");
      out.write("<a href=\"controller?RT=trips&place=paris\" class=\"btn\">Details</a>\r\n");
      out.write("<div class=\"clear \"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear cl1\"></div>\r\n");
      out.write("\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t<p><img src=\"images/page1_dubai.jpg\" alt=\"\" width=\"279\" height=\"180\"></p>\r\n");
      out.write("\t\t<p>&nbsp; </p>\r\n");
      out.write("\t\t<div class=\"extra_wrapper\">\r\n");
      out.write("\t\t\t<div class=\"text1 tx1\">\r\n");
      out.write("\t\t\t  <p>New Year In London </p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\tThe name London originally referred only to the once-walled \"Square Mile\" of the original Roman (and later medieval) city (confusingly called the \"City of London\" or just \"The City\"). Today, London has taken on a much larger meaning to include all of the vast central parts of the modern metropolis \r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<a href=\"controller?RT=trips&place=london\" class=\"btn bt1\">Details</a>\r\n");
      out.write("\t\t\t<div class=\"clear \"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--<div class=\"tab_cont\" id=\"tabs-1\">-->\r\n");
      out.write("\t  <p><img src=\"images/page1-niagra.jpg\" alt=\"\" width=\"259\" height=\"194\">      </p>\r\n");
      out.write("      <div class=\"extra_wrapper\">\r\n");
      out.write("        <div class=\"text1\">\r\n");
      out.write("\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t  <p>Mysterious Niagara Falls </p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t<p class=\"style1\"></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("Since its formation more than 12,000 years ago, Niagara Falls has been a destination for world explorers,? honeymooners? and daredevils alike. Today, visitors flock to the region to be awe-inspired by the beauty and power of Niagara. \r\n");
      out.write("<a href=\"controller?RT=trips&place=niagara\" class=\"btn\">Details</a>\r\n");
      out.write("<div class=\"clear \"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t<p><img src=\"images/page1-dubai.jpg\" alt=\"\" width=\"269\" height=\"207\"></p>\r\n");
      out.write("\t\t<div class=\"extra_wrapper\">\r\n");
      out.write("\t\t\t<div class=\"text1 tx1\">\r\n");
      out.write("\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t  <p>Breathtaking rides at Ferrari World </p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\tFerrari World Abu Dhabi offers a truly amazing experience for every family member with? thrilling rides, exciting attractions,? themed stores and restaurants \r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<a href=\"controller?RT=trips&place=ferrari\" class=\"btn bt1\">Details</a>\r\n");
      out.write("\t\t\t<div class=\"clear \"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--</div>-->\r\n");
      out.write(" <div class=\"tab_cont\" id=\"tabs-3\">\r\n");
      out.write("   <div class=\"extra_wrapper\">\r\n");
      out.write("\t\t  <p class=\"style1\">&nbsp;</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<div class=\"clear \"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear cl1\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"grid_4\">\r\n");
      out.write("\t<!-- <div class=\"newsletter_title\">NewsLetter </div>\r\n");
      out.write("\t<!-- <div class=\"n_container\">\r\n");
      out.write("\t\t\t <form id=\"newsletter\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"success\">Your subscribe request has been sent!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text1\">Sign up to receive our newsletters </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input type=\"email\" value=\"email address\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"error\">*This is not a valid email address.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div> <a href=\"\" class=\"\" data-type=\"submit\"></a> \r\n");
      out.write("\t\t  </form> \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</div>-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bottom_block\">\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t  <div class=\"grid_2 prefix_2\">\r\n");
      out.write("\t\t  <ul>\r\n");
      out.write("\t\t\t  <li></li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  <div class=\"grid_2\"></div>\r\n");
      out.write("\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t<h4>Contact Us:</h4>\r\n");
      out.write("\t\t\tTEL: 1-800-234-5678<br><a href=\"#\">info@demolink.org</a>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("  </div>\r\n");
      out.write("<!--==============================footer=================================-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<footer>\t\t\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t<div class=\"grid_12\">\r\n");
      out.write("\t\t<div class=\"socials\">\r\n");
      out.write("\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copy\">\r\n");
      out.write("\t\t Website designed by Tourist Guide\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t <div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
