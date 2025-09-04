package Recursion_method;

public class Sum_Even 
{
	public int even(int n)
	{ 
		if(n==0)
		{
			return 0;
		}
		else 
		{
			if(n%2==0)
			{
				return n+even(n-2);
			}
			else
			{
				return even(n-1);
			}
		}
	}
	public static void main(String[] args)
	{
		Sum_Even s=new Sum_Even();
		System.out.println(s.even(5));
	}
}
