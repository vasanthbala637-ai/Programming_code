package Recursion_method;

public class Divisible 
{
	public static void main(String[] args) 
	{
		Divisible d=new Divisible();
		d.div(100);
		
	}
	public void div(int n) 
	{
		if(n==0)
		{
			return ;
		}
		else 
		{
				div(n-5);
				if((n%9)==0)
				{
				System.out.println(n);
				}
		}
	}
}
