package Array;

public class Second_Smallest 
{
	/* PROGRAM 1: WAJP TO DISPLAY 2nd SMALLEST ELEMENT OF AN ARRAY ?
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
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int secondsmallest=arr.length-2;
		System.out.println("SECOND SMALLEST ARRAY ELEMENT IS : "+arr[secondsmallest]);
	}
}
