package Recursion_method;
public class sum 
{
	public int Sum( int n) 
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+Sum(n-1);
		}
	}
	public static void main(String[] args) 
	{
		sum s1=new sum();
		System.out.println(s1.Sum(3));
	}
}
