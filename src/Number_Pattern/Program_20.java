package Number_Pattern;

public class Program_20
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				count++;
				System.out.print((count*4)+" ");
			}
			System.out.println();
		}
	}
}
