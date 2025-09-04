package Array;

import java.util.LinkedHashMap;

public class Even_Number_Frequency {
/*	WAJP TO PRINT EVEN NUMBER FREQUENCY IN ARRAY ? */
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,1,2,3,5,7,3,5,8,5,2,1,4,3,2,6,1};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]%2==0) {
					map.put(arr[j],map.getOrDefault(arr[j],0)+1);
				}
		}
		System.out.print("FREQUENCY OF EVEN NUMBER : ");
		System.out.println(map);
		}
	}
