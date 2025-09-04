package Number_Pattern;

public class Word_Pattern_1 
{
	public static void main(String[] args) 
	{
		char A='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(A+" ");
			}
			System.out.println();
			A++;
		}
	}
}
