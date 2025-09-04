/* WAJP to create a method for below task
 1) find a given number is palindrome or not?
 2) print the palindrome number between 1 to n? 
 */
package Method_Program;

import java.util.Scanner;

public class Program_3 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int n=scn.nextInt();
		Program_3 p3=new Program_3();
		p3.check(n);
		p3.print(n);
	}
	public void check(int n)
	{
		int rev=0;
		int copy=n;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (copy==rev)
		{
			System.out.println(copy+" IS A PALINDROME NUMER");
		}
		else
		{
			System.out.println(copy+" IS A  NOT PALINDROME NUMER");
		}
	}
	public void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i>9)
			{
				int num=i;
				int rev=0;
				while(num!=0)
				{
					int rem=num%10;
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
}
