/* 	WAJP TRAVERSE EVEN AND ODD ELEMENTS OF AN ARRAY SEPARATELY IN APPROPRIATE MANNER */
package Array;

public class Even_Odd 
{
	public static void main(String[] args) 
	{
		int []arr= {10,3,1,2,8};
		//Even number
		System.out.print("EVEN NUMBER : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		//Odd number
		System.out.print("ODD NUMBER : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
