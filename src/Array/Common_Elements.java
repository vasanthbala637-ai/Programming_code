package Array;

public class Common_Elements {
	/* WAJAP TO FIND COMMON ELEMENTS BETWEEN TWO ARRAYS ?
	 * 	ALGORITHM TO FIND COMMON ELEMENTS BETWEEN TWO ARRAY
	 * 				STEP 1 : DECLARE,CREATE AND INITILIZE TWO ARRAY
	 * 				STEP 2 : OUTER LOOP FOR ARRAY 1
	 * 		`		STEP 3 : INNER LOOP FOR ARRAY 2
	 * 				STEP 4 : PROVIDE A CONDITION TO CHECK ARRAY 1 AND ARRAY 2 ELEMENTS SAME OR NOT
	 * 							*) IF THEY ARE SAME THEN PRINT BOTH ARRAY ELEMENTS
	 * 							*) ELSE SKIP THE PRINT BOTH ARRAY ELEMENTS
	 */
	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,10};
		int [] arr2= {5,2,6,7,1};
		System.out.println("COMMON ELEMENTS OF AN ARRAY 1 AND ARRAY 2 : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" "+arr2[j]);
				}
			}
		}
	}
}
