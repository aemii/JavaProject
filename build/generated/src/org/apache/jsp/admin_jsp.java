package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("     \r\n");
      out.write("\t\t <head>\r\n");
      out.write("                       ");
 HttpSession sess=request.getSession(false);  if(sess!=null) { 
                        
      out.write("\r\n");
      out.write("\t\t <title>Admin</title>\r\n");
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
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(window).load(function(){\r\n");
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
      out.write("\r\n");
      out.write("function MM_preloadImages() { //v3.0\r\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("\t\t <!--[if lt IE 8]>\r\n");
      out.write("\t\t\t <div style=' clear: both; text-align:center; position: relative;'>\r\n");
      out.write("\t\t\t\t <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\r\n");
      out.write("\t\t\t\t\t <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t<script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style7 {font-family: \"Comic Sans MS\", \"Cooper Black\", Courier}\r\n");
      out.write(".style15 {\r\n");
      out.write("\tcolor: #0099FF;\r\n");
      out.write("\tfont-size: 10;\r\n");
      out.write("\tfont-family: 'Pathway Gothic One', sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".style27 {font-family: \"Bradley Hand ITC\"}\r\n");
      out.write(".style31 {\r\n");
      out.write("\tfont-family: Pathway Gothic One', sans-serif}\r\n");
      out.write(".style33 {font-family: Pathway Gothic One', sans-serif;\r\n");
      out.write("\tcolor: #0099FF;\r\n");
      out.write("\tfont-size: 10;\r\n");
      out.write("}\r\n");
      out.write(".style8 {font-size: 45px}\r\n");
      out.write(".style9 {color: #FF9933; font-size: 45px; font-family: 'Pathway Gothic One', sans-serif; }\r\n");
      out.write(".style11 {\r\n");
      out.write("\tcolor: #0099FF;\r\n");
      out.write("\tfont-size: 10;\r\n");
      out.write("}\r\n");
      out.write(".style14 {color: #0099FF; font-size: 40px; font-family: 'Pathway Gothic One', sans-serif; }\r\n");
      out.write(".style16 {\r\n");
      out.write("\tfont-family: Pathway Gothic One', sans-serif}\r\n");
      out.write(".style33 {font-family: Pathway Gothic One', sans-serif;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 36px;\r\n");
      out.write("\tcolor: #FF6633;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("         </style>\r\n");
      out.write("\t\t </head>\r\n");
      out.write("\t\t <body\tclass=\"page1\">\r\n");
      out.write("<!--==============================header=================================-->\r\n");
      out.write("<header>\r\n");
      out.write("  <div class=\"container_12\">\r\n");
      out.write("    <div class=\"grid_12\">\r\n");
      out.write("      <h1><a href=\"#\"><img src=\"images/logo.png\" alt=\"Gerald Harris attorney at law\"></a> </h1>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"menu_block\">\r\n");
      out.write("      <nav\tclass=\"\" >\r\n");
      out.write("        <ul class=\"sf-menu\">\r\n");
      out.write("         <li><a href=\"controller?RT=users\" class=\"style3\">Users</a></li>\r\n");
      out.write("          <li><a href=\"controller?RT=r_resorts\" class=\"style3\">Resorts</a></li>\r\n");
      out.write("          <li><a href=\"controller?RT=tour\" class=\"style3\">Tours</a></li>\r\n");
      out.write("           <li><a href=\"controller?RT=bookings\" class=\"style3\">Bookings</a></li>\r\n");
      out.write("           <li><a href=\"controller?RT=photo\" class=\"style3\">Photos</a></li>\r\n");
      out.write("          \r\n");
      out.write("\t\t\r\n");
      out.write("           ");

                 
                  if(sess != null)
                  {
           
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("              \r\n");
      out.write("           <li><a href=\"controller?RT=logout\">Logout</a></li>\r\n");
      out.write("                  \r\n");
      out.write("             ");
 } 
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!--=======content================================-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"style2\">\r\n");
      out.write("  <div class=\"ic style7\">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>\r\n");
      out.write("\t\t\t<h1 align=\"center\" class=\"banner\">&nbsp;</h1>\r\n");
      out.write("\t\t\t<h1 align=\"center\" class=\"style14\">WELCOME ADMIN!</h1>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style14\">&nbsp;</p>\r\n");
      out.write("\t\t\t");
  
                  String s=(String)sess.getAttribute("type");
                  if(s!=null)
                      {
                     if(s.equals("resort"))
                     {
					 
					 
      out.write("\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style9\">~REGISTERED RESORTS~ </p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<span class=\"style8\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t        </span>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style15\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p class=\"grid_2 style31\">&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"img\" id=\"images\">\r\n");
      out.write("                            <form action=\"controller\" method=\"POST\" class=\"style11\">     \r\n");
      out.write("                                <input type=\"Hidden\" value=\"delete\" name=\"RT\">\r\n");
      out.write("                            </form>                  \r\n");
      out.write("              <div class=\"table\" id=\"table\">\r\n");
      out.write("                <p class=\"style11\">                <span class=\"style11\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <div align=\"center\">\r\n");
      out.write("                    ");

                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\rafia\\Desktop\\myWeb\\src\\java\\myDB1.accdb");
            
                                stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM agencyInfo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("         </div>\r\n");
      out.write("                    \r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                        </span>\r\n");
      out.write("                           </div>\r\n");
      out.write("         <li class=\"style11\">\r\n");
      out.write("\t        \t  \r\n");
      out.write("                                  \r\n");
      out.write("                                   <h3 align=\"center\">");
      out.print(rs.getString("aname"));
      out.write("</h3>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Location: ");
      out.print(rs.getString("location"));
      out.write("</p>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Number: ");
      out.print(rs.getString("phonenumber"));
      out.write("</p>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Email: ");
      out.print(rs.getString("email"));
      out.write("</p>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Services: ");
      out.print(rs.getString("services"));
      out.write("</p>\r\n");
      out.write("                                  \r\n");
      out.write("                                       <h3 align=\"center\"><a href=\"controller?RT=r_del&email=");
      out.print(rs.getString("email"));
      out.write("\" class=\"style16\">DELETE RESORT</a> </h3>\r\n");
      out.write("                                    \r\n");
      out.write("         </li>\r\n");
      out.write("                                \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t      <span class=\"style16\">\r\n");
      out.write("\t\t\t\t\t    ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                      
                                               
      out.write("\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t                      </span></div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                       ");
 } else if(s.equals("users")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<p align=\"center\" class=\"style9\">~REGISTERED USERS~ </p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<span class=\"style11\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t        </span>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style15\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p class=\"grid_2 style31\">&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"img\" id=\"images\">\r\n");
      out.write("                            <form action=\"controller\" method=\"POST\" class=\"style11\">     \r\n");
      out.write("                                <input type=\"Hidden\" value=\"delete\" name=\"RT\">\r\n");
      out.write("                            </form>                  \r\n");
      out.write("              <div class=\"table\" id=\"table\">\r\n");
      out.write("                <p class=\"style11\">                <span class=\"style11\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <div align=\"center\">\r\n");
      out.write("                    ");

                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\rafia\\Desktop\\myWeb\\src\\java\\myDB.accdb");
            
                                stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM customerInfo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("         </div>\r\n");
      out.write("                    \r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                        </span>\r\n");
      out.write("                           </div>\r\n");
      out.write("         <li class=\"style11\">\r\n");
      out.write("\t        \t  \r\n");
      out.write("                                  \r\n");
      out.write("                                   <h3 align=\"center\">");
      out.print(rs.getString("cname"));
      out.write("</h3>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Gender: ");
      out.print(rs.getString("gender"));
      out.write("</p>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Number: ");
      out.print(rs.getString("phonenumber"));
      out.write("</p>\r\n");
      out.write("                                   <p align=\"center\" class=\"style14\">Email: ");
      out.print(rs.getString("email"));
      out.write("</p>\r\n");
      out.write("                                   \r\n");
      out.write("                                \r\n");
      out.write("                                     \r\n");
      out.write("         </li>\r\n");
      out.write("                                \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t      <span class=\"style16\">\r\n");
      out.write("\t\t\t\t\t    ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
           
                     
                       
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("                      \r\n");
      out.write("                          ");
 } else if(s.equals("tour")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("                                        <p align=\"center\" class=\"style9\">~TOURS~ </p> <br>\r\n");
      out.write("                                        <p align=\"center\">    <a align=\"center\" href=\"controller?RT=addTour\" class=\"btn\">ADD TOUR</a> </p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<span class=\"style11\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t        </span>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style15\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p class=\"grid_2 style31\">&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"img\" id=\"images\">\r\n");
      out.write("                            <form action=\"controller\" method=\"POST\" class=\"style11\">     \r\n");
      out.write("                                <input type=\"Hidden\" value=\"delete\" name=\"RT\">\r\n");
      out.write("                            </form>                  \r\n");
      out.write("              <div class=\"table\" id=\"table\">\r\n");
      out.write("                <p class=\"style11\">                <span class=\"style11\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <div align=\"center\">\r\n");
      out.write("                    ");

                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\rafia\\Desktop\\myWeb\\src\\java\\myDB.accdb");
            
                                stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM tours";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("         </div>\r\n");
      out.write("                    \r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                        </span>\r\n");
      out.write("                           </div>\r\n");
      out.write("         <li class=\"style7\">\r\n");
      out.write("\t        \t  \r\n");
      out.write("                                  \r\n");
      out.write("                                   <h3 align=\"center\">");
      out.print(rs.getString("place"));
      out.write("</h3>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">");
      out.print(rs.getString("title"));
      out.write("</p><br>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">");
      out.print(rs.getString("description"));
      out.write("</p><br>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">");
      out.print(rs.getString("highlights"));
      out.write("</p>\r\n");
      out.write("                                   \r\n");
      out.write("                                  <div align=\"center\">\r\n");
      out.write("                                       <h3 align=\"center\"><a href=\"controller?RT=t_del&place=");
      out.print(rs.getString("place"));
      out.write("\" class=\"style16\">DELETE TOUR</a></h3>\r\n");
      out.write("                                  </div>\r\n");
      out.write("         </li\r\n");
      out.write("                                \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t      <span class=\"style16\">\r\n");
      out.write("\t\t\t\t\t    ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
                      
                     
                       
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      ");
 } else if(s.equals("bookings")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<p align=\"center\" class=\"style9\">~BOOKINGS~ </p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<span class=\"style11\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t        </span>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style15\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p class=\"grid_2 style31\">&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"img\" id=\"images\">\r\n");
      out.write("                            <form action=\"controller\" method=\"POST\" class=\"style11\">     \r\n");
      out.write("                                <input type=\"Hidden\" value=\"delete\" name=\"RT\">\r\n");
      out.write("                            </form>                  \r\n");
      out.write("              <div class=\"table\" id=\"table\">\r\n");
      out.write("                <p class=\"style11\">                <span class=\"style11\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <div align=\"center\">\r\n");
      out.write("                    ");

                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\rafia\\Desktop\\myWeb\\src\\java\\myDB.accdb");
            
                                stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM booking";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("         </div>\r\n");
      out.write("                    \r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                        </span>\r\n");
      out.write("                           </div>\r\n");
      out.write("         <li class=\"style7\">\r\n");
      out.write("\t        \t  \r\n");
      out.write("                                  \r\n");
      out.write("                                   <h3 align=\"center\">");
      out.print(rs.getString("place"));
      out.write("</h3>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">");
      out.print(rs.getString("date"));
      out.write("</p><br>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">Booked by: ");
      out.print(rs.getString("name"));
      out.write("</p><br>\r\n");
      out.write("                                   <p align=\"center\" class=\"style7\">");
      out.print(rs.getString("number"));
      out.write("</p>\r\n");
      out.write("                                    <p align=\"center\" class=\"style7\">Payment By: ");
      out.print(rs.getString("payment"));
      out.write("</p><br>\r\n");
      out.write("                                     <p align=\"center\" class=\"style7\">For :");
      out.print(rs.getString("days"));
      out.write("Days</p><br>\r\n");
      out.write("                                     \r\n");
      out.write("                                  \r\n");
      out.write("         </li>\r\n");
      out.write("                                \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t      <span class=\"style16\">\r\n");
      out.write("\t\t\t\t\t    ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style11\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p align=\"center\">&nbsp;</p>s</div>\r\n");
      out.write("                                          } \r\n");
      out.write("                     \r\n");
      out.write("               ");
   } if(s.equals("addPhoto")) { 
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                               <form method=\"post\" action=\"controller?RT=a_upload\" enctype=\"multipart/form-data\">\r\n");
      out.write("                               <div align=\"center\">                                 \r\n");
      out.write("                               <h3 class=\"style29\">Select Photo: \r\n");
      out.write("                               <input type=\"file\" name=\"file\" size=\"60\" class=\"style29\" required=\"\" />\r\n");
      out.write("                               <br />                               \r\n");
      out.write("                               <br /> \r\n");
      out.write("                               <input align=\"center\" type=\"submit\" value=\"Upload\" class=\"style29\"/>\r\n");
      out.write("                               </h3></div>\r\n");
      out.write("                                 \r\n");
      out.write("                              </form>  \r\n");
      out.write("                                                           \r\n");
      out.write("                 ");
     }  else if(s.equals("photo"))
                     {
					 
					 
      out.write("\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style9\">~PHOTOS~ </p>\r\n");
      out.write("\t\t\t <p align=\"center\">    <a align=\"center\" href=\"controller?RT=addPic\" class=\"btn\">ADD PHOTO</a> </p>\r\n");
      out.write("\t\t\t\t\t<span class=\"style8\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t        </span>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"style15\">&nbsp;</p>\r\n");
      out.write("\t\t\t<p class=\"grid_2 style31\">&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"img\" id=\"images\">\r\n");
      out.write("                            <form action=\"controller\" method=\"POST\" class=\"style11\">     \r\n");
      out.write("                                <input type=\"Hidden\" value=\"delete\" name=\"RT\">\r\n");
      out.write("                            </form>                  \r\n");
      out.write("              <div class=\"table\" id=\"table\">\r\n");
      out.write("                <p class=\"style11\">                <span class=\"style11\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <div align=\"center\">\r\n");
      out.write("                    ");

                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
                                stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM photo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("         </div>\r\n");
      out.write("                    \r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                        </span>\r\n");
      out.write("                           </div>\r\n");
      out.write("         <li class=\"style11\">\r\n");
      out.write("            \t  \r\n");
      out.write("             <h3 align=\"left\"><img src=\"");
      out.print(rs.getString("pics"));
      out.write("\" width=\"360\" height=\"194\"  alt=\"\"><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span>\r\n");
      out.write("             <a href=\"controller?RT=p_del&pic=");
      out.print(rs.getString("pics"));
      out.write("\" class=\"style16\">DELETE PICTURE</a></h3>\r\n");
      out.write("                         \r\n");
      out.write("         </li>\r\n");
      out.write("                                                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t      <span class=\"style16\">\r\n");
      out.write("\t\t\t\t\t    ");

                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                     }
                      }
                                               
      out.write("\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t                      </span></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bottom_block\">\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t  <div class=\"grid_2 prefix_2\">\r\n");
      out.write("\t\t  <ul>\r\n");
      out.write("\t\t\t  <li></li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  <div class=\"grid_2\"></div>\r\n");
      out.write("\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
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
      out.write("\t\t\t<a href=\"#\"></a>\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copy\">\r\n");
      out.write("\t\t Website designed by Tourist Guide\r\n");
      out.write("                        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t <div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
 } else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1> ONLY FOR ADMIN </h1>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("</html>");
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
