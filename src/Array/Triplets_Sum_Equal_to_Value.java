package Array;

public class Triplets_Sum_Equal_to_Value {
/* WAJP TO FIND TRIPLETS WITH SUM EQUALS TO GIVEN VALUE ? */
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int target =9;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
					}
				}
			}
		}
	}
}
