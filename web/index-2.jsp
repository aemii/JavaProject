<!DOCTYPE html>
<%@page language="java" session="false" %>
 <%@page import="java.sql.*" %>
<html lang="en">
     <head>
     <title>Gallery</title>
     <meta charset="utf-8">
     <link rel="icon" href="images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="css/style.css">
     <link rel="stylesheet" href="css/touchTouch.css">
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/jquery.equalheights.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script src="js/jquery.ui.totop.js"></script>
     <script src="js/touchTouch.jquery.js"></script>
     <script>
     $(window).load(function(){
       $().UItoTop({ easingType: 'easeOutQuart' });
      });
       $(function(){
  
  // Initialize the gallery
  $('.gallery a.gal').touchTouch();
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
				 <li>
                    
                   </li>
                   <li><a href="controller?RT=index">Home</a></li>
                   
                   <li class="current"><a href="controller?RT=gallery">Gallery</a></li>
				   
                   <li><a href="controller?RT=tours">Tours</a></li>
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

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
  <div class="container_12">
      <div class="grid_12">
        <h3>Our Gallery</h3>
         <%  
                     
                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        int count=0;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM photo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             %>
      </div>
      <div class="clear"></div>
       <div class="gallery">
      <div class="grid_4">
        <a href=<%=rs.getString("pics")%> width="500" height="500" class="gal img_inner"><img src="<%=rs.getString("pics")%>" width="360" height="194"  alt=""></a>
      </div>
                         
     <div class="grid_4">
         <%  if(rs.next()) { %>
        <a href=<%=rs.getString("pics")%> width="500" height="500" class="gal img_inner"><img src="<%=rs.getString("pics")%>" width="360" height="194" alt=""></a>
      </div>
      <div class="grid_4">
           <% } if(rs.next()) { %>
        <a href=<%=rs.getString("pics")%> width="500" height="500" class="gal img_inner"><img src="<%=rs.getString("pics")%>" width="360" height="194" alt=""></a>
      </div>
      <% }  %>
      <div class="clear"></div>
     <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
                        %>
    <!--  <div class="grid_4">
        <a href="images/big4.jpg" class="gal img_inner"><img src="images/page3_img4.jpg" alt=""></a>
      </div>
      <div class="grid_4">
        <a href="images/big5.jpg" class="gal img_inner"><img src="images/page3_img5.jpg" alt=""></a>
      </div>
      <div class="grid_4">
        <a href="images/big6.jpg" class="gal img_inner"><img src="images/page3_img6.jpg" alt=""></a>
      </div>
      <div class="clear"></div>
      <div class="grid_4">
        <a href="images/big7.jpg" class="gal img_inner"><img src="images/page3_img7.jpg" alt=""></a>
      </div>
      <div class="grid_4">
        <a href="images/big8.jpg" class="gal img_inner"><img src="images/page3_img8.jpg" alt=""></a>
      </div>
      <div class="grid_4">
        <a href="images/big9.jpg" class="gal img_inner"><img src="images/page3_img9.jpg" alt=""></a>
      </div>
	   <div class="grid_4">
        <a href="images/big10.jpg" class="gal img_inner"><img src="images/page3_img10.jpg" alt=""></a>
      </div>-->
    </div>
      <div class="clear"></div>
  </div>
</div>

<!--=======bottom================================-->
<div class="bottom_block">
  <div class="container_12">
    <div class="grid_2 prefix_2"></div>
    <div class="grid_2"></div>
    <div class="grid_2"></div>
    <div class="grid_2">
      <h4>Contact Us:</h4>
      TEL: 1-800-234-5678<br><a href="#">info@demolink.org</a>
     
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
</html>