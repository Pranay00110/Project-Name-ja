package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main(String[] args) {
		
		ClassA Z = new ClassA();
		
		System.out.println(Z.a); // Calling variable with public access specifier
//		System.out.println(Z.b); // Calling variable with private access specifier
//		System.out.println(Z.c); // Calling variable with defalut access specifier
//		System.out.println(Z.d); // Calling variable with protected access specifier
	}

}
