package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeated {
	/* WAJP TO PRINT NON-REPEATED FIRST CHARACTER OF AN GIVEN STRING*/
	public static void main(String[] args) {
		String s="swiss";
		System.out.println(s);
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for (char ch :s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				System.out.println("FIRST NON-REPEATED CHARACTER : "+entry.getKey());
				break;
			}
		}
	}
}
