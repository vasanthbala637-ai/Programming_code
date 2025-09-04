/* WAJP TO CREATE A METHOD PRINT 1 TO N NUMBER IN REVERSE ORDER BY USING RECURSION ? */
package Recursion_method;

public class Way2 
{
	public int case2(int n) 
	{
		if(n==0)
		{
			return 0;
		}
		else 
		{
			System.out.println(n);
			case2(n-1);
			return n;
		}
	}
	public static void main(String[] args)
	{
		Way2 w2=new Way2();
		w2.case2(5);
	}
}