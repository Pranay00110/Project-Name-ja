package inheritance;

public class sonA extends father{

	public void Bike() {
		System.out.println("Bike");
	}
	
	public void Mobile() {
		System.out.println("Mobile");
	}
	public static void main(String[] args) {
		
		sonA x = new sonA();
		x.Home();
		x.TutionFees();
		System.out.println(x.a);
	}
	
}
