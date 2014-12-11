package Project;
import java.io.*;
public class user {
  	String n,p;
		public void re()throws IOException
		{    
			 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter Username\n");
			n=br.readLine();
			System.out.println("Enter Password\n");
			p=br.readLine();
			k cno=new k();
			cno.con();
			   cno.res(n,p);	
		}
		public void log()throws IOException
		{

			 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter Username\n");
			n=br.readLine();
			System.out.println("Enter Password\n");
			p=br.readLine();
			k cno=new k();
			cno.con();
			  int y=cno.log(n,p);
				if(y==1)	 
			  System.out.println("Welcome");
				else
				{ 
					System.out.println("wrong");
				    log();
				}
					
		}
		public void logs()throws IOException
		{

			 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter Username\n");
			n=br.readLine();
			System.out.println("Enter Password\n");
			p=br.readLine();
			k cno=new k();
			cno.con();
			  int y=cno.log(n,p,2);
				if(y==1)	 
			  System.out.println("Welcome");
				else
				{	  System.out.println("Wrong username or password");
				logs();
				}
		}	
		
		
		
	}


