package polymorphism;

public class rideB extends rideA {

	public void Pranay () {
		
		System.out.println("Pranay as a Devloper");
	}
	public static void main(String[] args) {
		
		rideB x = new rideB();
		
		x.Pranay();
	}
}
//This is overriding with non static 