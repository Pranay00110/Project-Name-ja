package method;

public class Default1 implements Default {
	
	public void Mart() {     // Method from interface is complete
		System.out.println("All shops");
	}
	
	public void Dmart() {    // this default method is from interface
		System.out.println("Shopping grocery");  // implementation change	
	}

}
