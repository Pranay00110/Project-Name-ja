package constructor;

import java.util.Scanner;

public class practScan1 {
	
	public static void main(String[] args) {
		
		Scanner Test = new Scanner(System.in);
		
		System.out.println("Enter integer value");
		int value = Test.nextInt();
		System.out.println("Your enter value is "+value);
		System.out.println();
		
		
		System.out.println("Enter float value");
		float value1 = Test.nextFloat();
		System.out.println("Your enter value is "+ value);
		System.out.println();
		
		System.out.println("Enter  string value");
		String value2 = Test.next();
		System.out.println("Your enter value is "+ value);
		System.out.println();
		
		Test.close();
		
	}

}
