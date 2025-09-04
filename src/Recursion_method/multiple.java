package Recursion_method;

public class multiple
{
	public static void main(String[] args) 
	{
		multiple m= new multiple();
		m.multiple(10);
	}
	public void multiple(int n) 
	{
		if(n==0)
		{
			return;
		}
		else
		{
			multiple(n-1);
			if(n%7==0)
			{
				System.out.println(n);
			}
		}
			
	}
}
