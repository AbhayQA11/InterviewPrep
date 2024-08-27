package abstractClassDemo;

public abstract class CretaCar {
	
	//Abstract must have atleast one abstract method
	//You can achieve partial abstraction through abstract class
	//Private access modifier is not allowed in abstract class as Child class won't be able to access it
	public void engine() {
		System.out.println("1.5MPI Petrol Engine");
	}
	
	public void safety() {
		System.out.println("6 airbags");
	}
	protected abstract void carColor(); //abstract method

}
