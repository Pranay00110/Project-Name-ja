package polymorphism;

public class rideY extends rideX {
	
	public static void Test() {
		System.out.println("Run test method of sub");
	}
	public static void main(String[] args) {
		rideY x = new rideY();
		x.Test();
	}

}
// Static method of super class is hided and only the sub class static method is executed