package Number_Pattern;

public class Program_11 
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.print((count*3)+" ");
			}
			System.out.println();
		}
	}
}
