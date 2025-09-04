package String;

import java.util.Scanner;

public class Reverse_Word_By_Word_Format {
	/* WAJP TO REVERSE A STRING WORD BY WORD FORMAT ?
	 * 	INPUT: HELLO JAVA
	 * 	OUTPUT: JAVA HELLO
	 * 			NOTE : CONVERT STRING INTO STRING TYOE IF ARRAY
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str=scn.nextLine();
		System.out.println("GIVEN STRING : "+ str);
		String [] word = str.split("\\s"); // converting string into string type of array
		System.out.print("GIVEN STRING IN REVERSE ORDER : ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]+" ");
		}
	}
}
