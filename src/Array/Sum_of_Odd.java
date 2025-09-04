/* WAJP TO PRINT SUM OF ODD NUMBERS WHICH ARE DIVISIBLE BY 3 ? */
package Array;

public class Sum_of_Odd 
{
	public static void main(String[] args) 
	{
		int []a= {10,3,5,8,15,7,12,40};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0 && a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("sum of odd and divisible by 3 is : "+ sum);
	}
}
