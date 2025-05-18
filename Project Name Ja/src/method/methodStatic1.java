package method;

public class methodStatic1 implements methodStatic {
	
	public void Display() {   // Method from interface is completed
		System.out.println("Non static method running");
	}
	
	public static void main(String[] args) {
		methodStatic1 x = new methodStatic1(); {  // Implementation class object
			x.Display();
			methodStatic.show ();        // static method of interface call with interface name only
			
		}
	}

}
