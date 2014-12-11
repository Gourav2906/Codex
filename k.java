package Project;
import Basic.regis;

import java.sql.*; 
class k {
 
    private static final String url = "jdbc:mysql://localhost";
 
    private static final String user = "root";
 
    private static final String password = "test";

    Connection con;
    Statement stmt;
    int result;
    ResultSet rs;
    public void con() {
        try {
             con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
      	   stmt = con.createStatement();
      	String    sql = "use ak";
      	    stmt.executeUpdate(sql);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void res(String a,String b)
    {
    	
	 try{
		
         
	//  stmt = con.createStatement();
    	String    sql = "insert into user values('"+a+"','"+b+"','0')";
	    stmt.executeUpdate(sql);
	 }
	 catch (Exception e) {
         e.printStackTrace();
     }
	 }


    public int log(String a,String b)
    {
    	
	 try{
	
	    stmt = con.createStatement();
	   String    sql = "select COUNT(*) as v from user where name='"+a+"' AND password='"+b+"'"; 
	  
		   rs= stmt.executeQuery(sql);
		   rs.next();
	    int t=rs.getInt("v");
		   return t;
	 }
	 catch (Exception e) {
         e.printStackTrace();
         return 0;
     }
	 }
    public int  log(String a,String b,int t)
    {
    	try{
    	
    		stmt=con.createStatement();
    		String sql="select COUNT(*) as v from admin where name='"+a+"'AND password='"+b+"'";
    		rs=stmt.executeQuery(sql);
    		rs.next();
    	int	p=rs.getInt("v");
    		return p;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		return 0;
    	}
    	}
    
    public void que(String a,String b)
    {
    	
	 try{
		
         
	//  stmt = con.createStatement();
    	String    sql = "insert into question values('"+a+"','"+b+"')";
	    stmt.executeUpdate(sql);
	 }
	 catch (Exception e) {
         e.printStackTrace();
     }
	 }
    public void que1(String a)
    {
    	
	 try{
		
         
	//  stmt = con.createStatement();
    	String    sql = "insert into question2 values('"+a+"')";
	    stmt.executeUpdate(sql);
	 }
	 catch (Exception e) {
         e.printStackTrace();
     }
	 }
       
    public void disp()
    {
    	try{
        	String so;
    		stmt=con.createStatement();
    		String sql="select * from question2 ";
    		rs=stmt.executeQuery(sql);
    		while(rs.next())
    		{
    			so=rs.getString("name");
    		   System.out.println(so);
    		}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }

    public void display()
    {
    	try{
        	String so;
    		stmt=con.createStatement();
    		String sql="select * from question ";
    		rs=stmt.executeQuery(sql);
    		while(rs.next())
    		{
    			so=rs.getString("path");
    		   System.out.println(so);
    		}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }

    public void score(String a,String b,int c)
    {

    	
   	 try{
   		
      	String    sql = "update user set score=score+'"+c+"' where name='"+a+"' AND password='"+b+"'";
   	    stmt.executeUpdate(sql);
   	 }
   	 catch (Exception e) {
            e.printStackTrace();
        }
   	 
    }
    
    
}
    
