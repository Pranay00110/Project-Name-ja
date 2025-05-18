package method;

public class practMethod2 {
	
	static int test() {
		int a=10;
		int b=20;
		int c=a+b;
		return c ;
	}
	
	static String demo() {
		return "welcome to velocity";
		
	}
	
	public static void main(String[] args) {
		
		int c = test();
		System.out.println(c);
		
		String p = demo();
		System.out.println(p);
		
	}
	

}
