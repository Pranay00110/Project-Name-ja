package inheritance;

public class practHierarchical {
	
	public static void main(String[] args) {
		
		practSonA Y= new practSonA() ;
		
			Y.House();
			Y.Recharge();
			
			System.out.println(Y.a);
			
			Y.Bike();
			Y.TutionFees();
			
			System.out.println(Y.a);
			
			practSonB P= new practSonB();
			
			P.Movie();
			P.Dinner();
		
	}

}
