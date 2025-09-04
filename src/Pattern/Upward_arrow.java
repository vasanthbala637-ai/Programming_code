package Pattern;

public class Upward_arrow
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=7;j++)
			{
				if(j==4 || j-i==3 || i+j==5)
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
