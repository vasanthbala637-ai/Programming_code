package Closed_pattern;

public class A_4 
{
	public static void main(String[] args) 
	{
//		for(int i=1;i<=4;i++)
//		{
//			for(int k=1;k<i;k++)
//			{
//				System.out.print("   ");
//			}
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print("*  ");
//			}
//			
//			System.out.println();
//		}
//		for(int i=2;i<=4;i++)
//		{
//			for(int j=3;j>=i;j--)
//			{
//				System.out.print("   ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
//		----------------------------------------------------------------
		for(int i=1;i<=7;i++)
		{
			for(int k=1;k<=4;k++)
			{
				if(k<i && i<=4) 
				{
					System.out.print("    ");
				}
				else if (k<=3 && i==5) 
				{
					System.out.print("  ");
				}
				else if (k<=2 && i==6) 
				{
					System.out.print("  ");
				}
				else if (k<1 && i==7) 
				{
					System.out.print("  ");
				}
				else 
				{
					System.out.print("");
				}
			}
			for(int j=4;j>=1;j--)
			{
				if (j>=i && i<=4) 
				{
					System.out.print("*   ");
				} 
				else if(j>=3 && i==5)
				{
					System.out.print("  * ");
				}
				else if(j>=2 && i==6)
				{
					System.out.print("*   ");
				}
				else if(j>=1 && i==7)
				{
					System.out.print("*   ");
				}
				else 
				{
					System.out.print("");
				}
			}
			
			System.out.println();
		}
	}
}
