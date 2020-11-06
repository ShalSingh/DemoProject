package FactoryDesign;

public class OperatingSystemFactory {
	public os getInstance(String str) {
		if(str.equals("android"))
			return new android();

		else 
			return new iphone();

	}
}
