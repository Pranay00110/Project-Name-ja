package Conditional;

public class ifElseIfLadderPract {

	public static void main(String[] args) {
		
		int accNo = 1234567890;
		
		if( accNo <= 12346) {
			System.out.println("Account no is right");
		}
			
		else if(accNo<=92354) {
			System.out.println("Account no digit is miss");
		}
		
		else if(accNo <=12859) {
			System.out.println("Account no is wrong");
		}
		
		else if(accNo<=12345678) {
			System.out.println("Account no enter in last attemt");
		}
		
		else {
			System.out.println("Your Account is blocked");
		}
		
	}
}
