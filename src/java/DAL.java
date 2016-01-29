import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Nimra Qasim
 */
    public class DAL {
        
    public static ResultSet Customerlogin(String email, String pass)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
			
            String sql;
			
            sql = "SELECT * FROM customerInfo where email='"+email+"' and Password='"+pass+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                return rs;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return rs;
        
    }
     
    public static ResultSet Agencylogin(String email, String pass)
    {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
			
            String sql;
			
            sql = "SELECT * FROM agencyInfo where email='"+email+"' and Password='"+pass+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                return rs;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return rs;
        
    }
       
    
    public static boolean Customersignup(String email, String pass , String name, String number, String gender)
    {
                        Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
                        stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO customerInfo(cname,email,password,gender,phonenumber) Values('"+name+"'),('"+email+"'),('"+pass+"'),('"+gender+"'),('"+number+"')");	
			stmt.close();
                         conn.close();
                          return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
                        return true;
    }    
    
    public static boolean Agencysignup(String email, String pass , String name, String number, String location, String category)
    {
                       Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
                        stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO agencyInfo(aname,email,password,phonenumber,location,star) Values('"+name+"'),('"+email+"'),('"+pass+"'),('"+number+"'),('"+location+"'),('"+category+"')");	
			stmt.close();
                         conn.close();
                          return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
                        }
			
                        return true;
    } 
    
     public static boolean customerUpdate(String email , String name, String number, String gender,String e)
     {
                        Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
                        stmt = conn.createStatement();
			
			String q="UPDATE customerInfo SET cname='"+name+"',email='"+email+"',phonenumber='"+number+"',gender='"+gender+"' WHERE email='"+e+"'";
			stmt.executeUpdate(q);	
			stmt.close();
                        conn.close();
                        return true;
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
                        return false;
     }
     
      public static boolean agencyUpdate(String email , String name, String number, String location,String category,String services,String stay,String distance,String pack,String e)
     {
                        Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
                        stmt = conn.createStatement();
			
			String q="UPDATE agencyInfo SET aname='"+name+"',email='"+email+"',phonenumber='"+number+"',location='"+location+"',star='"+category+"',stay='"+stay+"',services='"+services+"',distance='"+distance+"',package='"+pack+"' WHERE email='"+e+"'";
			stmt.executeUpdate(q);	
			stmt.close();
                        conn.close();
                        return true;
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
                        return false;
     }
     
    public static boolean AddInfo(String email, String s , String d, String stay, String p)
    {
                       Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
                        stmt = conn.createStatement();
			
			String q="UPDATE agencyInfo SET services='"+s+"',distance='"+d+"',stay='"+stay+"',package='"+p+"' WHERE email='"+email+"'";
			stmt.executeUpdate(q);		
			stmt.close();
                         conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
                        }
			
                        return true;
    } 
       
    public static int getResortCount()
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        int count=0;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
			
            String sql;
			
            sql = "SELECT * FROM agencyInfo";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                count++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return count;
        
    }
      
    public static ResultSet getResort(String name)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        int count=0;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
	
            String sql;
			
            sql = "SELECT * FROM agencyInfo where aname='"+name+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                return rs;
             }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
       
     
    public static boolean deleteAgency(String email)
    {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
	
            stmt.executeUpdate("Delete from agencyInfo where email='"+email+"'");

                return true;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return false;
        
    } 
    
     public static boolean deleteUser(String email)
    {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
	
            stmt.executeUpdate("Delete from customerInfo where email='"+email+"'");

                return true;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return false;
        
    } 
    
    public static boolean book(String date, String name , String number, String payment, String days , String place)
    {
                        Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
                        stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO booking(date,place,days,name,number,payment) Values('"+date+"'),('"+place+"'),('"+days+"'),('"+name+"'),('"+number+"'),('"+payment+"')");	
			stmt.close();
                         conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
                        return true;
                        
    }  
    
    public static boolean addTour(String place, String title , String description, String highlights,String path)
    {
                        Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
                        stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO tours(place,title,description,highlights,path) Values('"+place+"'),('"+title+"'),('"+description+"'),('"+highlights+"'),('"+path+"')");	
			stmt.close();
                         conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
                        return true;
                        
    }  
           
    public static boolean deleteTour(String place)
    {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
	
            stmt.executeUpdate("Delete from tours where place='"+place+"'");

                return true;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return false;
        
    }
    
     public static boolean deletePicture(String pic)
    {
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
	
            stmt.executeUpdate("Delete from photo where pics='"+pic+"'");

                return true;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return false;
        
    }
        
    public static boolean validLogin(String email)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
            
            stmt = conn.createStatement();
			
			
            String sql;
			
            sql = "SELECT * FROM customerInfo where email='"+email+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return false;
        
    }
         
    public static boolean validAgency(String email)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
            
            stmt = conn.createStatement();
			
			
            String sql;
			
            sql = "SELECT * FROM agencyInfo where email='"+email+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return false;
        
    }   
    
    public static void upload_resort(String filename,String email)
    {
     Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB1.accdb");
                        stmt = conn.createStatement();
			
			String q="UPDATE agencyInfo SET path='resort/"+filename+"' WHERE email='"+email+"'";
                        
			stmt.executeUpdate(q);	
			stmt.close();
                        conn.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
    }
       public static void upload_pic(String filename)
    {
     Connection conn = null;
			Statement stmt = null;
			try
			{
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");    
                        conn=DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\Nimra Qasim\\Downloads\\myWeb\\src\\java\\myDB.accdb");
                        stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO photo(pics) Values('gallery/"+filename+"')");
                        
			stmt.close();
                        conn.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
    }
    }