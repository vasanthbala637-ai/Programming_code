package Array;

public class Subset {
	/* WAJP TO CHECK IF THE ARRAY IS SUBSET OF AN ANOTHER ARRAY ? */
	
	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5,6};
		int [] arr2 = {2,4,5};
		boolean isSubset=true;
		for (int i = 0; i < arr2.length; i++) {
			boolean isFound=false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i]==arr1[j]) {
					isFound=true;
					break; // no need to search further
				}
			}
			if (!isFound) {
				isSubset=false;
				break;
			}
		}
		System.out.println("ARRAY 2 IS AN SUBSET OF ARRAY 1 ? : "+isSubset);
	}
}

/* note :in above program,if issubset returns true means we can conclude array 2 is an subset of an array 1 and if issubset returns false means we can conclude array 2 
 * is not asubset of array 1 */
