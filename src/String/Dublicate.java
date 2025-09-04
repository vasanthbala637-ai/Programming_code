package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dublicate {
	/* WAJP TO PRINT DUPLICATED CHARACTER'S OF AN GIVEN STRING ? */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String s=scn.nextLine();
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (char c :s.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
