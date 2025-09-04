package Array;

public class Pair_of_Elements {
	/* WAJP TO FIND ALL PAIRS WHOSE SUM EQUALS TO A GIVEN VALUE ? */
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6,7};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			int target=10;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					System.out.println("PAIR : ("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
}
