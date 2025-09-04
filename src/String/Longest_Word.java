package String;

public class Longest_Word {
	/* WAJP TO FIND THE LONGEST WORD IN A GIVEN STRING ? */
	public static void main(String[] args) {
		String sentence="JAVA IS A POWERFUL PROGRAMMING LANGUAGE";
		String [] words=sentence.split(" ");	
		String longest="";
		for(String word:words) {
			if (word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println("LONGEST WORD : "+longest);
	}
}
