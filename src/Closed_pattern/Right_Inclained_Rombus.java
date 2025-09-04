package Closed_pattern;

public class Right_Inclained_Rombus 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
