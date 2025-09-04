package Arithmetic_Pattern;

import java.util.LinkedHashSet;

public class Combine_Two_Array {
	/* WAJP TO COMBINE/MERGE TWO ARRAYS WITHOUT DUPLICATE ELEMENTS ? 
	 * 		ALGORITHM TO COMBINE/MERGE TWO ARRAYS WITHOUT DUPLICATE ELEMENTS
	 * 						STEP 1 : PRINT ARRAY 1 ELEMENTS
	 * 						STEP 2 : PRINT ARRAY 2 ELEMENTS WHICH ARE NOT PRESENT IN ARRAY 1 BY COMPARING EACH OTHERS
	 */
	
	public static void main(String[] args) {
		int [] arr1= {1,2,4,5};
		int [] arr2= {2,3,5,7};
//		LOGIC 1 : WITHOUT USING SET ? 
//		System.out.println("COMBINE : ");
//		for(int i : arr1) {
//			System.out.print(i+" "); // 1,2,4,5
//		}
//		/* print array 2 elements which are not present in array 1 */
//		for (int i = 0; i < arr2.length; i++) {
//			boolean isFound=false;
//			for (int j = 0; j < arr1.length; j++) {
//				if(arr2[i]==arr1[j]) {
//					isFound=true;
//					break;
//				}
//			}
//			if (!isFound) {
//				System.out.print(arr2[i]+" ");
//			}
//		}
//		LOGIC 2 : WITH USING SET ? 
		System.out.println("ARRAY 1 ELEMENTS : ");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("ARRAY 2 ELEMENTS : ");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i : arr1) {
			set.add(i);
		}
		for (int i : arr2) {
			set.add(i);
		}
		System.out.println(set);
	}
}
