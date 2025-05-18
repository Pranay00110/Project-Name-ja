package method;

public class Default2 implements Default { // new implementation class
	
	public void Mart() {   // completed from interface
		System.out.println("All shops closed");
	}
	public static void main(String[] args) {
		Default1 x = new Default1();  // object of implementation class
		
		Default2 y = new Default2(); // object of implementation class	
		
		
		
		x.Mart();  // complete method from interface to class Default1
		x.Demart(); // default method of interface call with imple. class object (imple. change)
		
		y.Mart();  // complete method from interface to class
		y.Demart();  // default method from interface default2
		
		
	}

}
