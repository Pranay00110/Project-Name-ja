package Operators;

public class Logical {
public static void main(String[] args) {
	
	// && AND Operator
	
	System.out.println((10<20) && (20>10));
	System.out.println((10<20) && (20>20));
	
	// || OR Opreator
	System.out.println((10<20) || (20>10));
	System.out.println((10<20) || (20>20));
	System.out.println((10>20) || (20>20));
	
	// ! Not Equal to
	System.out.println(!(3==5));
	System.out.println(!(5==5));
	
	byte a = 20 , b = 30;
	System.out.println((a<b) || (a>b));
	System.out.println((a<b)&&(b>a));
}
}
