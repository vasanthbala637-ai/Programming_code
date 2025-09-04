/* WAJP TO CREATE A METHOD PRINT 1 TO N NUMBER BY USING RECURSION ? */
package Recursion_method;
public class case2 
{
	public int printN(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			printN(n-1);
			System.out.println(n);
			return n;
			
		}
	}
	public static void main(String[] args)
	{
		case2 c2=new case2();
		c2.printN(10);
	}
}
