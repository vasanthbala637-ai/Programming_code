package Number_Pattern;

public class Program_16
{
	public static void main(String[] args) 
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=0;j<4;j++)
			{
				int num = (i+j*5);
					if(num<=9)
					{
						System.out.print("0"+num+" ");
					}
					else
					{
						System.out.print(num+" ");
					}
			}
			System.out.println();
		}
	}
}
