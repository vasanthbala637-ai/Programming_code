package Number_Pattern;

public class Word_Pattern_2 
{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
