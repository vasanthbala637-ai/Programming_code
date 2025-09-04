// WAJP to create a method to display even negative number from -1 t0 -10?
package Method_Program;

public class Program_5 
{
	public static void main(String[] args) 
	{
		Program_5 p5=new Program_5();
		p5.print();
	}
	public void print()
	{
		for(int i=-10;i<=-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
