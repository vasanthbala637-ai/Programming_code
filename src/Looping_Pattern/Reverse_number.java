package Looping_Pattern;

import java.util.Scanner;

public class Reverse_number 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("ENTER START NUMBER : ");
		int S= scn.nextInt();
		System.out.print("ENTER END NUMBER : ");
		int n= scn.nextInt();
		for(int i=S;i<=n;i++)
		{
			if(i>9)
			{
				int rev=0;
				int num=i;
				while(num!=0)
				{
					int rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				System.out.println(i+" reverse is : "+rev);
			}
		}
	}
}
