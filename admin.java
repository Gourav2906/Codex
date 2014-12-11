package Project;
import java.io.*;
class admin extends user
{
	public void ask()throws IOException
	{
	
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	System.out.print("Do you want to add question to practice or contest.\nPress\n1.To add to practice\n2.To add to contest: ");
	int ch=Integer.parseInt(br.readLine());
	if(ch==1)
	{
	practice obj=new practice();
	obj.addquestion();
	
	}
	else if(ch==2)
	{
    contest obj1=new contest();
	obj1.addquestion();
	}
	}
	
	
	
	
	public admin()throws IOException
 {
   logs();
   ask();
   
 }
}
