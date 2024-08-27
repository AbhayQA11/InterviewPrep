package common;

public class ConstructorDemo {
	int var =2;
	public ConstructorDemo() {
		System.out.println("I am constructor");
	}
	
	public ConstructorDemo(String s) {
		System.out.println(s);
	}
	
	public void getData() {
		int var =6;
		
		System.out.println(var); //Local variable
		System.out.println(this.var); // Class variable, Use of this
	}

	public static void main(String[] args) {

//Block of code executed whenvever object is created
		//Will not return values
		//Name will always be class name
		ConstructorDemo cd = new ConstructorDemo();
//		ConstructorDemo cc = new ConstructorDemo();
//		ConstructorDemo ab = new ConstructorDemo("I am parameterized contructor");
		
		cd.getData();
	}

}
