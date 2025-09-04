package String;

public class Count_Word {
	/* WAJP TO COUNT NUMBER OF WORD OF GIVEN STRING WITHOUT USING BUILD IN METHOD
	 * INPUT : JAVA IS A PROGRAMMING LANGUAGE
	 * OUTPUT : 5
	 */
	public static void main(String[] args) {
		String str="JAVA IS A PROGRAMMIG LANGUAGE";
		int count=0;
		String [] word=str.split("\\s");
		for(int i=0;i<word.length;i++)
		{
			count++;
		}
		System.out.println("NUMBER OF WORD : "+count);
	}
}
