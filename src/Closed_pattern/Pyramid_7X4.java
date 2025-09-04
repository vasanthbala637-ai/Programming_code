package Closed_pattern;

public class Pyramid_7X4 
{
	public static void main(String[] args) 
	{
//		 for (int i = 1; i <= 4; i++) {
//	            // Print spaces
//	            for (int j = 1; j <= 4 - i; j++) {
//	                System.out.print("  "); // 2 spaces for alignment
//	            }
//
//	            // Print stars
//	            for (int k = 1; k <= (2 * i - 1); k++) {
//	                System.out.print("* ");
//	            }
//
//	            System.out.println();
//	        }
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("  *");
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print("  *");
			}
			System.out.println();
		}
	}
}
