package String;

public class Count_Space {
	/* WAJP TO COUNT NUMBER OF SPACES IN GIVEN STRING
//	 * INPUT :HELLO JAVA ?
	 * OUTPUT : 2
	 */
	public static void main(String[] args) {
		String str="H E L L O J A V A";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("NUMBER OF SPACES : "+count);
	}
}
