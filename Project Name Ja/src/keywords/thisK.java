package keywords;

public class thisK {
	
	int a=50;                                 // global variable
	
	public void thisA() {
		
		int a=100;                            // local variable
		
		System.out.println(a);
		
		System.out.println(this.a);          // calling global variable
	}
	public static void main(String[] args) {
		
		thisK x = new thisK ();
		x.thisA();
	}

}
