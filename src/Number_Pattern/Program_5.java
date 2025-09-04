package Number_Pattern;

public class Program_5 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=7;i=i+2)
		{
			for(int j=i;j>=1;j-=2)
			{
				System.out.print(" "+j+"  ");
			}
			System.out.println();
		}
	}
}
