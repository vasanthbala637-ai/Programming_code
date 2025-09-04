package Method_Program;
import java.util.Scanner;
// WAJP to create an method with returing value to check given number is even or odd
public class Program_1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int num1=scn.nextInt();
		Program_1 p1=new Program_1();
		System.out.println(p1.number(num1));
	}
	public boolean number(int num1)
	{
		if(num1%2==0)
		{
			System.out.println(num1+" IS A EVEN NUMBER");
		}
		else
		{
			System.out.println(num1+" IS A ODD NUMBER");
		}
		return true;
	}
}
