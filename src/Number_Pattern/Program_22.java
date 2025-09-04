package Number_Pattern;

public class Program_22
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				count++;
				System.out.print((count*count*count)+" ");
			}
			System.out.println();
		}
	}
}
