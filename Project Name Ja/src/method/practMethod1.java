package method;

public class practMethod1 {

	static int demo() {
		
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	static String test() {
		return "Welocome to velocity";
		
	}
	
	
	public static void main(String[] args) {
		int c=demo();
		System.out.println(c);
		
		String p = test();
		System.out.println(p);
	}
	
	
	
	
}
