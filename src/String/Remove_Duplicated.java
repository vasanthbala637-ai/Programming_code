package String;

public class Remove_Duplicated {
	/* WAJP TO REMOVE DUPLICATED CHARACTER IN A GIVEN STRING LOGIC ? */
	public static void main(String[] args) {
		String str="programming";
		String result="";
		for(int i=0;i<str.length();i++) {
			if (!result.contains(str.charAt(i)+"")) {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
	}
}