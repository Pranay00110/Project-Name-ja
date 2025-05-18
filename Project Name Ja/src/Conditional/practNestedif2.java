package Conditional;

public class practNestedif2 {
	
	public static void main(String[] args) {
		
		
		String UN="abc";
		String PWD="123";
		
		if(UN=="abc") {
			
			System.out.println("Username is correct");
			
			
			if(PWD=="234") {
				System.out.println("Password is correct");
				System.out.println("Login is successful");
			}
			
			else {
				System.out.println("Password is wrong");
				System.out.println("Login is failed");
			}
		}
		else {
			System.out.println("Username is wrong");
			System.out.println("Login is failed");
		}
	}

}
