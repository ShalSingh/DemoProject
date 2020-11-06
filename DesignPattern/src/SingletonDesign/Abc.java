package SingletonDesign;

public class Abc {

	public static void main(String[] args) {
		//SingletonClass s = new SingletonClass();
		Runnable r1 = ()-> {
				SingletonClass instance1 = SingletonClass.getInstance();
				System.out.println(instance1.hashCode());			
			};
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonClass instance2 = SingletonClass.getInstance();
				System.out.println(instance2.hashCode());			
			}
			
		});
		
		//t1.start();
		Thread t1 = new Thread(r1);
		t1.start();
		t2.start();
		
		
	}

}
