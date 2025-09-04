// WAJP to create a method to display odd negative number from -1 t0 -20 and reverse the order?
package Method_Program;

public class Program_6
{
	public static void main(String[] args) 
	{
		Program_6 p6=new Program_6();
		p6.print();
		System.out.println("---------------------------");
		p6.printR();
	}
	public void print()
	{
		for(int i=-1;i>=-20;i=i-2)
		{
				System.out.println(i);
		}
	}
	public void printR()
	{
		for(int i=-19;i<=-1;i=i+2)
		{
				System.out.println(i);
		}
	}
}
