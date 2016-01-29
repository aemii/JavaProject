<!DOCTYPE html>
<%@page language="java" session="false" %>
<html lang="en">
    <%@page import="java.sql.*" %>
     <head>
     <title>Tours</title>
     <meta charset="utf-8">
     <link rel="icon" href="images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="css/style.css">
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/jquery.jqtransform.js"></script>
     <script src="js/jquery.equalheights.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script src="js/jquery.ui.totop.js"></script>
     <script>
     $(window).load(function(){
       $().UItoTop({ easingType: 'easeOutQuart' });
      });
      
      $(function() {
    //find all form with class jqtransform and apply the plugin
    $(".form1").jqTransform();
});
     </script>
     <!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
         </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <link rel="stylesheet" media="screen" href="css/ie.css">

    <![endif]-->
    
    
     <style type="text/css">
<!--
.style3 {color: #000099}
.style5 {color: #000033}
.style6 {
	font-size: 16px;
	color: #000000;
}
.style8 {color: #000000}
.style9 {font-size: 16px}
.style11 {
	color: #000033;
	font-size: 16px;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}
.style12 {font-family: Georgia, "Times New Roman", Times, serif}
.style14 {font-family: Verdana, Arial, Helvetica, sans-serif}
.style15 {font-size: 16px; font-family: Verdana, Arial, Helvetica, sans-serif; }
-->
     </style>
     </head>
     <body  class="">
<!--==============================header=================================-->
 <header> 
  <div class="container_12">
    <div class="grid_12"> 
    <h1><a href="controller?RT=index"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
          
         
           <div class="clear"></div>
    </div>
<div class="menu_block">
           <nav  class="" >
             <ul class="sf-menu">
				<li></li>
                   <li><a href="controller?RT=index">Home</a></li>
             
                   <li><a href="controller?gallery">Gallery</a></li>
                   <li class="current"><a href="controller?RT=tours">Tours</a></li>
                   <li></li>
             </ul>
      </nav>
           <div class="clear"></div>
    </div>
           <div class="clear"></div>
   </div>
</header>

<div class="main">
<!--=======content================================-->
   <h3 align="center">Special PACKAGES</h3>
   <% Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        int count=0;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\Desktop\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
        
            String sql;
			
            sql = "SELECT * FROM tours";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                
            %>
   <div class="content">
  <div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>

    <div class="container_12">
      
    <div class="grid_9">
     
      <div class="tours">
      <div class="grid_4 alpha">
        <div class="tour">
          
          <img src="<%=rs.getString("path")%>" alt="" width="167" height="161" class="img_inner fleft">
          <div class="extra_wrapper"><span class="style11"><%=rs.getString("place")%></span>
            <p class="style11"><%=rs.getString("title")%></p>
            <h3><a href="controller?RT=detail&name=<%=rs.getString("place")%>" class="btn">Details</a> </h3>
          </div>
        </div>
      </div>
          <% if(rs.next())
          {%>
      <div class="grid_4 omega">
        <div class="tour">
          <img src="<%=rs.getString("path")%>" alt="" width="167" height="158" class="img_inner fleft">
          <div class="extra_wrapper">
            <p class="style15"><%=rs.getString("place")%></p>
            <h6 class="text1 style9 style14"><a href="http://www.viator.com/tours/Las-Vegas/Las-Vegas-Strip-Night-Flight-by-Helicopter-with-Transport/d684-5847NIGHT">Save 40% </a></h6>
            <p class="style11"><% if(rs.getString("title")!= null){ %> <%=rs.getString("title")%> <%} %></p>
            <p class="style5"><span class="text1">.</span><a href="controller?RT=detail&name=<%=rs.getString("place")%>" class="btn">Details</a> </p>
          </div>
        </div>
      </div>
          
        </div>
    </div>
    </div>
      
  </div>
          <% } %>
          
 
           <%
             }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
        %>
   
</div>

<!--=======bottom================================-->

<!--==============================footer=================================-->

</div>
<footer>    
  <div class="container_12">
  <div class="grid_12">
   
      <div class="copy">
    Website designed by Tourist Guide
     </div>
  </div>
     <div class="clear"></div>
  </div>

</footer>

</body>
</html>