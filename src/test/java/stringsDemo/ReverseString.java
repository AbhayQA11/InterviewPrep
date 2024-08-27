package stringsDemo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hello";
		
//		for(int i=(s.length()-1);i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		
		//Using StringBuilder
//		StringBuilder input1 = new StringBuilder();
//        // append a string into StringBuilder input1
//        input1.append(s);
//        // reverse StringBuilder input1
//        input1.reverse();
//        // print reversed String
//        System.out.println(input1);
		
		
		//Using StringBuffer
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);

	}

}
