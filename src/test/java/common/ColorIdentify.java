package common;

import interfacesDemo.Colors;

public class ColorIdentify implements Colors{

	@Override
	public void green() {
		System.out.println("Interface Color is GREEN");
		
	}

	@Override
	public void red() {
		System.out.println("Interface Color is RED");
		
	}
	
	public void orange() {
		System.out.println("SubClass Color is ORANGE");
	}
	
	public static void main(String[] args) {
	Colors c= new ColorIdentify();
	
	ColorIdentify ci = new ColorIdentify();
	ci.orange();
	ci.green();
	c.green();
	c.red();
	}
	
	

}
