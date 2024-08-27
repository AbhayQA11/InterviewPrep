package inheritanceDemo;

public class ModernCar extends Classics {
	String color = "white";
	
	public void engine() {
		System.out.println("Modern Car New TURBO ENgine");
	}

	public void color() {
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		Classics mc = new ModernCar();
		mc.color();
		mc.engine();
		mc.brakes();
	}

}
