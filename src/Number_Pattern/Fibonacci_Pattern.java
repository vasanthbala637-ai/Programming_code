package Number_Pattern;

public class Fibonacci_Pattern
{
	public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=1;
		int fib3=fib1+fib2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				fib1=fib2;
				System.out.print(fib1+" ");		
				fib2=fib3;
				fib3=fib1+fib2;
			}
			System.out.println();
		}
	}
}
