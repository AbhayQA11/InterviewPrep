package common;

import java.util.HashMap;
import java.util.Map;

public class RepeatCharCount {
	
	public static void main(String[] args) {

		String str = "this is a test";
		
		Map<Character,Integer> charCount = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> set:charCount.entrySet()) {
			System.out.println("Char - "+set.getKey() +" "+set.getValue());
		}

	}

}
