package Practise;

import java.util.Scanner;

public class b1Scan {
	
	public static void main(String[] args) {
		
		Scanner test = new Scanner(System.in);
		System.out.println("Enter integer value");
		
		int x = test.nextInt();
		
		System.out.println("Your enter value is = " + x);
		System.out.println();
		
		
		System.out.println("Enter float value is");
		float y = test.nextFloat();
		
		System.out.println("Your enter value is = " +y);
		System.out.println();
		
		
		System.out.println("Enter string value");
		String z = test.next();
		
		System.out.println("Your enter  value is = " +z);
		System.out.println();
		
	}

}
