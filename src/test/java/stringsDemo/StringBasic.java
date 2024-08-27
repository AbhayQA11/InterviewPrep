package stringsDemo;

public class StringBasic {
	public static void main(String[] args) {
		//String is Prebuilt class
		
//		String a = "hello";
//		String b = "hello";
//		a.concat("World");
//		System.out.println(a);
////		
//		String ab = new String("hello");
////		String bb = new String("hello");
//		
////		System.out.println(a);
////		System.out.println(b);
//		ab.concat("World");
//		System.out.println(ab);
////		System.out.println(bb);
		
		//StringBuffer & StringBuilder
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" World");
		sb.insert(0, "The ");
		System.out.println("String Buffer - "+sb);
		
		//StringBuilder
		StringBuilder sbb = new StringBuilder("hello");
		System.out.println("String Builder - "+sbb);
	}

}
