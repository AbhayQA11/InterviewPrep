package common;

public class SwapVar {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		
//		//With Temp var
//		c=a;
//		a=b;
//		b=c;
		
		//Without Temp var
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Val a - "+a);
		System.out.println("Val b - "+b);

	}

}
