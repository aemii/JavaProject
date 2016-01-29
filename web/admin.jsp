<!DOCTYPE html>
<%@page import="java.sql.*" %>
<%@page language="java" session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
     <%@page import="java.sql.*" %>
		 <head>
                       <% HttpSession sess=request.getSession(false);  if(sess!=null) { 
                        %>
		 <title>Admin</title>
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
.style7 {font-family: "Comic Sans MS", "Cooper Black", Courier}
.style15 {
	color: #0099FF;
	font-size: 10;
	font-family: 'Pathway Gothic One', sans-serif;
}
.style27 {font-family: "Bradley Hand ITC"}
.style31 {
	font-family: Pathway Gothic One', sans-serif}
.style33 {font-family: Pathway Gothic One', sans-serif;
	color: #0099FF;
	font-size: 10;
}
.style8 {font-size: 45px}
.style9 {color: #FF9933; font-size: 45px; font-family: 'Pathway Gothic One', sans-serif; }
.style11 {
	color: #0099FF;
	font-size: 10;
}
.style14 {color: #0099FF; font-size: 40px; font-family: 'Pathway Gothic One', sans-serif; }
.style16 {
	font-family: Pathway Gothic One', sans-serif}
.style33 {font-family: Pathway Gothic One', sans-serif;
	font-weight: bold;
	font-size: 36px;
	color: #FF6633;
}
-->
         </style>
		 </head>
		 <body	class="page1">
<!--==============================header=================================-->
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1><a href="#"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
      <div class="clear"></div>
    </div>
    <div class="menu_block">
      <nav	class="" >
        <ul class="sf-menu">
         <li><a href="controller?RT=users" class="style3">Users</a></li>
          <li><a href="controller?RT=r_resorts" class="style3">Resorts</a></li>
          <li><a href="controller?RT=tour" class="style3">Tours</a></li>
           <li><a href="controller?RT=bookings" class="style3">Bookings</a></li>
           <li><a href="controller?RT=photo" class="style3">Photos</a></li>
          
		
           <%
                 
                  if(sess != null)
                  {
           %>
                                    
              
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

	
<!--=======content================================-->

<div class="style2">
  <div class="ic style7">More Website Templates @ TemplateMonster.com - August 05, 2013!</div>
			<h1 align="center" class="banner">&nbsp;</h1>
			<h1 align="center" class="style14">WELCOME ADMIN!</h1>
			<p align="center" class="style14">&nbsp;</p>
			<%  
                  String s=(String)sess.getAttribute("type");
                  if(s!=null)
                      {
                     if(s.equals("resort"))
                     {
					 
					 %>
			<p align="center" class="style9">~REGISTERED RESORTS~ </p>
			
					<span class="style8">
					
			        </span>
			<p align="center" class="style15">&nbsp;</p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
                            <form action="controller" method="POST" class="style11">     
                                <input type="Hidden" value="delete" name="RT">
                            </form>                  
              <div class="table" id="table">
                <p class="style11">                <span class="style11">
                  <table>
                  <div align="center">
                    <%
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
                             %>
                    </p>
         </div>
                    
                        </div>					
                        </span>
                           </div>
         <li class="style11">
	        	  
                                  
                                   <h3 align="center"><%=rs.getString("aname")%></h3>
                                   <p align="center" class="style14">Location: <%=rs.getString("location")%></p>
                                   <p align="center" class="style14">Number: <%=rs.getString("phonenumber")%></p>
                                   <p align="center" class="style14">Email: <%=rs.getString("email")%></p>
                                   <p align="center" class="style14">Services: <%=rs.getString("services")%></p>
                                  
                                       <h3 align="center"><a href="controller?RT=r_del&email=<%=rs.getString("email")%>" class="style16">DELETE RESORT</a> </h3>
                                    
         </li>
                                
                    
                    
                    
						<div align="center">
						  
						  
					      <span class="style16">
					    <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                      
                                               %>
					    </li>
	                      </span></div>
                                            
                                            
                       <% } else if(s.equals("users")) { %>
					</span>
					<p align="center" class="style9">~REGISTERED USERS~ </p>
			
					<span class="style11">
					
			        </span>
			<p align="center" class="style15">&nbsp;</p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
                            <form action="controller" method="POST" class="style11">     
                                <input type="Hidden" value="delete" name="RT">
                            </form>                  
              <div class="table" id="table">
                <p class="style11">                <span class="style11">
                  <table>
                  <div align="center">
                    <%
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
                             %>
                    </p>
         </div>
                    
                        </div>					
                        </span>
                           </div>
         <li class="style11">
	        	  
                                  
                                   <h3 align="center"><%=rs.getString("cname")%></h3>
                                   <p align="center" class="style14">Gender: <%=rs.getString("gender")%></p>
                                   <p align="center" class="style14">Number: <%=rs.getString("phonenumber")%></p>
                                   <p align="center" class="style14">Email: <%=rs.getString("email")%></p>
                                   
                                
                                     
         </li>
                                
                    
                    
                    
						<div align="center">
						  
						  
					      <span class="style16">
					    <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
           
                     
                       %>
			
                      
                          <% } else if(s.equals("tour")) { %>
					</span>
                                        <p align="center" class="style9">~TOURS~ </p> <br>
                                        <p align="center">    <a align="center" href="controller?RT=addTour" class="btn">ADD TOUR</a> </p>
			
					<span class="style11">
					
			        </span>
			<p align="center" class="style15">&nbsp;</p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
                            <form action="controller" method="POST" class="style11">     
                                <input type="Hidden" value="delete" name="RT">
                            </form>                  
              <div class="table" id="table">
                <p class="style11">                <span class="style11">
                  <table>
                  <div align="center">
                    <%
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
                             %>
                    </p>
         </div>
                    
                        </div>					
                        </span>
                           </div>
         <li class="style7">
	        	  
                                  
                                   <h3 align="center"><%=rs.getString("place")%></h3>
                                   <p align="center" class="style7"><%=rs.getString("title")%></p><br>
                                   <p align="center" class="style7"><%=rs.getString("description")%></p><br>
                                   <p align="center" class="style7"><%=rs.getString("highlights")%></p>
                                   
                                  <div align="center">
                                       <h3 align="center"><a href="controller?RT=t_del&place=<%=rs.getString("place")%>" class="style16">DELETE TOUR</a></h3>
                                  </div>
         </li
                                
                    
                    
                    
						><div align="center">
						  
						  
					      <span class="style16">
					    <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       
                      
                     
                       %>
                      
                      
                      <% } else if(s.equals("bookings")) { %>
					</span>
					<p align="center" class="style9">~BOOKINGS~ </p>
			
					<span class="style11">
					
			        </span>
			<p align="center" class="style15">&nbsp;</p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
                            <form action="controller" method="POST" class="style11">     
                                <input type="Hidden" value="delete" name="RT">
                            </form>                  
              <div class="table" id="table">
                <p class="style11">                <span class="style11">
                  <table>
                  <div align="center">
                    <%
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
                             %>
                    </p>
         </div>
                    
                        </div>					
                        </span>
                           </div>
         <li class="style7">
	        	  
                                  
                                   <h3 align="center"><%=rs.getString("place")%></h3>
                                   <p align="center" class="style7"><%=rs.getString("date")%></p><br>
                                   <p align="center" class="style7">Booked by: <%=rs.getString("name")%></p><br>
                                   <p align="center" class="style7"><%=rs.getString("number")%></p>
                                    <p align="center" class="style7">Payment By: <%=rs.getString("payment")%></p><br>
                                     <p align="center" class="style7">For :<%=rs.getString("days")%>Days</p><br>
                                     
                                  
         </li>
                                
                    
                    
                    
						<div align="center">
						  
						  
					      <span class="style16">
					    <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                       %>
  
			<p align="center" class="style11">&nbsp;</p>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>
			<p align="center">&nbsp;</p>s</div>
                                          } 
                     
               <%   } if(s.equals("addPhoto")) { %>
                           
                               <form method="post" action="controller?RT=a_upload" enctype="multipart/form-data">
                               <div align="center">                                 
                               <h3 class="style29">Select Photo: 
                               <input type="file" name="file" size="60" class="style29" required="" />
                               <br />                               
                               <br /> 
                               <input align="center" type="submit" value="Upload" class="style29"/>
                               </h3></div>
                                 
                              </form>  
                                                           
                 <%     }  else if(s.equals("photo"))
                     {
					 
					 %>
			<p align="center" class="style9">~PHOTOS~ </p>
			 <p align="center">    <a align="center" href="controller?RT=addPic" class="btn">ADD PHOTO</a> </p>
					<span class="style8">
					
			        </span>
			<p align="center" class="style15">&nbsp;</p>
			<p class="grid_2 style31">&nbsp;</p>
			<div class="img" id="images">
                            <form action="controller" method="POST" class="style11">     
                                <input type="Hidden" value="delete" name="RT">
                            </form>                  
              <div class="table" id="table">
                <p class="style11">                <span class="style11">
                  <table>
                  <div align="center">
                    <%
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
                             %>
                    </p>
         </div>
                    
                        </div>					
                        </span>
                           </div>
         <li class="style11">
            	  
             <h3 align="left"><img src="<%=rs.getString("pics")%>" width="360" height="194"  alt=""><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span><span>&nbsp</span>
             <a href="controller?RT=p_del&pic=<%=rs.getString("pics")%>" class="style16">DELETE PICTURE</a></h3>
                         
         </li>
                                                    
                    
                    
						<div align="center">
						  
						  
					      <span class="style16">
					    <%
                        }
                   }
                   catch(Exception e)
                   {
                       System.out.println(e.getMessage());
                   }
                     }
                      }
                                               %>
					    </li>
	                      </span></div>

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
			<a href="#"></a>		</div>
			<div class="copy">
		 Website designed by Tourist Guide
                        </div>
	</div>
		 <div class="clear"></div>
	</div>
</footer>
</body>
<% } else { %>

<h1> ONLY FOR ADMIN </h1>

<% } %>
                       
</html>