package common;

public class ReplaceVowels {

	public static void main(String[] args) {
		String str="My Name is Abhay";
		
		String res = str.replaceAll("[AEIOUaeiou]", "x");
		
		System.out.println("Result - "+res);

	}

}
