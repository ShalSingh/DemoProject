package FactoryDesign;

public interface os {
	void specs();
}

class android implements os{

	@Override
	public void specs() {
		System.out.println("Android class");		
	}
	
}

class iphone implements os{
	public void specs() {
		System.out.println("Android class");		
	}
}
