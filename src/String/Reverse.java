package String;

import java.util.Scanner;

public class Reverse {
	/* WAJP TO REVERSE THE STRING
	 * 		NOTE: ITERATE OPP FROM LAST INDEX -------> SIZE-1/LENGTH()-1 
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTERE A STRING ELEMENTS : ");
		String s=scn.nextLine();
		System.out.println("GIVEN STRING : "+s);
		System.out.print("GIVEN STRING IN REVERSE ORDER : ");
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
