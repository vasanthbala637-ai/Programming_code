package Arithmetic_Pattern;

public class Program_3 
{
	public static void main(String[] args) 
	{
		int count=1;
		int val=1;
		int sum=2;
		for(int i=1;i<=20;i++)
		{
			System.out.print(val+" ");
//			count++;
			val=val+sum;
			sum++;
		}
	}
}
