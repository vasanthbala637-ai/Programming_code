package Array;

import java.util.Arrays;

public class Move_Zeros_to_End {
/* WAJP TO MOVE  ALL ZERO'S AT END ? */
	public static void main(String[] args) {
		int [] arr= {0,1,2,3,0,0,4,5,0,6,7,8,0,9,0};
		int index=0;
		for(int i:arr) {
			if(i!=0) {
				arr[index++]=i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("INDEX : "+index);
		while(index<arr.length) {
			arr[index++]=0;
		}
//		System.out.println("AFTER MOVING ZEROS: "+Arrays.toString(arr));
		System.out.println("AFTER MOVING ZEROS : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
