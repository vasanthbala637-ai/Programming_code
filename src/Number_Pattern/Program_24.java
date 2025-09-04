package Number_Pattern;

public class Program_24
{
	public static void main(String[] args)
	{
		int fib1=0;
		int fib2=1;
		int fib3=fib1+fib2;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;i++)
			{
				System.out.print(fib1+" ");
				fib1=fib2;
				fib2=fib3;
				fib3=fib1+fib2;
			}
		}
	}
}
