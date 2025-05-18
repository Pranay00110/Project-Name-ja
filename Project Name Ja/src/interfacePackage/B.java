package interfacePackage;

public class B implements A {

	public void Demo() {
		System.out.println("Demo method started");
	}
	public void Test() {
		System.out.println("Test method started");
	}
	public static void main(String[] args) {
		
		B x = new B();
		
		x.Demo();
		
		x.Test();
		
	}
}
