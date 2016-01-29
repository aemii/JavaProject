<%@page import="java.sql.*" %>
<%@page language="java" session="false" %>
<!DOCTYPE html>
<html lang="en">
		 <head>
		 <title>Customer Signup</title>
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
<!--



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

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
//-->
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
.style2 {font-size: 16px}
.style27 {font-family: "Bradley Hand ITC"}
.style31 {font-family: Pathway Gothic One', sans-serif}
.style33 {font-family: Pathway Gothic One', sans-serif}
.style34 {color: #0066CC; font-weight: bold;}
.style35 {font-family: Pathway Gothic One', sans-serif}
.style36 {color: #0099CC; font-weight: bold; font-size: 24px;}
.style37 {color: #0099CC; font-size: 24px;}
.style38 {font-weight: bold; color: #0099CC;}
.style40 {font-family: Pathway Gothic One', sans-serif}
.style46 {font-family: 'Pathway Gothic One', sans-serif}
.style37 {color: #0099CC; font-size: 24px;}
.style48 {font-family: 'Pathway Gothic One', sans-serif; color: #0099CC; font-size: 24px; }
.style56 {font-size: 55px; color: #6699CC; font-family: 'Pathway Gothic One', sans-serif; }
.style60 {color: #CC0000; font-size: 24px; }
.style62 {color: #FF9933; font-size: 36px; font-family: 'Pathway Gothic One', sans-serif; }
.style63 {font-size: 36px}
.style70 {font-family: Georgia, "Times New Roman", Times, serif; color:#FF7F50;font-size: 16px;}
-->
         </style>
		 </head>
		 <body	class="page1">
<!--==============================header=================================-->
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1><a href="index.jsp"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav	class="" >
        <ul class="sf-menu">
       
          
        </ul>
	
      </nav>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</header>
<div class="main">

	
<!--=======content================================-->
<form method="POST" action="controller">
    <input type="hidden" value="csignup" name="RT" /> 
<div class="style2">
			<h1 align="center" class="banner">&nbsp;</h1>
			<p align="center" class="banner style27">&nbsp;</p>
			<h1 align="center" class="style56">WELCOME TO JOURNEY!</h1>
			<p align="center" class="style56">&nbsp;</p>
			<p align="center" class="style62 style63">~PLAN YOUR TRIP WITH US~</p>
			<p align="center" class="style62">&nbsp;</p>
			<p align="center" class="style62">~CUSTOMER REGISTERATION~ </p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
			  <table width="1265" height="504">
                <tr>
                  <td width="295" class="style33 style43"><div align="right" class="style34">
                    <div align="left">
                      <p><img src="imagesS/img1.jpg" width="275" height="200" border="55"></p>
                      <p><img src="imagesS/img2.jpg" width="275" height="200"></p>
                      <p><img src="imagesS/img3.jpg" width="275" height="200"></p>
                    </div>
                  </div></td>
                  <td width="691" class="style35"><table width="618" height="252" align="center">
                    <tr>
                      <td width="210" height="46"><p align="center" class="style48">&nbsp;</p>
                      <p align="center" class="style48">Email:</p></td>
                      <td width="396"><div align="center" class="style37 style46">
                        <p>&nbsp;                        </p>
                        <p>
                          <input name="email" type="email" id="email" size="50" required="">
                        </p>
                      </div></td>
                    </tr>
                    <tr>
                      <td height="57"><div align="center" class="style48">
                        <p>&nbsp;</p>
                        <p>Password:</p>
                      </div></td>
                      <td><div align="center" class="style37 style46">
                        <p>&nbsp;                        </p>
                        <p>
                          <input name="password" type="password" id="password" size="50" required="">
                        </p>
                      </div></td>
                      <% String s=(String)request.getAttribute("msg");
                          if(s!=null) { if (s.equals("bad")) {%>
                      <td><p>&nbsp;                        </p><p class="style70" align="center" name="msg">BAD PASSWORD</p></td>
                      <% } } %>
                    </tr>
                    <tr>
                      <td height="45"><p align="center" class="style48">&nbsp;</p>
                      <p align="center" class="style48">Name:</p></td>
                      <td><div align="center" class="style37 style46">
                        <p>&nbsp;                        </p>
                        <p>
                          <input name="name" type="text" id="name" size="50" required="">
                        </p>
                      </div></td>
                    </tr>
                    <tr>
                      <td height="45"><div align="center" class="style37">
                        <p>&nbsp;</p>
                        <p>Gender:</p>
                      </div></td>
                      <td><label for="radiobutton">
                        <div align="center"><br>
                          <br>
                          <span class="style37">Male
                          <input name="gender" type="radio" value="male" id="radiobutton" required="">
                          </span>                        <span class="style37">Female
                          <input name="gender" type="radio" value="female" id="label" required="">
                        </span></div>
                      </label>
                      <label for="checkbox"></label></td>
                    </tr>
                    <tr>
                      <td height="45"><p>&nbsp;</p>
                      <p align="center" class="style37">Phonenumber:</p></td>
                      <td><p>&nbsp;</p>
                      <p align="center">
                        <label for="textfield"></label>
                        <input name="number" type="text" id="textfield" size="50" required="">
                      </p></td>
                    </tr>
                  </table>
                
                  <p align="center">&nbsp;</p>
                  <p align="center">
                    <input align="right" name="create" type="submit" class="style34" id="create" value="Create Account" style="background-color:#FF9933; color:#FFFFFF;font-size: 20px">
                  
                   <% String s1=(String)request.getAttribute("msg"); if(s1!=null) { if(s1.equals("U")) { %>
</p>
                  <p align="center" class="style60">**USER ID ALREADY TAKEN**</p>
                        
                  <% }} %>                </td>
                  <td width="263" class="style35"><p><img src="imagesS/img4.jpg" width="265" height="180"></p>
                  <p><img src="imagesS/img5jpg.jpg" width="250" height="180"></p>
                  <p><img src="imagesS/img6.jpg" width="250" height="180"></p></td>
                </tr>
              </table>
              <div class="table" id="table"></div>
	</div>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
</div>
    
</form>   
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