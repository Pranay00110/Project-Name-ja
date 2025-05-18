package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String[] args) {
		
ClassD W = new ClassD();
		
		System.out.println(W.a); // Calling variable with public access specifier
//		System.out.println(W.b); // Calling variable with private access specifier
//		System.out.println(W.c); // Calling variable with defalut access specifier
		System.out.println(W.d); // Calling variable with protected access specifier with inheritance
	
	}

}
