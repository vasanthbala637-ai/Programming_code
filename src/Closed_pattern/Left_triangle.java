package Closed_pattern;
public class Left_triangle 
{
	public static void main(String[] args)
	{
		/*logic 1*/
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				if (j<=i)
//				{
//					System.out.print("* ");
//				} 
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
