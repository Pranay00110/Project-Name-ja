package polymorphism;

public class rideNonStatic1 extends rideNonStatic {
	
	public void Addition() {
		System.out.println("Addition ended");
	}
	
	public static void main(String[] args) {
		rideNonStatic x = new rideNonStatic();
		x.Addition();
	}

}
