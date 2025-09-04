package Pattern;

public class M_pattern 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i==j || j==1 || i+j==10 || j==9)
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
