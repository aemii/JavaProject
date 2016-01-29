<%@page import="java.sql.*" %>
<%@page language="java" session="false" %>
<!DOCTYPE html>
<html lang="en">
      <% 
                                    HttpSession sess=request.getSession(false);
                             if(sess!=null)
                             {
                               %>  
		 <head>
		 <title>Agency Profile</title>
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
.style3 {
	color: #FF9933;
	font-family: 'Pathway Gothic One', sans-serif;
	font-size: 45px;
}
.style7 {font-family: "Comic Sans MS", "Cooper Black", Courier}
.style15 {color: #CC6600; font-size: 24px; }
.style24 {
	font-size: 30px;
	font-family: 'Pathway Gothic One', sans-serif;
}
.style27 {
	color: #FF9900;
	font-family: 'Pathway Gothic One', sans-serif;
	font-size: 35px;
}
.style28 {color: #CC6600; font-size: 45px; font-family: 'Pathway Gothic One', sans-serif; }
.style29 {font-family: 'Pathway Gothic One', sans-serif}
.style30 {color: #0066CC; font-weight: bold;}
.style31 {color: #0099CC; font-size: 24px;}
.style38 {font-size: 45px}
.style39 {color: #FF9900; font-family: "Comic Sans MS", "Cooper Black", Courier; font-size: 35px; font-style: italic; }
.style40 {color: #FF9900}
.style41 {color: #0099CC}
.style43 {color: #0099CC; font-size: 28px; }
.style44 {font-size: 28px; }
.style45 {color: #FF9900; font-size: 36px; }
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
          <li class="current"><a href="index.jsp">Home</a></li>
        
          <li><a href="index-2.jsp">Gallery</a></li>
          <li><a href="index-3.jsp">Tours</a></li>
          <li></li>
		   <li><a href="addInfo.jsp">Add Info</a></li>
		 </ul>
		 </div>
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

<div class="style2">
  <div class="ic style7">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
			<h1 align="center" class="banner">&nbsp;</h1>
			<p align="center" class="banner">&nbsp;</p>
			<h1 align="center" class="newsletter_title style3">WELCOME!! 
                               
                               
                               <%=sess.getAttribute("name") %>    
                                    
			 </h1>
			<p align="center" class="style28">&nbsp;</p>
			<p align="center" class="style15 style24 style27">&nbsp;</p>
			<p class="grid_2 style29">&nbsp;</p>
			<div class="img" id="images">
			  <table width="1253" height="504">
                              
                <tr>
             
                  <td width="287" class="style29"><div align="right" class="style30">
                    <div align="left">
                        <img src="<%=sess.getAttribute("pic")%>" name="image" width="300" height="300" border="0">
                   
                    </div>
                  </div></td>
                  <td width="851" class="style29"><p>&nbsp;</p>
                    <table width="644" height="939" align="center">
                  
                    <tr>
                      <td width="294" height="93"><p align="center" class="style43">&nbsp;</p>
                        <p align="center" class="style43">Resort Name: </p></td>
                      <td width="338" class="style45">
                        <p align="center">&nbsp;</p>                        <p align="center" class="style38">
                      <%=sess.getAttribute("name") %>  </p></td>
                    </tr>
                    <tr>
                      <td height="94"><div align="center" class="style43">
                        <p>&nbsp;</p>
                        <p class="style41">Resort Location  :</p>
                      </div></td>
                      <td class="style45">
                        <p align="center">&nbsp;                        </p>                        <p align="center" class="style38">
                      <%=sess.getAttribute("location") %>                        </p></td>
                    </tr>
                    <tr>
                      <td height="86"><p class="style44">&nbsp;</p>
                      <p align="center" class="style43">Phone Number: </p>                      </td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center"><%=sess.getAttribute("number") %>  </p></td>
                    </tr>
                    <tr>
                      <td height="89"><p class="style44">&nbsp;</p>
                      <p align="center" class="style43">Category:</p></td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center"><%=sess.getAttribute("category") %>                      </p></td>
                    </tr>
                    <tr>
                      <td height="111"><p class="style44">&nbsp;</p>
                      <p align="center" class="style43">Email:</p>
                      <p class="style44">&nbsp;</p></td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center"><%=sess.getAttribute("id") %>  </p></td>
                    </tr>
                    <tr>
                      <td height="111" class="style31"><div align="center">
                        <p>&nbsp;</p>
                        <p>Services:</p>
                      </div></td>
                      <td class="style45"><p>&nbsp;</p>
                        <p align="center">
                          <%String s=(String)sess.getAttribute("services"); if(s!=null) { %> 
                          <%=sess.getAttribute("services") %>
                          <% } else {%> 
                        </p>
                        <p align="center">Not Mentioned 
					  						<% } %> 
					    </p></td>
                    </tr>
                    <tr>
                      <td height="111" class="style31"><div align="center">
                        <p>&nbsp;</p>
                        <p>Per Night Stay: </p>
                      </div></td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center">
                        <%String s1=(String)sess.getAttribute("stay"); if(s1!=null) { %> 
                        <%=sess.getAttribute("stay") %>
					  						<% } else {%> 
  						</p>
                        <p align="center">Not Mentioned 
					  						<% } %> 
  						</p>
                      
                      </td>
                    </tr>
                    <tr>
                      <td height="111" class="style31"><div align="center">
                        <p>&nbsp;</p>
                        <p>Distance From Airport: </p>
                      </div></td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center">
                        <%String s2=(String)sess.getAttribute("distance"); if(s2!=null) { %> 
                        <%=sess.getAttribute("distance") %>
					  						<% } else {%>
                      </p>
                        <p align="center"> 
					  						Not Mentioned 
					  						  <% } %> 
  						</p></td>
                    </tr>
                    <tr>
                      <td height="111" class="style31"><div align="center">
                        <p>&nbsp;</p>
                        <p>Other Packages: </p>
                      </div></td>
                      <td class="style45"><p>&nbsp;</p>
                      <p align="center">
                        <%String s3=(String)sess.getAttribute("package"); if(s3!=null) { %> 
                        <%=sess.getAttribute("package") %>
					  						<% } else {%>
                      </p>
                        <p align="center"> 
					  						  <span class="style45">Not Mentioned					  						  </span>
					  						  <% } %> 
  						</p></td>
                    </tr>
                 
                  </table>
                  <p align="center">&nbsp;</p>
                  <p align="center">&nbsp;</p>
                  <p href="index.html" align="center">
                    <label></label>
                  </p>
                  <p href="index.html" align="center">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p></td>
                  <td width="99" class="style29"><label for="Submit"></label>
                   <form action="controller" method="post">
				  	<input type="hidden" value="aedit" name="RT">
                  <input name="edit" type="submit" class="style47" id="label" value="edit"></td>
				  </form>
                </tr>
                </tr>
              </table>
              <div class="table" id="table"></div>
	</div>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
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
		 <div class="clear"></div>
	</div>

</footer>

</body>
<% } else { %>

<h1> ONLY FOR AUTHORIZED USERS </h1>

<% } %>


</html>