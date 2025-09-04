package Recursion_method;

public class Sum_Odd 
{
//	public int odd(int n)
//	{ 
//		if(n==1)
//		{
//			return 1;
//		}
//		else 
//		{
//			if(n%2!=0)
//			{
//				return n+odd(n-2);
//			}
//			else
//			{
//				return odd(n-1);
//			}
//		}
//	}
//	public static void main(String[] args)
//	{
//		Sum_Odd s1=new Sum_Odd();
//		System.out.println(s1.odd(9));
//	}
	public int evensum(int n) {
		if(n==0) {
			return 0;
		}else {
			return n+evensum(n-2);
		}
	}
	public static void main(String[]args) {
		Sum_Odd s1=new Sum_Odd();
		int n=10;
		System.out.println(s1.evensum(n));
	
	}
}
