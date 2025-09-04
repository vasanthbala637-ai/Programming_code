package Number_Pattern;

public class Pascal_Pattern 
{
	public static void main(String[] args) 
	{
		int num=1;
		for(int i=0;i<=4;i++)
		{
			num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
