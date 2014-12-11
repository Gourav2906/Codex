package Project;
import java.io.*;
//import java.util.*;
 
class notepad {
  public void not(String d) {
    Runtime rs = Runtime.getRuntime();
 
    try {
 
  
    	String a=d;
    	String s="gedit "+a+"";
    	String r="./a.out";
    	Process p= Runtime.getRuntime().exec(s);
        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream())); 
         while ((line = input.readLine()) != null) { 
                //<-- Parse data here. 
                 System.out.println(line);
          }
         System.out.println(p.exitValue());
          p.destroy();
          input.close();
    
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
  
  public void run(String n)throws IOException
  {
	   
	  try {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
	    //String s="gcc "+n+"";
		String s6="gedit "+n+"";  
    	Process pj2= Runtime.getRuntime().exec(s6); 
		String s="javac "+n+""; 	
		//pj2.destroy();	
		Process pj= Runtime.getRuntime().exec(s);
	  System.out.println("You will have to enter username again for security reasons");
	  System.out.print("Enter username:");
	  String s2=br.readLine();
	  System.out.println("Enter password:");
	  String s1=br.readLine();
	    	
	   	pj.waitFor();
	   if(pj.exitValue()!=0) 	
	   {
		   k cno=new k();
			cno.con();
			   cno.score(s2,s1,-1);	
	     pj.destroy();
	   }
	   
	   else
	   {    pj.destroy(); 
		   String s3="";
		   //String r="./a.out";
	    	for(int i=0;i<n.length();++i)
	    	{
	    		if(n.charAt(i)=='.')
	    			s3=n.substring(0,i);
	    	}
	    	String s4="sd";
	    	String r="java "+s3+" "+s4+" ";
		   System.out.println(r);
	    	Process p= Runtime.getRuntime().exec(r);
	        String line;
	        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream())); 
	         while ((line = input.readLine()) != null) { 
	                //<-- Parse data here. 

	                 	  
	        	 //System.out.println(line);
	               if(s4.compareTo(line)==0)
	               {  	 
	             	   k cno=new k();
	   		               cno.con();
	   			           cno.score(s2,s1,10);
	               }
	          	   	
	         }
	         //System.out.println(p.exitValue());
	         p.destroy();
	          input.close();
	   }
	    }
	    catch (IOException | InterruptedException e) {
	      System.out.println(e);
	    }   
	  
  }
  
}
