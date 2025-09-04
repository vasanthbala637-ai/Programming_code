package Number_Pattern;

public class Pascal_pyramid 
{
	public static void main(String[] args) 
	{
		int num=1;
		for(int i=0;i<=5;i++)
		{
			num=1;
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}
