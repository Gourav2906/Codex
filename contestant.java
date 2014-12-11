package Project;
import java.io.*;

class contestant extends user
{
public contestant()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
do
{
System.out.println("Do you want to register or login.\nPress\n1.To register\n2.To login:");
int ch=Integer.parseInt(br.readLine());
if(ch==1)
{
re();
n=0;
}
else
{
log();
n=1;
}

}while(n==0);
}

public void parti()throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	System.out.print("Do you want to solve practice  question or contest.\nPress\n1.For practice\n2.For contest: ");
	int ch=Integer.parseInt(br.readLine());
	if(ch==1)
	{
	practice obj=new practice();
	obj.show1();
	}
	else if(ch==2)
	{
    contest obj1=new contest();
    obj1.show();
	
}	
}
}
