/* WAJP to create a method for below task
 1) find a given number is prime or not?
 2) print the prime number between 1 to n? 
 */
package Method_Program;

import java.util.Scanner;

public class Program_2 
{
		public static void main(String[] args) 
		{
			Scanner scn=new Scanner(System.in);
			System.out.print("ENTER A NUMBER : ");
			int num2=scn.nextInt();
			Program_2 p2=new Program_2();
			p2.number(num2);
			p2.print(num2);
		}
		public void number(int num1)
		{
			int count=0;
			for(int i=1;i<=num1;i++)
			{
				if(num1%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("the given number is prime");
			}
			else
			{
				System.out.println("the given number is not prime");
			}
		}
		public void print(int num1)
		{
			for(int i=1;i<=num1;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i);
				}
			}
		}
}
