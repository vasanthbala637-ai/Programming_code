// WAJP TO CREATE AN INTEGER ARRAY TO TRAVERSE ELEMENTS IN DESCENDING ORDER
package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Descending_Order 
{
	// WAY 1: SELECTION SORT: FIND THE MINIMUM IN THE UNSORTED PATH AND SWAP IT WITH THE FIRST UNSORTED ELEMENT
	 /* public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE SIZE : ");
		int size=scn.nextInt();
		int [] arr=new int [size];
		System.out.println("ENTER THE ELEMENT : ");
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("ARRAY ELEMENTS (UNSORTED ARRAY) : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("ARRAY ELEMENTS (SORTED ARRAY) : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	} */
	
	//WAY 2: BUBBLE SORT:
	
	/* public static void main(String[] args) {
		int [] arr= {2,5,3,1,4};
		System.out.println("ARRAY ELEMENT (UNSORTED ARRAY) : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("ARRAY ELEMENTS (SORTED ARRAY) : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	} */
	
	// WAY 3 : BY USING ARRAY.SORT(): [not recommended]
	
	public static void main(String[] args) 
	{
		Integer [] arr= {2,5,3,1,4};
		System.out.println("ARRAY ELEMENT (UNSORTED ARRAY) : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("ARRAY ELEMENTS (SORTED ARRAY) : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}	
}