//WAJP to create a method which return sum of digits of an number
package Method_Program;

import java.util.Scanner;

public class Program_7 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int num = scn.nextInt();
		Program_7 p7= new Program_7();
		System.out.print("SUM OF DIGITS : ");
		System.out.println(p7.print(num));
	}
	public int print(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
}
