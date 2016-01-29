<!DOCTYPE html>
<%@page language="java" session="false" %>
<html lang="en">
     <% HttpSession sess=request.getSession(false);  if(sess!=null) { %>
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
.style16 {
	color: #FF0000;
	font-family: Jokerman;
}
.style17 {
	font-family: Verdana;
	color: #FF6600;
	font-size: 16px;
}
.style18 {
	color: #FF6633;
	font-size: 24px;
	font-weight: bold;
}
.style19 {
	color: #006699;
	font-size: 18px;
}
-->
     </style>
     </head>
     <body  class="">
<!--==============================header=================================-->
 <header> 
  <div class="container_12">
    <div class="grid_12"> 
    <h1><a href="index.jsp"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
           <% Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        int count=0;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\Desktop\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
           String name=(String)sess.getAttribute("place");
           
            String sql;
			
            sql = "SELECT * FROM tours where place='"+name+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                
            %> 
         
           <div class="clear"></div>
    </div>
<div class="menu_block">
           <nav  class="" >
             <ul class="sf-menu">
				<li></li>
                   <li><a href="index.jsp">Home</a></li>
             
                   <li><a href="index-2.jsp">Gallery</a></li>
                   <li class="current"><a href="index-3.jsp">Tours</a></li>
                   <li></li>
                    <li><a href="controller?RT=book&place=<%=rs.getString("place")%>">Book Now</a></li>
             </ul>
      </nav>
           <div class="clear"></div>
    </div>
           <div class="clear"></div>
   </div>
</header>

<div class="main">
<!--=======content================================-->
 <div class="content" >
<div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
 
     
    <h3 align="center">OverView	 </h3>
              
  <!--  <div class="grid_4 alpha">
     <!-- <div class="tour">
      <!--  <div class="extra_wrapper"> -->
          <div id="special-offer">
            <div>
              <h2 align="center" class="newsletter_title style16">SPECIAL OFFER</h2>
            </div>
            <div>
              <div>
                <p align="center" class="style17"> <%=rs.getString("title")%></p>
              </div>
			  <br>
            </div>
          </div>
          <div itemprop="description">
            <div align="center" class="style19"> <%=rs.getString("description")%></div>
          </div>
          <div></div>
          <h2 align="center" class="style18">&nbsp;</h2>
          <h2 align="center" class="style18">Highlights</h2>
          <p align="center" class="style18">&nbsp;</p>
          <div>
            <div align="center">
              <ul class="style19">
                 <%=rs.getString("highlights")%>
              </ul>
            </div>
			<br>           
          </div>
              
              <div align="center"><img align="center" src="images/page4_img1.jpg" width="275" height="183">
                
              </div>
 </div>
  
          <h3>&nbsp;</h3>
    
      
      
    <!--=======bottom================================-->
 
  </div>
                  </div>           <div align="center">

              
    
	<br>
 
  <div class="bottom_block">
  <div class="container_12">
    <div class="grid_2 prefix_2"></div>
    <div class="grid_2"></div>
    <div class="grid_2">
      <ul>
        <li></li>
        </ul>
    </div>
     <%
             }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                        %>
    <div class="grid_2">
      <h4>&nbsp;</h4>
      </div>
    <div class="clear"></div>
    </div>
  </div>
<!--==============================footer=================================-->

</div>
<footer>    
  <div class="container_12">
  <div class="grid_12">
    <div class="socials">
      <a href="#"></a>
      <a href="#"></a>
      <a href="#"></a>
      <a href="#"></a>
    </div>
      <div class="copy">
     Website designed by Tourist Guide
     </div>
  </div>
     <div class="clear"></div>
  </div>

</footer>

</body>
<% } else { %>

<h1> ONLY FOR AUTHORIZED USERS </h1>

<% } %>
</html>