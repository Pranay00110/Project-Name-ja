package method;

public class Return {
	
	static int Demo () {
	
		int x=15;
		int y=30;
		int z=x+y;
		int d;
		return d=z;
		
	}
	
	static String Test () {
		return "Welcome pranay";
		
	}
	
	public static void main(String[] args) {
		
		int d=Demo();
		System.out.println(d);
		
		String a=Test();
		System.out.println(a);
		
		
	}
	
	

}
