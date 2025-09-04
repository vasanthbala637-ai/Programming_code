package Looping_Pattern;

import java.util.Scanner;

public class Factorial_num 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter n value : ");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("factorial of "+i+" = "+fact);
		}	
	}
}
