package Conditional;

public class nestedIfPract2 {
	
	public static void main(String[] args) {
		
		String Mob="oppo";
		String Headphone="boat";
		
		if(Mob=="oppo") {
			System.out.println("oppo mob is purchase");
			
			if(Headphone=="boat") {
				System.out.println("boat headphone is purchase");
			}
			else {
				System.out.println("boat headphone is not work properly");
				System.out.println("boat headphone is canceled");
			}
		}
			else {
				System.out.println("oppo mob is not work properly");
				System.out.println("oppo mob is canceled");
			}
		
	}

}
