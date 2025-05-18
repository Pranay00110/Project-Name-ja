package Collections;


public class Generics <R> {

	int a= 10;
	R b;
	
	public static void main(String[] args) {
		
		Generics <Integer> x = new Generics <Integer>();	
		x.a=100;
		x.b=200;
		
		System.out.println(x.b);
		
		Generics <String> y = new Generics <String>();
		y.b="Pranay";
		
		System.out.println(y.b);
		
		
	}
	
}
