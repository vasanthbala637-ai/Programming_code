package String;

public class Count_Character {
	/* WAJP TO COUNT NUMBER OF CHARACTER OF GIVEN STRING WITHOUT USING BUILD IN METHOD
	 * INPUT : JAVA
	 * OUTPUT : 4
	 */
	public static void main(String[] args) {
		String str="java";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		System.out.println("NUMBER OF CHARACTER : "+count);
	}
}
