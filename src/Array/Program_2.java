/* WAJP TO PRINT FIRST,LAST AND MIDDLE ELEMENT OF AN ARRAY*/
package Array;

public class Program_2 
{
	public static void main(String[] args) 
	{
		int []arr= {10,20,30,40,50};
		int first=0;
		int last = arr.length-1;
		int middle=last/2;
		System.out.println("FIRST ELEMENT IS : "+arr[first]);
		System.out.println("MIDDLE ELEMENT IS : "+arr[middle]);
		System.out.println("LAST ELEMENT IS : "+arr[last]);
	}
}
