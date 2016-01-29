<!DOCTYPE html>
<%@page language="java" session="false" %>

<html lang="en">
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
		
		 <style type="text/css">
<!--
.style2 {font-size: 16px}
.style3 {font-size: 24px}
.style5 {font-size: 20px}
-->
         </style>
		 </head>
		 <body	class="page1">
<!--==============================header=================================-->
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1><a href="controller?RT=index"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav	class="" >
        <ul class="sf-menu">
          <li class="current"><a href="controller?RT=index" class="style3">Home</a></li>
          <li><a href="controller?RT=gallery" class="style3">Gallery</a></li>
          <li><a href="controller?RT=tours" class="style3">Tours</a></li>
		
           <%
                  HttpSession sess = request.getSession(false);
                  if(sess == null)
                  {
           %>
		  <li><a href="#">Login</a>
		  	<ul>
                <li><a href="controller?RT=a_login&type=resort">Agency</a></li>
                <li><a href="controller?RT=c_login">Customer</a></li>
                
            </ul>
		  </li> 	
		  <li><a href="#">Register</a>
		  	<ul>
                <li><a href="controller?RT=a_signup">Agency</a></li>
                <li><a href="controller?RT=c_signup">Customer</a></li>
            </ul>
		  </li> 
                  <li><a href="controller?RT=admin&type=admin">Admin Login</a></li>
            <%   }
                  else
                 {
                     String s=(String)sess.getAttribute("type");
                        if(s.equals("customer"))
                        { 
              %>
              
              <li><a href="#">Resorts</a>
                  <ul>
              
                <%  
                     
                        Connection conn = null;
                        Statement stmt = null;
                        ResultSet rs=null;
                        int count=0;
                        try{

                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\Desktop\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
           
            String sql;
			
            sql = "SELECT * FROM agencyInfo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                             %>
                            
                          <a href="controller?RT=resort&name=<%=rs.getString("aname")%>" class="sf-menu style5"> <%=rs.getString("aname")%> </a>
                              <br>
                            
                                 
              <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
                        %>
                          </ul>             
              </li>   
                        
                     <%   
                        }else
                        { %>
                              
              <li><a href="addInfo.jsp">Add Info</a></li>
                                   
                                   <% } %>
                                   
                                   <li><a href="controller?RT=profile">View Profile</a></li>
                                   <li><a href="controller?RT=logout">Logout</a></li>
                  
             <% } %>
		 		  
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
						<li><img src="images/slide.jpg" alt="">
								<div class="banner">
									<div>THERE ARE PLENTY OF PLACES</div><br>
									<span> that are worth seeing</span>
								</div>
						</li>
						<li><img src="images/slide1.jpg" alt="" width="1127" height="724"></li>
						<li><img src="images/slide2.jpg" alt="" width="1127" height="724"></li>
						<li><img src="images/slide3.jpg" alt="" width="1127" height="724"></li>
						<li><img src="images/slide4.jpg" alt="" width="5127" height="824"></li>
						
					</ul>
				</div>
			</div>
		</div>
	</div></div>
	
<!--=======content================================-->

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
	<div class="container_12">
		<div class="grid_12">
			<h3>Top Destinations</h3>
		</div>
		<div class="boxes">
		  <div class="grid_4">
					<figure>
						<div><img src="images/page1_img1.jpg" alt=""></div>
						<figcaption>
							<h3>Venice</h3>
							<div>
							  <p><em>" (...) In Venice Tasso's echoes are no more;</em><em>And silent runs the songless gondolier;</em><em>Her palaces are crimbling to the shore;</em><em>And music meets not always the ear;</em><em>Those days are gone - but beauty still is here."</em></p>
						  </div>
					  </figcaption>
					</figure>
		  </div>
				<div class="grid_4">
					<figure>
						<div><img src="images/page1_img2.jpg" alt=""></div>
						<figcaption>
							<h3>New York</h3>
						  <em>There isn't another like it.<br>
							No matter where you go.<br>
							And nobody can compare it.It's win and place and show.<br>
							New York is special.<br>
							New York is diff'rent' cause there's no place else<br>
						  on earth quite like New York and that's why I Luv NY</em>						</figcaption>
					</figure>
				</div>
				<div class="grid_4">
					<figure>
						<div><img src="images/page1_img3.jpg" alt=""></div>
						<figcaption>
							<h3>Paris</h3>
							 <p>If you are lucky enough to have lived in Paris as a young man, then wherever you go for the rest of your life it stays with you, for Paris is a moveable feast.<br>
						  .</p>
							 <p>&nbsp;</p>
					  </figcaption>
					</figure>
				</div>
				<div class="clear"></div>
	  </div>
				<div class="grid_8">
					 <div id="tabs">
	<ul>
		<li><a href="#tabs-1">TRIP IDEAS</a></li>
		<li></li>
	</ul>
	<div class="clear"></div>
	<div class="tab_cont" id="tabs-1">
	  <img src="images/page3_img8.jpg" alt="" width="259" height="166">
	  <div class="extra_wrapper">
			<div class="text1 style2">
			  <p>Weekend in Paris </p>
			  </div>
			<p class="style1"><a class="col2" href="http://blog.templatemonster.com/free-website-templates/" rel="nofollow"></p>
			
Paris, the world's most popular city destination, has plenty of must-see places but make sure you spend at least a day strolling off the beaten path, as this is the only way to discover the real Paris:
<a href="controller?RT=trips&place=paris" class="btn">Details</a>
<div class="clear "></div>

		</div>
		<div class="clear cl1"></div>
		<p>&nbsp;</p>
		<p><img src="images/page1_dubai.jpg" alt="" width="279" height="180"></p>
		<p>&nbsp; </p>
		<div class="extra_wrapper">
			<div class="text1 tx1">
			  <p>New Year In London </p>
			  </div>
			The name London originally referred only to the once-walled "Square Mile" of the original Roman (and later medieval) city (confusingly called the "City of London" or just "The City"). Today, London has taken on a much larger meaning to include all of the vast central parts of the modern metropolis 
			<div class="clear"></div>
			<a href="controller?RT=trips&place=london" class="btn bt1">Details</a>
			<div class="clear "></div>

		</div>		
	
	<!--<div class="tab_cont" id="tabs-1">-->
	  <p><img src="images/page1-niagra.jpg" alt="" width="259" height="194">      </p>
      <div class="extra_wrapper">
        <div class="text1">
			  <p>&nbsp;</p>
			  <p>Mysterious Niagara Falls </p>
			  </div>
			<p class="style1"></p>
			
Since its formation more than 12,000 years ago, Niagara Falls has been a destination for world explorers,? honeymooners? and daredevils alike. Today, visitors flock to the region to be awe-inspired by the beauty and power of Niagara. 
<a href="controller?RT=trips&place=niagara" class="btn">Details</a>
<div class="clear "></div>

		</div>
		<p>&nbsp;</p>
		<p><img src="images/page1-dubai.jpg" alt="" width="269" height="207"></p>
		<div class="extra_wrapper">
			<div class="text1 tx1">
			  <p>&nbsp;</p>
			  <p>Breathtaking rides at Ferrari World </p>
			  </div>
			Ferrari World Abu Dhabi offers a truly amazing experience for every family member with? thrilling rides, exciting attractions,? themed stores and restaurants 
			<div class="clear"></div>
			<a href="controller?RT=trips&place=ferrari" class="btn bt1">Details</a>
			<div class="clear "></div>

		</div>
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
	
	<div class="grid_4">
	<!-- <div class="newsletter_title">NewsLetter </div>
	<!-- <div class="n_container">
			 <form id="newsletter">
									<div class="success">Your subscribe request has been sent!</div>
									<div class="text1">Sign up to receive our newsletters </div>
									<label class="email">
											 <input type="email" value="email address" >
												<span class="error">*This is not a valid email address.</span>
									</label> 
									<div class="clear"></div> <a href="" class="" data-type="submit"></a> 
		  </form> 
		  
							
		</div>-->
	</div>
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
