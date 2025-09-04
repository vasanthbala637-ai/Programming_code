package Looping_Pattern;

import java.util.Scanner;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter Start value : ");
		int s=scn.nextInt();
		System.out.print("enter End value : ");
		int n=scn.nextInt();
		int rem=0;
		int rev=0;
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
					System.out.println(i+" is a palindrome number");
				}
		}
	}
}
