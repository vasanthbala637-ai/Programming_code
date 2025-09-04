package Number_Pattern;

public class Program_2
{
	public static void main(String[] args)
	{

		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+count+"  ");
				count=count+2;
			}
			System.out.println();
		}
	}
}
