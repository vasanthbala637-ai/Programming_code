package String;

public class Count_Vowles_Consonant {
	/*WAJP TO COUNT THE VOWLES AND CONSONANTS OF A GIVEN STRING ? */
	public static void main(String[] args) {
		String s="heLLO";
		int vowles=0;
		int consonants=0;
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' 
					||s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					vowles++;
			} else {
				consonants++;
			}
		}
		System.out.println("NUMBER OF VOWLES : "+vowles);
		System.out.println("NUMBER OF CONSONANTS : "+consonants);
	}
}
