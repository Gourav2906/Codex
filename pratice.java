package Project;
import java.io.*;

public class practice implements question
{
	public void addquestion()throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter the path of the question:");
	String s=br.readLine();
	System.out.print("Enter the output of question");
	String s1=br.readLine();
	k cno=new k();
	cno.con();
	cno.que(s,s1);

	}
	
	public void show1()throws IOException
	{
        
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		k cno=new k();
		cno.con();
		cno.display();
		System.out.print("Enter question name");
		String j=br.readLine();
		System.out.print("Press\n1.To view ProblemStatement\n2.To write code:");
		int ch=Integer.parseInt(br.readLine());
		if(ch==1)
		{
			notepad n=new notepad();
			n.not(j);
		}
		else
		{
			notepad n=new notepad();
			//String k=j+".c";
	        String k=j+".java";
			//	n.not(k);
			n.run(k);
			
		}
	}
	
	
}
