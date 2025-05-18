package Package1;

public class ClassB {
	
	public static void main(String[] args) {
		
		ClassA y = new ClassA();
		
		System.out.println(y.a); // Calling variable with public access specifier
//		System.out.println(y.b); // Calling variable with private access specifier
		System.out.println(y.c); // Calling variable with defalut access specifier
		System.out.println(y.d); // Calling variable with protected access specifier
		
	}

}
