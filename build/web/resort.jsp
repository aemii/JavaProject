
<%@page language="java" session="false" %>
<!DOCTYPE html>
<html lang="en">
    <% HttpSession sess=request.getSession(false);  if(sess!=null) { %>
    <%@page import="java.sql.*" %>
		 <head>
		 <title>Resort</title>
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

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
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
.style2 {font-size: 14px}
.style7 {font-family: "Comic Sans MS", "Cooper Black", Courier}
.style29 {font-family: 'Pathway Gothic One', sans-serif}
.style55 {
	color: #0099CC;
	font-size: 40px;
	font-weight: bold;
}
.style59 {font-size: 40px}
.style60 {color: #FF6600}
.style62 {
	font-weight: bold;
	color: #0099CC;
	font-size: 24px;
}
.style63 {font-size: 24px}
.style64 {color: #FF6600; font-size: 24px; }
-->
         </style>
		 </head>
		 
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

<div class="style2">
  <div class="ic style7">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
			<h1 align="center" class="banner">&nbsp;</h1>
	<div class="container_12">
		<div class="grid_12"> </div>
	</div></div>
	
 <div class="container_2">                       
                        
    <div align="center">
       <% Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        int count=0;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\Desktop\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
            
            String name=(String)sess.getAttribute("resort");
            String sql;
			
            sql = "SELECT * FROM agencyInfo where aname='"+name+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                
            %>
     </div>
     
     <body>	
     <p class="grid_2 style29">&nbsp;</p>
			<div class="img" id="images">
			  <table width="85%" border="1">
                <tr>
                  <td width="298" class="style29"><% String s=rs.getString("path"); if(s!=null) { %>
    
                     <a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('image','','<%=rs.getString("path")%>',1)"><img src="<%=rs.getString("path")%>" name="image" width="300" height="300" border="0"></a> </td>
                 <% } %>
                  <td width="624" class="style29"><p align="center" class="style55"><%=rs.getString("aname")%></p>
                    <ul class="style59">
                      <li class="style60 style63">Location: <%=rs.getString("location")%></li>
                    </ul>
                    <p class="style63">&nbsp;</p>
                    <p class="style2">&nbsp;</p>
                     <ul class="style59 style2">
                      <li class="style64">Contact Us At: TEL    <%=rs.getString("phonenumber")%></li>
                    </ul>
                    <p class="style63">&nbsp;</p>
                    <p class="style63">&nbsp;</p>
                    <ul class="style63">
                      <li>		<span class="style60 ">Email: <%=rs.getString("email")%></span></li>
                    </ul>
                    <ul class="style59 style2">
                          <p class="style63">&nbsp;</p>
                    <p class="style63">&nbsp;</p>
                        <%String s1=rs.getString("services"); if(s1!=null) { %> 
                        <li class="style64">Our Services: <%=rs.getString("services")%></li>
                     
                            <span class="style63">
                            <% } else {%> 
  				        
                       
					  						<span class="style63">
					  						<% } %> 
                                            
                    </ul>
                    <p class="style63">&nbsp;</p>
                    <p class="style2">&nbsp;</p>
                    <ul class="style59 style2">
                       <%String s2= rs.getString("package") ; if(s2!=null) { %> 
                        <li class="style64">Our Packages: <%=rs.getString("package")%></li>
                     
                            <span class="style63">
                            <% } %>
  				     
                    </ul>
                    <p class="style63">&nbsp;</p>
                    <p class="style2">&nbsp;</p>
                    <ul class="style63">
                       <%String s3=rs.getString("stay"); if(s3!=null) { %> 
                        <li class="style60">Per Night Stay: <%=rs.getString("stay")%></li>
                     
                            <% } %> 
 				<!--<li class="style60">Stay: not mentioned</li>-->
					  						 
                    </ul>
                   
                    <p align="center" class="style59" href="index.html">
                      
                      <span class="style62">
                      <label></label>
                      </span> </p>
                  <p align="center" class="style59" href="index.html">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p>
                  <p href="index.html" align="center">&nbsp;</p></td>
                </tr>
                <tr>
                  <td class="style29">&nbsp;</td>
                  <td class="style29">&nbsp;</td>
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
            <%
             }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                        %>
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
<% } else { %>

<h1> ONLY FOR AUTHORIZED USERS </h1>

<% } %>

</html>