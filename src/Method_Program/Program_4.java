// WAJP to create a method to display even negative number from -1 t0 -10?
package Method_Program;
public class Program_4
{
	public static void main(String[] args) 
	{
		Program_4 p4=new Program_4();
		p4.print();
	}
	public void print()
	{
		for(int i=-1;i>=-10;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
