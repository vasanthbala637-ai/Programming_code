/* WAJP TO CREATE A METHOD PRINT 1 TO N NUMBER BY USING RECURSION ? */
package Recursion_method;
public class Case1 
{
	public void print1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Case1 c1=new Case1();
		c1.print1(10);
	}
}
