package Number_Pattern;

public class Word_Pattern_3
{
	public static void main(String[] args) 
	{
		char ch='A';
		int count=0;
		for(int i=1;i<=5;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if (i%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					count++;
					System.out.print(count+" ");
				}
			}
			System.out.println();
		}
	}
}
