package Project;
import java.io.*;
import java.sql.*;

import Basic.connect;

public class Imp {
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	
		int t=0;
	//	notepad n=new notepad();
	//  n.not("sahs");
		k cn=new k();
	   cn.con();
	   System.out.println("Are you a Contestant or Admin.\nPress\n1.For Contestant\n2.For Admin:");
	   int cha=Integer.parseInt(br.readLine());
	   if(cha==1)
	   {   
		   @SuppressWarnings("unused")
		contestant r=new contestant();
		   r.parti();
	   
	   }
	   else
	   {
	       @SuppressWarnings("unused")
		admin a=new admin();
	   }
	
	}
	

}
