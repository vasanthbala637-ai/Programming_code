package Array;

public class Swap_1st_Last 
{
	// WAJP TO SWAP 1ST AND LAST INDEX ELEMENTS OF THE ARRAY?
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println("AFTER SWAP 1ST AND LAST INDEX : ");
		for(int j: arr)
		{
			System.out.print(j+" ");
		}
	}
}
