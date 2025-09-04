package Array;

public class Missing_Elements 
{
	/* WAJP TO FIND MISSING ELEMENTS OF AN ARRAY?
	 * ALGORITHM TO FIND MISSING ELEMENTS OF AN ARRAY
	 * 			STEP 1 : CALCULATED THE EXPECTED SUM BY USING BELOW MATHEMATICAL FORMULA
	 * 										N=N*(N+1)/2
	 * 			STEP 2 : CALCULATED THE ACTUAL SUM OF THE ARRAY BY USING BELOW GIVEN FORMULA
	 * 										SUM=SUM+ARRAYELEMENTS
	 * 			STEP 3 : SUBTRACT EXPECTED SUM - ACTUAL SUM TO GET MISSING ELEMENT
	 */
	
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int n=6;
		int expectedsum=n*(n+1)/2;
		int actualsum=0;
		for(int i: arr) {
			actualsum+=i;
		}
		int missing=expectedsum-actualsum;
		System.out.println("MISSING ELEMENT : "+missing);
	}
}
