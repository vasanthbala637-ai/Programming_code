package Looping_Pattern;

import java.util.Scanner;

public class Perfect_Number 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
//		System.out.print("ENTER START VALUE : ");
//		int n=scn.nextInt();
		System.out.print("ENTER END VALUE : ");
		int e=scn.nextInt();
		for(int i=1;i<=e;i++)
		{
			int sum=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i+" is a perfect number");
			}
		}
	}
}
