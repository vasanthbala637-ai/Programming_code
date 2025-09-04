package Number_Pattern;

public class Prime_Number_Pattern 
{
	public static void main(String[] args) 
	{
		       
//		        int num = 2;
//		        int printed = 0;
//
//		        for (int i = 1; i <=3; i++) 
//		        {
//		            for (int j = 1; j <=5; )
//		            {
//		                boolean isPrime = true;
//		                if (num < 2)
//		                {
//		                    isPrime = false;
//		                }
//		                else 
//		                {
//		                    for (int k = 2; k <= num / 2; k++)
//		                    {
//		                        if (num % k == 0) 
//		                        {
//		                            isPrime = false;
//		                            break;
//		                        }
//		                    }
//		                }
//		                if (isPrime)
//		                {
//		                    System.out.print(num + " ");
//		                    j++; // move to next column only if a prime is printed
//		                }
//		                num++;
//		            }
//		            System.out.println();
//		       }
//	}
		
		int val=1;
		int count=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				for(int num=1;num<=val;num++)
					while(num%val==0)
					{
						count++;
						if (count==2) 
						{
							System.out.print(count+" ");
						} 
						else 
						{
							System.out.print("");
						}
						val++;
					}
			}	
			System.out.println();
		}
	}
}

