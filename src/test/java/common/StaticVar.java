package common;

public class StaticVar {
	
	String name;
	String address; // Instance variables - declared at class level
	 static String city;// Class variable
	 static int i;
	
	static {
		 city ="Bangalore"; //Static block
		 i=0;
	}
	
	
	StaticVar(String name, String address){// these are local variables
		this.name =name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println("address is - "+address +" and City - "+city);
	}
	
	public static void getCity() {
		System.out.println(city); // Static variable with static methods
	}

	public static void main(String[] args) {
		StaticVar ob = new StaticVar("Abhay", "Sarjapur");
		StaticVar ob1 = new StaticVar("Ajay", "Dommasandra");
		ob.getAddress();
		ob1.getAddress();
		StaticVar.getCity(); //All static methods can be accessed using class variable

	}

}
