package common;

public class ExceptionDemo {
	
	int a =5;
	int b =0;
	
	int c;
	
	public void getData() {
		
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Please check the error - "+e);
		}
		finally{
			System.out.println("Thank You!");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo ed= new ExceptionDemo();
		ed.getData();

	}

}
