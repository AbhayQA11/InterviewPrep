package common;

import abstractClassDemo.CretaCar;

public class CarFeatures extends CretaCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFeatures cf= new CarFeatures();
		cf.engine();
		cf.safety();
		cf.carColor();
		
	}

	@Override
	protected void carColor() {
		System.out.println("WHITE COLOR CRETA");
		

	}

}
