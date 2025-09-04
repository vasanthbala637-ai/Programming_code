package Pattern;

public class left_V 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==j || i+j==10)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
