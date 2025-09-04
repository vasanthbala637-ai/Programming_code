package Array;

public class Print_Duplicated_Element {
 /* WAJP TO PRINT DUPLICATED ELEMENTS OF AN ARRAY ? */
	public static void main(String[] args) {
		int [] arr= {1,2,3,1,1,2,3,4};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("ARRAY ELEMENTS (DUPLICATED) : ");
		for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) { //logic to print duplicate elements
					System.out.print(arr[i]+" ");
					break;     // avoids reapted elements
				}
			}
		}
	}
}
