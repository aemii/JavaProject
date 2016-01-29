<!DOCTYPE html>
<%@page language="java" session="false" %>

<html lang="en">
    <% HttpSession sess=request.getSession(false);  if(sess!=null) { %>
     <%@page import="java.sql.*" %>
		 <head>
		 <title>Home</title>
		 <meta charset="utf-8">
		 <link rel="icon" href="images/favicon.ico">
		 <link rel="shortcut icon" href="images/favicon.ico" />
		 <link rel="stylesheet" href="css/style.css">
		 <link rel="stylesheet" href="css/slider.css">
		 <script src="js/jquery.js"></script>
		 <script src="js/jquery-migrate-1.1.1.js"></script>
		 <script src="js/superfish.js"></script>
		 <script src="js/sForm.js"></script>
		 <script src="js/jquery.jqtransform.js"></script>
		 <script src="js/jquery.equalheights.js"></script>
		 <script src="js/jquery.easing.1.3.js"></script>
		 <script src="js/tms-0.4.1.js"></script>
		<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
		 <script src="js/jquery.ui.totop.js"></script>
		 <script>
			$(window).load(function(){
			$('.slider')._TMS({
							show:0,
							pauseOnHover:false,
							prevBu:'.prev',
							nextBu:'.next',
							playBu:false,
							duration:800,
							preset:'random', 
							pagination:false,//'.pagination',true,'<ul></ul>'
							pagNums:false,
							slideshow:8000,
							numStatus:false,
							banners:true,
					waitBannerAnimation:false,
				progressBar:false
			})	;
			 $( "#tabs" ).tabs();
		 
		$().UItoTop({ easingType: 'easeOutQuart' });
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
.style3 {
	font-size: 24px;
	color: #CC0000;
	font-family: "Lucida Handwriting";
}
.style4 {
	font-size: 18px;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}
.style5 {font-size: 18px; font-family: Georgia, "Times New Roman", Times, serif; }
.style6 {
	font-family: "Comic Sans MS", "Cooper Black", Courier;
	color: #FF6600;
}
.style7 {
	font-size: 18px;
	font-family: "Comic Sans MS", "Cooper Black", Courier;
	color: #FF6600;
}
-->
         </style>
		 </head>
		 <body	class="page1">
<!--==============================header=================================-->
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
			
            sql = "SELECT * FROM trip where place='"+name+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                
            %> 
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1><a href="controller?RT=index"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav	class="" >
        <ul class="sf-menu">
          <li class="current"><a href="controller?RT=index">Home</a></li>
       
          <li><a href="controller?RT=index-2">Gallery</a></li>
          <li><a href="controller?RT=index-3">Tours</a></li>
          <li></li>
          <% if(sess!=null) { %>
          
          <li><a href="controller?RT=book&place="<%=rs.getString("place")%>>Book Now</a></li>
          
          <% } else { %>
          
           <li><a href="controller?RT=csignin">Book Now</a></li>
           
           <%  }  %>
		 
		
        </ul>
	
      </nav>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</header>
<div class="main">
	<div class="container_12">
		<div class="grid_12">
	 <div class="slider-relative">
			<div class="slider-block">
				<div class="slider">
					<a href="#" class="prev"></a><a href="#" class="next"></a>
					<ul class="items">
						<li><img src=<%=rs.getString("pic1")%> alt="">
								<div class="banner">
									<span>Experience The Excitmnent!</span>
								</div>
						</li>
						<li><img src=<%=rs.getString("pic2")%> alt="" width="1127" height="724"></li>
						<li><img src=<%=rs.getString("pic3")%> alt="" width="1127" height="724"></li>
						<li><img src=<%=rs.getString("pic4")%> alt="" width="1127" height="724"></li>
						
					</ul>
				</div>
			</div>
		</div>
	</div></div>
	
<!--=======content================================-->

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
	<div class="container_12">
	  
	    <div class="grid_4">
				  <figure>
					  <div>
					    <div></div>
					  </div>
						
					  </figure>
	    </div>
      <div class="grid_4">
		  <figure></figure>
			  </div>
			  <div class="clear"></div>
				<div class="grid_8">
					 <div id="tabs">
	<ul>
		<li><a href="#tabs-1">DETAILS</a></li>
		</ul>
	<div class="clear"></div>
	<div class="tab_cont" id="tabs-1">
	  <h5 align="center" class="style3"> <%=rs.getString("heading")%></h5>
	
	  <p class="style5">&nbsp;</p>
	  <p align="center" class="style5 style6">&nbsp;</p>
	  <p align="center" class="style7"> <%=rs.getString("details")%></p>
	  <p class="style4">&nbsp;</p>
	</div>
	<!--</div>-->
 <div class="tab_cont" id="tabs-3">
   <div class="extra_wrapper">
		  <p class="style1">&nbsp;</p>
			
<div class="clear "></div>

		</div>
		<div class="clear cl1"></div>
		</div>
					 </div>
		</div>
	
	<div class="grid_4"></div>
	<div class="clear"></div></div>
</div>
<div class="bottom_block">
	<div class="container_12">
	  <div class="grid_2 prefix_2">
		  <ul>
			  <li></li>
		  </ul>
	  </div>
		<div class="grid_2">
			<ul>
				<li></li>
			</ul>
		</div>
	  <div class="grid_2"></div>
		<div class="grid_2">
			<h4>Contact Us:</h4>
			TEL: 1-800-234-5678<br><a href="#">info@demolink.org</a>
		 
		</div>
		<div class="clear"></div>
	</div>
  </div>
<!--==============================footer=================================-->
   <%
             }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
      %>
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
 <% }    %>
</body>
</html>