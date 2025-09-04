package String;

import java.util.Arrays;

public class Anagram_or_Not {
	/* WAJP TO CHECK GIVEN TWO STRING'S ARE ANAGRAM OR NOT ? */
	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		if (isAnagram(str1,str2)) {
			System.out.println("THE STRING ARE ANAGRAM");
		} else {
			System.out.println("THE STRING ARE NOT ANAGRAM");
		}
	}
	public static boolean isAnagram(String str1,String str2) {
		str1=str1.replaceAll("//s","").toLowerCase();
		str2=str2.replaceAll("//s","").toLowerCase();
		char [] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		return Arrays.equals(arr1, arr2);
	}
}
