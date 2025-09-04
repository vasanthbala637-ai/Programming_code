package Recursion_method;

public class Fibonacii 
{
	static int a=0,b=1;
	public int fib( int n) 
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			return fib(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Fibonacii fib=new Fibonacii();
		fib.fib(5);
	}
}
