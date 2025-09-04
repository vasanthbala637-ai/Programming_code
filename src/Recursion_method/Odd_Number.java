package Recursion_method;

public class Odd_Number 
{
//	public void odd(int n)
//	{
//		if(n==0)
//		{
//			return;
//		}
//		else 
//		{
//			odd(n-1);
//			if(n%2!=0)
//			{
//				System.out.println(n);
//			}
//		}
//	}
//	public static void main(String[] args)
//	{
//		Odd_Number o=new Odd_Number();
//		o.odd(5);
//	}
	public void odd(int n,int e)
	{
		if(n>e)
		{
			return;
		}
		else 
		{
			System.out.println(n);
			odd(n+2,e);
		}
	}
	public static void main(String[] args)
	{
		Odd_Number o=new Odd_Number();
		o.odd(1,20);
	}
}
