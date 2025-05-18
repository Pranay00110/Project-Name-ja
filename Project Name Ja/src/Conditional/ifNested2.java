package Conditional;

public class ifNested2 {

	public static void main(String[] args) {
		
        String UN = "AC";
        String PWD = "XYZ";
        
  if (UN=="A") { // condition 1 outer if
      	  System.out.println("User name is correct");
       
      	  //Above if Curly bracket is open
        
        if (PWD=="XYZ") {
      	 System.out.println("Password is correct"); 
      	 System.out.println("Login is successful");
        
        }
        else {
      	  System.out.println("Wrong password");
      	  System.out.println("Login is failed");
        }
  }
  else {
  	System.out.println("Wrong username");
  	System.out.println("Login is failed");
  }
	
	
	
	
	
	
  }
 }


