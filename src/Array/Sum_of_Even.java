/* WAJP TO PRINT SUM OF EVEN NUMBERS WHICH ARE DIVISIBLE BY 4 ? */
package Array;
public class Sum_of_Even 
{
	public static void main(String[] args) 
	{
		int []a= {10,3,5,8,1,7,12,40};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0 && a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("sum of even and divisible by 4 is : "+ sum);
	}
}
