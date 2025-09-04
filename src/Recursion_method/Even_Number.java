package Recursion_method;
public class Even_Number 
{
//	public void even(int n)
//	{
//		if(n==0)
//		{
//			return;
//		}
//		else 
//		{
//			even(n-1);
//			if(n%2==0)
//			{
//				System.out.println(n);
//			}
//		}
//	}
//	public static void main(String[] args)
//	{
//		Even_Number e=new Even_Number();
//		e.even(3);
//	}
	public void even(int n,int e)
	{
		if(n>e)
		{
			return;
		}
		else 
		{
			System.out.println(n);
			even(n+2,e);
		}
	}
	public static void main(String[] args)
	{
		Even_Number e=new Even_Number();
		e.even(2,20);
	}
}
