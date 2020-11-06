package SingletonDesign;

 class SingletonClass {
	private static volatile SingletonClass obj; 
	
	private SingletonClass() {
		if(obj!=null) {                                //making reflection proof
			throw new RuntimeException();
		}
	}
	
	public static SingletonClass getInstance() {
		if(obj==null) {
			synchronized (SingletonClass.class) {
				if(obj == null)
					obj = new SingletonClass();
			}
		
		}
		return obj;
	}
}
