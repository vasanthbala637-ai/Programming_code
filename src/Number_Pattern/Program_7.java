package Number_Pattern;

public class Program_7 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}
