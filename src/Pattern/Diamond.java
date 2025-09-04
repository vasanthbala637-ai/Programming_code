package Pattern;

public class Diamond 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i-j==2 || i+j==8 || (j-i==2 && i<=3) || (i+j==4 && i<=3))
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
