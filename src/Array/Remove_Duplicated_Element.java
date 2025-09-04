package Array;

import java.util.LinkedHashSet;

public class Remove_Duplicated_Element {
	/* WAJP TO REMOVE DUPLICATED ELEMENTS OF AN ARRAY ?
	 * ALGORITHM TO REMOVE DUPLICATED ELEMENTS OF AN ARRAY
	 * 			STEP 1 : DECLARE,CREATE AND INITIALIZE INTEGER ARRAY
	 * 			STEP 2 : STORE ELEMENTS OF AN ARRAY INTO LINKEDHASHSET
	 * 			STEP 3 : STORE LINKEDHASHSET ELEMENTS BACK INTO ARRAY BASED ON INDEX
	 * 			STEP 4 : DISPLAY ARRAY
	 * 						NOTE : LINKEDHASHSET DO NOT ALLOW THE DUPLICATED ELEMENTS, SO HERE WE ARE USING LINKEDHASHSET TO REMOVE DUPLICATED ELEMENTS OF AN ARRAY
	 * 							   AND ALSO USED TO MAINTAIN THE INSERTION ORDER
	 */

	public static void main(String[] args) {
		int [] arr= {1,2,3,1,1,2,3,4};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i : arr)
		{
			set.add(i);
		}
		int [] arr1=new int[set.size()];
		int index=0;
		for(int i : set){
			arr1[index++]=i;
		}
		System.out.println("AFTER REMOVING DUPLICAED ELEMENTS : ");
		for(int i : arr1) {
			System.out.print(i+" ");
		}
	}
}
