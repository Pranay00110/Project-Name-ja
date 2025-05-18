package inheritance;

public class practSonA extends practFather {
	
	protected void Bike() {
		System.out.println("Bike");
	}
	
	public void  TutionFees() {
		System.out.println("TutionFees");
	}

	public static void main(String[] args) {
		
		practSonA E =new practSonA();
		E.House();
		E.Recharge();
		
		System.out.println(E.a);
		
		
	}
	
}
