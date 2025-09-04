package Array;

public class Swap_Min_Max {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 1, 3 };
		System.out.println("ARRAY ELEMENTS : ");
		for (int l : arr) {
			System.out.print(l + " ");
		}
		System.out.println();
		int min = arr[0];
		int max = arr[0];
		int minindex = 0;
		int maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[minindex]) {
				minindex = i;
			}
			if (arr[i] > arr[maxindex]) {
				maxindex = i;
			}
		}
		System.out.println("MIN INDEX : " + minindex);
		System.out.println("MAX INDEX  : " + maxindex);
		int temp = arr[minindex];
		arr[minindex] = arr[maxindex];
		arr[maxindex] = temp;
		System.out.println("AFTER SWAP : ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
