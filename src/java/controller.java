import java.sql.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
                 maxFileSize=1024*1024*10,      // 10MB
                 maxRequestSize=1024*1024*50)   // 50MB

@WebServlet(urlPatterns = {"/controller"})


public class controller extends HttpServlet {
    
     private static final String SAVE_DIR = "resort";

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String reqType= request.getParameter("RT");
  
    if(reqType.equals("index"))
    {
        response.sendRedirect("index.jsp");
    }
    else if(reqType.equals("contacts"))
    {
        response.sendRedirect("index-5.jsp");
    }
    else if(reqType.equals("tours"))
    {
        response.sendRedirect("index-3.jsp");
    }
    else if(reqType.equals("gallery"))
    {
        response.sendRedirect("index-2.jsp");
    }
    else if(reqType.equals("a_login"))
    {
        request.setAttribute("type","resort");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
        rd.include(request,response);
    }
    else if(reqType.equals("c_login"))
    {
        request.setAttribute("type","customer");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
        rd.include(request,response);
    }
    else if(reqType.equals("a_signup"))
    {
        response.sendRedirect("agency.jsp");
    }
    else if(reqType.equals("c_signup"))
    {
        response.sendRedirect("customer.jsp");
    }
     else if(reqType.equals("detail"))
    {
        
       HttpSession sess=request.getSession(false);
       if(sess==null)
       {
          request.setAttribute("type","customer");
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
          rd.include(request,response);
       }
       else
       {
        
       sess.setAttribute("place",request.getParameter("name"));
       RequestDispatcher rd = getServletContext().getRequestDispatcher("/pack-detail-1.jsp");
       rd.include(request,response);
       }
        
    }
    
    else if(reqType.equals("trips"))
    {
        
       HttpSession sess=request.getSession(false);
       if(sess==null)
       {
          request.setAttribute("type","customer");
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
          rd.include(request,response);
       }
       else
       {
        
       sess.setAttribute("place",request.getParameter("place"));
       RequestDispatcher rd = getServletContext().getRequestDispatcher("/detail-1.jsp");
       rd.include(request,response);
       }
        
    }
    else if(reqType.equals("pdetail-2"))
    {
        response.sendRedirect("pack-detail-2.jsp");
    }
    else if(reqType.equals("pdetail-3"))
    {
        response.sendRedirect("pack-detail-3.jsp");
    }
    else if(reqType.equals("pdetail-4"))
    {
        response.sendRedirect("pack-detail-4.jsp");
    }
    else if(reqType.equals("cedit"))
    {
        response.sendRedirect("c_edit.jsp");
    }
    
     else if(reqType.equals("resort"))
    {
     
     HttpSession sess=request.getSession(false);
   //   if(sess!=null)
      {
      //request.getParameter("name");    
      sess.setAttribute("resort",request.getParameter("name"));
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/resort.jsp");
      rd.include(request,response);
      
      }
    }
      
     else if(reqType.equals("addTour"))
    {
        response.sendRedirect("addTour.jsp");
    }
      
      else if(reqType.equals("aedit"))
    {
        response.sendRedirect("a_edit.jsp");
    }
     else if(reqType.equals("profile"))
    {
        HttpSession sess=request.getSession(false);
        if(sess!=null)
        {
        if(sess.getAttribute("type").equals("customer"))
        {
        response.sendRedirect("c_profile.jsp");
        }
        if(sess.getAttribute("type").equals("agency"))
        {
        response.sendRedirect("a_profile.jsp");
        }
        }
      
    }
     
      else if(reqType.equals("logout"))
      {
          
          HttpSession session = request.getSession(false); 
          if(session!=null)
          {
          session.invalidate();
          request.getRequestDispatcher("index.jsp").forward(request, response);
          }
          
      } 
    
    
    
    else if(reqType.equals("csignup"))
    {
      
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String pass=request.getParameter("password");
        String gender=request.getParameter("gender");
        String number=request.getParameter("number");
       if(pass.length() < 5)
         {
         request.setAttribute("msg","bad");
         request.getRequestDispatcher("customer.jsp").forward(request, response);                
         }
         if(DAL.validLogin(email))
         {
           request.setAttribute("msg", "U");
           request.getRequestDispatcher("customer.jsp").forward(request, response);
          
         }
         else
            {  
                    if(DAL.Customersignup(email, pass, name, number, gender))
                    {
                        HttpSession session = request.getSession(true);
                        session.setAttribute("id", email);
                        session.setAttribute("name", name);
                        session.setAttribute("number", number);
                        session.setAttribute("gender", gender); 
                        session.setAttribute("type", "customer");
                        response.sendRedirect("index.jsp");
                        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
                        rd.include(request,response);
                       
                    }       
        else
        {
          request.setAttribute("msg", "U");
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/customer.jsp");
          rd.include(request,response);
        }
          
            }
            
            }
       
    
    else if(reqType.equals("csignin"))
    {
        
       String email=request.getParameter("email");
       String pass=request.getParameter("password");
       HttpSession sess = request.getSession(false);
       try
       {
        ResultSet rs=DAL.Customerlogin(email, pass);
         if(rs!=null)
            {
                rs.getString("email");
                HttpSession session = request.getSession(true);
                session.setAttribute("id", email);
                session.setAttribute("name", rs.getString("cname") );
                session.setAttribute("gender", rs.getString("gender") );
                session.setAttribute("number",  rs.getString("phonenumber"));
                session.setAttribute("type", "customer");
               
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
         else
         {
              request.setAttribute("type", "customer");
               request.setAttribute("ErrorMsg", "Username or password is incorrect");
               request.getRequestDispatcher("login.jsp").include(request, response);
         }
       }
       catch(Exception e)
               {
               System.out.println(e.getMessage());
               }
               request.setAttribute("type", "customer");
               request.setAttribute("ErrorMsg", "Username or password is incorrect");
               request.getRequestDispatcher("login.jsp").forward(request, response);
      
    }
      
    else if(reqType.equals("asignup"))
    {
      
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String pass=request.getParameter("password");
        String cPass=request.getParameter("cpassword");
        String cat=request.getParameter("category");
        String number=request.getParameter("number");
        String location=request.getParameter("location");
         if(pass.length() < 5)
         {
         request.setAttribute("msg","bad");
         request.getRequestDispatcher("agency.jsp").forward(request, response);                
         }
         if(DAL.validAgency(email)==false)
            { 
       if( DAL.Agencysignup(email, pass, name, number, location, cat))
       {  
             HttpSession session = request.getSession(true);
             session.setAttribute("id", email);
             session.setAttribute("name", name);
             session.setAttribute("number", number);
             session.setAttribute("location", location);
             session.setAttribute("category", cat);  
             session.setAttribute("type", "agency");
             response.sendRedirect("index.jsp");
             RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
             rd.include(request,response);
        }
        else
        {
          RequestDispatcher rd = getServletContext().getRequestDispatcher("/agency.jsp");
          rd.include(request,response);
        }
            }
         else
         {
          request.setAttribute("msg", "U");
           request.getRequestDispatcher("agency.jsp").forward(request, response);
         }   
       
    } 
 

    
    else if(reqType.equals("asignin"))
    {
        
       String email=request.getParameter("email");
       String pass=request.getParameter("password");
       String type=request.getParameter("type");

       try
       {
        ResultSet rs=DAL.Agencylogin(email, pass);
         if(rs!=null)
            {
            
                HttpSession session = request.getSession(true);
                session.setAttribute("id", email);
                session.setAttribute("name", rs.getString("aname") );
                session.setAttribute("location", rs.getString("location") );
                session.setAttribute("number",  rs.getString("phonenumber"));
                session.setAttribute("category",  rs.getString("star"));
                session.setAttribute("services", rs.getString("services") );
                session.setAttribute("stay", rs.getString("stay") );
                session.setAttribute("package",  rs.getString("package"));
                session.setAttribute("distance",  rs.getString("distance"));
                session.setAttribute("pic",rs.getString("path"));
                session.setAttribute("type", "agency");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
       }
       catch(Exception e)
               {
                    System.out.println(e.getMessage());
               }
                request.setAttribute("type", "resort");
                request.setAttribute("ErrorMsg", "Username or password is incorrect");
                request.getRequestDispatcher("login.jsp").include(request, response);

           }

     else if(reqType.equals("c_update"))
    {
        HttpSession session=request.getSession(false);
        if(session!=null)
        {
        String e=(String)session.getAttribute("id");
       
       if( DAL.customerUpdate(request.getParameter("email"), request.getParameter("name"), request.getParameter("number"), request.getParameter("gender"),e))
       {
               
                session.setAttribute("id", request.getParameter("email"));
                session.setAttribute("name", request.getParameter("name"));
                session.setAttribute("gender", request.getParameter("gender") );
                session.setAttribute("number",  request.getParameter("number"));
           request.getRequestDispatcher("c_profile.jsp").forward(request, response); 
       }
       else
       request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    
    }
    
    else if(reqType.equals("a_update"))
            
    {
       HttpSession session=request.getSession(false);
       String e=(String)session.getAttribute("id");
       if( DAL.agencyUpdate(request.getParameter("email"), request.getParameter("name"), request.getParameter("number"), request.getParameter("location"),request.getParameter("category"), request.getParameter("services"), request.getParameter("stay"), request.getParameter("distance"), request.getParameter("package"),e))
       {
                
                session.setAttribute("id", request.getParameter("email"));
                session.setAttribute("name", request.getParameter("name"));
                session.setAttribute("location", request.getParameter("location") );
                session.setAttribute("category", request.getParameter("category") );
                session.setAttribute("number",  request.getParameter("number"));
                 session.setAttribute("services", request.getParameter("services"));
                session.setAttribute("stay", request.getParameter("stay") );
                session.setAttribute("distance", request.getParameter("distance") );
                session.setAttribute("package",  request.getParameter("package"));
                request.getRequestDispatcher("a_profile.jsp").forward(request, response); 
       }
       else
       request.getRequestDispatcher("index.jsp").forward(request, response);
    
    }
    
    else if(reqType.equals("add"))
    {
      
        String s=request.getParameter("details");
        String distance=request.getParameter("distance");
        String stay=request.getParameter("stay");
        String p=request.getParameter("package");
        HttpSession session = request.getSession(false);
        String e=(String)session.getAttribute("id");
        
       if( DAL.AddInfo(e,s,distance, stay, p))
       {  
            session.setAttribute("services", s );
            session.setAttribute("stay", stay );
            session.setAttribute("package",  p);
            session.setAttribute("distance",  distance);
             RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
             rd.include(request,response);
        }
      
    }
    
     else if(reqType.equals("r_upload"))
    {
        // gets absolute path of the web application
        String appPath = request.getServletContext().getRealPath("");
      
        String savePath = appPath + File.separator + SAVE_DIR;
      
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
         
        for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            part.write(savePath + File.separator + fileName);
            HttpSession sess=request.getSession(false);
            sess.setAttribute("pic","resort/"+fileName);
            DAL.upload_resort(fileName,(String)sess.getAttribute("id"));  
            request.setAttribute("msg","done");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/addInfo.jsp");
            rd.include(request,response);
        }

    }
     
      else if(reqType.equals("a_upload"))
    {
        // gets absolute path of the web application
        String appPath = request.getServletContext().getRealPath("");
      
        String savePath = appPath + File.separator +"gallery";
      
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
         
        for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            part.write(savePath + File.separator + fileName);
            DAL.upload_pic(fileName);  
            request.setAttribute("msg","done");
            HttpSession sess=request.getSession(false);
            sess.setAttribute("type","photo");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
            rd.include(request,response);
        }

    }
        else if(reqType.equals("t_upload"))
    {
        // gets absolute path of the web application
        String appPath = request.getServletContext().getRealPath("");
      
        String savePath = appPath + File.separator +"gallery";
      
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
         
        for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            part.write(savePath + File.separator + fileName);
            DAL.upload_pic(fileName);  
            request.setAttribute("msg","done");
            HttpSession sess=request.getSession(false);
            sess.setAttribute("img",fileName);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/addTour.jsp");
            rd.include(request,response);
        }

    }
     
     else if(reqType.equals("admin"))
     {
      request.setAttribute("type","admin");
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
      rd.include(request,response);
     }
     
     else if(reqType.equals("users"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "users");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
     else if(reqType.equals("r_resorts"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "resort");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
     else if(reqType.equals("photo"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "photo");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
       else if(reqType.equals("r_del"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "resort");
        String email= request.getParameter("email");
        if( DAL.deleteAgency(email))
          {
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
          }
        
     }
       
        else if(reqType.equals("u_del"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "users");
        String email= request.getParameter("email");
        if( DAL.deleteUser(email))
          {
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
          }
        
     }
       
      else if(reqType.equals("t_del"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "tour");
        String place= request.getParameter("place");
       if( DAL.deleteTour(place))
          {
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
          }
        
     }
     
       else if(reqType.equals("p_del"))
     {
        HttpSession sess=request.getSession(false);
        sess.setAttribute("type", "photo");
        String pic= request.getParameter("pic");
        if( DAL.deletePicture(pic))
          {
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
          }
        
     }
       
     else if(reqType.equals("tour"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "tour");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
     
     else if(reqType.equals("bookings"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "bookings");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
     else if(reqType.equals("addPic"))
     {
         HttpSession sess=request.getSession(false);
         sess.setAttribute("type", "addPhoto");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.include(request,response);
     }
     
     else if(reqType.equals("aLogin"))
     {
        if(request.getParameter("email").equals("admin@gmail.com") && request.getParameter("pass").equals("12345"))
        {
         HttpSession sess=request.getSession(true);
         sess.setAttribute("admin", "RAFIA");
         RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
         rd.forward(request,response);
        }
        else
        {
            request.setAttribute("type", "admin");
            request.setAttribute("ErrorMsg", "Username or password is incorrect");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
     }
    
    
     else if(reqType.equals("book"))
     {
        
         request.setAttribute("place", request.getParameter("place"));
         request.getRequestDispatcher("book.jsp").forward(request, response);
         
     }
    
     else if(reqType.equals("booking"))
     {
         
        HttpSession sess=request.getSession(false);
        String place=(String)sess.getAttribute("place");
        String date= request.getParameter("date");
        String name= request.getParameter("name");
        String number= request.getParameter("number");
        String days= request.getParameter("days");
        String payment= request.getParameter("pay");
        if(DAL.book(date, name, number, payment, days, place))
        {
            request.getRequestDispatcher("message.jsp").forward(request, response);
        }
         
     }
    
     else if(reqType.equals("tourAdd"))
    {
      
        String place=request.getParameter("place");
        String title=request.getParameter("title");
        String description=request.getParameter("description");
        String highlights=request.getParameter("highlights");
        HttpSession session = request.getSession(false);
        String path="images/"+(String)session.getAttribute("img");
             
       if( DAL.addTour(place,title,description,highlights,path))
       {  
             RequestDispatcher rd = getServletContext().getRequestDispatcher("/admin.jsp");
             rd.include(request,response);
        }
      
    }
    
    
    
  }
  
     private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
     
     
     
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
    }

     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
    }

 
 
}
