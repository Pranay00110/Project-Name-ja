package Exeception;

public class A1 {
	
	static void demo() {
			throw new NullPointerException();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hii");
		demo();
		Thread.sleep(9000);
		System.out.println("Hello");
		
	}

}
