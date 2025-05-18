package inheritance;

public class sonB extends sonA {

	public void Laptop() {
		
		System.out.println("Laptop=from sonB");
	}
	
	public static void main(String[] args) {
		
		sonB X = new sonB();
			
		System.out.println(X.a);
		X.Home();
		X.TutionFees();
		
		X.Bike();
		X.Mobile();
		
		X.Laptop();
	
	}
}
