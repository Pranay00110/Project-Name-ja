package Practise;

import java.util.Scanner;

public class b2Scan {

	public static void main(String[] args) {
		
		Scanner cls = new Scanner (System.in);
		System.out.println("Enter byte value");
		
		 byte a = cls.nextByte();
		 System.out.println("Your enter byte value is = " +a);
		 System.out.println();
		 
		 
		 
		 System.out.println("Enter double value");
		 double b = cls.nextDouble();
		 System.out.println("Your enter double value is = " +b);
		 System.out.println();
		 
		 
		 
		 System.out.println("Enter string value");
		 String c = cls.next();
		 System.out.println("Your enter string value is = " +c);
		 System.out.println();
		 
		 
		 
		 System.out.println("Enter boolean value");
		 boolean d = cls.nextBoolean();
		 System.out.println("Your enter boolean value is = "+d);
		 System.out.println();
		 
	}

}
