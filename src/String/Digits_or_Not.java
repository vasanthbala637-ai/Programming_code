package String;

public class Digits_or_Not {
	/* WAJP TO CHECK GIVEN STRING CONTAINS DIGITS OR NOT ? */
	public static void main(String[] args) {
		String str="12345";
		if(str.matches("[0-9]+")){
			System.out.println("CONTAINS ONLY DIGITS");
		}
		else {
			System.out.println("CONTAINS NON-DIGITS");
		}
	}
}
