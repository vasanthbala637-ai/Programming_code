package Arithmetic_Pattern;

public class Program_2 
{
	public static void main(String[] args) 
	{
		int cube=1;
		for(int i=1;i<=10;i++)
		{
			int series=(cube*cube*cube);
			cube++;
			System.out.println(series+" ");
		}
	}
}
