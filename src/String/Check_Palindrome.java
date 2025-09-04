package String;

public class Check_Palindrome {
	/* WAJP TO CHECK IF A GIVEN STRING IS PALINDROME OR NOT ? */
	public static void main(String[] args) {
		String s="MALAYALAM";
		String copy=s;
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s);
		if (copy==rev) {
			System.out.println("PALINDROME !!");
		}
		else {
			System.out.println("NOT PALINDROME !!!");
		}
	}
}
