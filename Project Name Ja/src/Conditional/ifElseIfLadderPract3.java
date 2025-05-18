package Conditional;

public class ifElseIfLadderPract3 {

public static void main(String[] args) {
		
		String clock = "1";
		
		if (clock == "9") {
			System.out.println("1 hour is remaining");
		}
		
		else if(clock=="5"){
			System.out.println("5 hour is remaining");
		}
		
		else if (clock=="4") {
			System.out.println("6 hour is remaining");
		}
		
		else if (clock=="8") {
			System.out.println("2 hour is remaining");
		}
		
		else {
			System.out.println("clock is not work properly");
		}
	}

}
