package Conditional;

public class practLadderif {
	
	
	public static void main(String[] args) {
		
		int marks = 90;
		
		if(marks>80) {
			System.out.println("Student pass in 1st class ");
		}

		else if (marks>70) {
			System.out.println("Student pass in 2nd class");
		}
		
		else if (marks>60) {
			System.out.println("Student pass in 3rd class");
		}
		else System.out.println("Student is failed");
		
	}
}
