package constructor;

import java.util.Scanner;

public class practScan {
	
	public static void main(String[] args) {
		
		Scanner demo = new Scanner(System.in);
		
		System.out.println("Enter integer value");
		
		int value = demo.nextInt();
		System.out.println("your enter value is " + value);
		System.out.println();
		
		
		System.out.println("Enter float value");
		float value1 = demo.nextFloat();
		System.out.println("Your enter value is "+value1);
		System.out.println();
		
		
		System.out.println("Enter string value");
		String value2 = demo.next();
		System.out.println("Your string value is "+value);
		System.out.println();
		
		demo.close();
		
	}

}
