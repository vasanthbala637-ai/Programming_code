package String;

import java.util.Scanner;

public class Reverse_word_Char {
	private static final int i = 0;

	/* WAJP TO REVERSE A EACH WORD OF AN STRING WITHOUT CHANING THE PLACE/ORDER OF AN WORD?
	 * 	INPUT: HELLO JAVA
	 * 	OUTPUT: JAVA HELLO
	 * 			NOTE : CONVERT STRING INTO STRING TYOE IF ARRAY
	 * 			       ITERATE STRING ARRAY FROM 0TH INDEX
	 * 				   EACH ITERATION INDIVIDULLY REVERSE A GIVEN STRING TYPE OF ARRAY
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str=scn.nextLine();
		System.out.println("GIVEN STRING : "+ str);
		String result="";
		String [] word = str.split("\\s"); // converting string into string type of array
		System.out.print("GIVEN STRING IN REVERSE ORDER : ");
		for(String words:word)
		{
			String rev=" "; 
			for(int i=words.length()-1;i>=0;i--)
			{
				rev=rev+words.charAt(i);
			}
			result=result+rev;
		}
		System.out.println(result);
	}
}
