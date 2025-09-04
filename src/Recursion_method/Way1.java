/* WAJP TO CREATE A METHOD PRINT 1 TO N NUMBERIN REVERSE ORDER  BY USING RECURSION ? */
package Recursion_method;
public class Way1 
{
	public static void case1(int n) 
	{
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		case1(10);
	}
}
