package Practise;

import java.util.Scanner;

public class b3Scan {
	
	public static void main(String[] args) {
		
		Scanner q = new Scanner (System.in);
		System.out.println("Enter byte value");
		
		 byte x = q.nextByte();
		 System.out.println("Your enter byte value = " +x);
		 System.out.println();
		 
		 
		 
		 System.out.println("Enter long value");
		  long y = q.nextLong();
		  System.out.println("Your enter long value = " +y);
		  System.out.println();
		  
		  
		  
		  System.out.println("Enter string value");
		   String z = q.next();
		   System.out.println("Your enter string value = " +z);
		   System.out.println();
		
	}

}
