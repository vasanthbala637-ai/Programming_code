package Looping_Pattern;

public class Neon_Number 
{
	public static void main(String[] args) 
	{
		int num=9;
		int copy=num,rem=0,sum=0;
		num=num*num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(copy==sum)
		{
			System.out.println(copy+" is Neon Number");
		}
		else
		{
			System.out.println(copy+" is Not Neon Number");
		}
	}
}