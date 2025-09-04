package Number_Pattern;

public class Program_17
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				count++;
				
				if(count<=4)
				{
					System.out.print("0"+(count*2)+" ");
				}
				else
				{
					System.out.print((count*2)+" ");
				}
			}
			System.out.println();
		}
	}
}
