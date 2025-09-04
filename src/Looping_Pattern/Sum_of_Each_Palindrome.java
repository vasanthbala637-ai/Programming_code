package Looping_Pattern;

import java.util.Scanner;

public class Sum_of_Each_Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter Start value : ");
		int s=scn.nextInt();
		System.out.print("enter End value : ");
		int n=scn.nextInt();
		int rem=0;
		int rev=0,sum=0;
		for(int i=s;i<=n;i++)
		{
			int num=i;
			rev=0;
			while(num!=0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(i==rev)
				{
				int  tem=i;
					while(tem!=0)
					{
						int r=tem%10;
						sum+=r;
						tem=tem/10;
					}
					System.out.println(i+" : sum of each palindrome number is = "+sum);
				}
		}
	}
}
