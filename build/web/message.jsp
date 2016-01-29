<!DOCTYPE html>
<%@page language="java" session="false" %>
<html lang="en">
    <%@page import="java.sql.*" %>
     <head>
         <% HttpSession sess=request.getSession(false); if(sess!=null) { %>
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
.style2 {font-family: Georgia, "Times New Roman", Times, serif; color:#FF7F50;font-size: 30px;}
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
   <h3 align="center">Booking Confirmation</h3>
  
   <div class="content">
  <div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>

    <div class="container_12">
      
    
        <h3 class="style2">Thankyou! For Booking a Trip With us. You will receive a confirmation call within 2-3 days.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="controller?RT=index" class="btn"  align="center" class="style2">&nbsp;OK&nbsp;</a></h3>  <br><span class="tab">&nbsp;</span><p>&nbsp;</p><span>&nbsp;</span><span>&nbsp;</span><span>&nbsp;</span><span>&nbsp;</span><span>&nbsp;</span>
        
      <div class="tours">
    <!--  <div class="grid_4 alpha">
        <div class="tour">
          
         
      <div class="grid_4 omega">
        <div class="tour">
        
           
          </div>
        </div>
      </div>
          
        </div>-->
    </div>

      
  </div>
         
   
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
<% } else { %>

<h1> ONLY FOR AUTHORIZED USERS</h1>

<% } %>
</html>