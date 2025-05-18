package Conditional;

public class practNestedif {
	
	public static void main(String[] args) {
		
		
		String UN="PRANAY";
		String PWD="123";
		
		if (UN=="tyui") {
			System.out.println("User name is correct");
			
			
			if(PWD=="5678") {
				System.out.println("Password is correct");
				System.out.println("Logon is successful");
			}
			
			else {System.out.println("wrong password");
			      System.out.println("Login ifs failed");
			      
			}
			
		}
		
		else {
			System.out.println("UN is uncorrect");
			System.out.println("Login failed");
		}
		
	}

}
