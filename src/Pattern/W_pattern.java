package Pattern;

public class W_pattern 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i+j==6 || j==1 || j-i==4 || j==9)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}