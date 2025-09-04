/* 	WAJP TRAVERSE EVEN INDEX AND ODD INDEX OF AN ARRAY SEPARATELY IN APPROPRIATE MANNER */
package Array;
public class Program_1 
{
	public static void main(String[] args) 
	{
		int []arr= {10,3,1,2,8};
		//Even number
		System.out.print("EVEN NUMBER : ");
		for(int i=2;i<arr.length;i=i+2)
		{
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Odd number
		System.out.print("ODD NUMBER : ");
		for(int i=1;i<arr.length;i=i+2)
		{
				System.out.print(arr[i]+" ");
		}
	}
}
