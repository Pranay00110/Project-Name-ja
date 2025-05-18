package constructor;

public class practOverload {
	
     public static void main(int a) {
		System.out.println(a);
	}
     
     public static void main(char b) {
		System.out.println(b);
	}
     
     public static void main(String c) {
		System.out.println(c);
	}
     
     public static void main(double d) {
    	 System.out.println(d);
     }
     
    public static void main(String[] args) {
		
    	main(10);
    	main(10.10);
    	main('Z');
    	main("ABC");
    	
    	
	}
     

}
