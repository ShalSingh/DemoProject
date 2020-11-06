package FactoryDesign;

public class Factory {

	public static void main(String[] args) {
		/*
		 * os o = new android(); o.specs();
		 */
		
		OperatingSystemFactory o1 = new OperatingSystemFactory();
		//o1.getInstance("android").specs();
		os o = o1.getInstance("android");
		o.specs();
	}

}
