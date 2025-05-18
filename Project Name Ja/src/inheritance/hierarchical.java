package inheritance;

public class hierarchical {
	
	public static void main(String[] args) {
		
		sonA X= new sonA();
		
		X.Home();
		X.TutionFees();
		
		System.out.println(X.a);
		
		System.out.println("Method from another sub class");
		
		
		sonB y= new sonB();
		
		y.Laptop();
		
		System.out.println(y.a);
		
		y.Mobile();
		
		y.Home();
	}

}
