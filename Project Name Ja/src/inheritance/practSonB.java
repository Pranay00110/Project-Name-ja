package inheritance;

public class practSonB extends practSonA {
	
	public void Movie() {
		System.out.println("Movie");
	}
	
	public void Dinner() {
		System.out.println("Dinner");
	}
	
	public static void main(String[] args) {
		
		practSonB R= new practSonB();
		R.House();
		R.Recharge();
		
		System.out.println(R.a);
		
		R.Bike();
		R.TutionFees();
		
		R.Movie();
		R.Dinner();
		
	}

}
