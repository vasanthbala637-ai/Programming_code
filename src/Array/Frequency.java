package Array;

import java.util.LinkedHashMap;

public class Frequency {
	/* WAJP TO COUNT THE FREQUENCY OF EACH ELEMENTS IN ARRAY*/
	public static void main(String[] args) {
		int [] arr= {1,2,3,1,1,2,3,3,4,5,5,6,7,9,8,8};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		System.out.println(map);
	}
}
