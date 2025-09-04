package Recursion_method;

public class Palindrome 
{
	static int rem=0;
	public static void main(String[] args) 
	{
		Palindrome p1=new Palindrome();
		p1.print(123321);
	}
	public void print(int n) 
	{
		if(n==0)
		{
			return;
		}
		else
		{
			print(n%10);
			rem=rem*10+rem;
			System.out.println(rem);
			print(n/10);
			
		}
	}
}
