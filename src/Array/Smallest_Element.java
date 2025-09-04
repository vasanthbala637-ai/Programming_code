package Array;

public class Smallest_Element 
{
	/* PROGRAM 1: WAJP TO DISPLAY SMALLEST ELEMENT OF AN ARRAY ?
	 * ALGORTHIM TO FIND/DISPLAY LARGEST ELEMENTS OF AN ARRAY
	 * STEP 1: SORT ARRAY  ELEMENTS EITHER IN ASCENDING ORDER/DESCENDING ORDER
	 * 			NOTE: USE EITHER SELECTION SORT/BUBBLE SORT
	 * STEP 2: PRINT THE LARGEST ELEMENT OF AN ARRAY USING INDEX
	 */
	
	public static void main(String[] args) 
	{
		int [] arr= {3,1,5,2,4};
		System.out.println("ARRAY ELEMENTS (UNSORTED ARRAY) : ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int smallest=arr.length-1;
		System.out.println("SMALLEST ARRAY ELEMENT IS : "+arr[smallest]);
	}
}
