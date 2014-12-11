package Project;
import java.io.*;

public class contest implements question
{
	public void addquestion()throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter the path of the question:");
	String s=br.readLine();
	k cno=new k();
	cno.con();
	cno.que1(s);

	}
	
	public void show()throws IOException
	{
		
	 	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		k cno=new k();
		cno.con();
		cno.disp();
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
			String k=j+".c";
			n.not(k);
		}
	}
}
