package Number_Pattern;

public class Program_15 
{
	public static void main(String[] args) 
	{
		int num=20;
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(num<=9)
				{
					System.out.print("0"+num+" ");
				}
				else
				{
					System.out.print(num+" ");
				}
				num--;
			}
			System.out.println();
		}
	}
}
