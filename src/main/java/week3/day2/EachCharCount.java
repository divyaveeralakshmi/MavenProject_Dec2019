package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class EachCharCount {

	public static void main(String[] args) {
		{
			String str = "Please focus";
			char[] ch = str.toCharArray();
			Map<Character,Integer> cha = new LinkedHashMap<>();
			
			for(char c : ch)
			{
				if(cha.containsKey(c))
			
			cha.put(c,cha.get(c)+1);
			
			else
		
				cha.put(c,1);
			
		
			}
			
		
			
			System.out.println("Char count for all characters: " +cha);
					
		}
	}
}
