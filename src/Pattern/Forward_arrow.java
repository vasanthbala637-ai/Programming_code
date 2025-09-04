package Pattern;

public class Forward_arrow 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=8;j++)
			{
				if(i==4 || j-i==4 || i+j==12)
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
