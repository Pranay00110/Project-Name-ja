package constructor;

import java.util.Scanner;

public class scan {
	
	public static void main(String[] args) {
		
		Scanner Demo = new Scanner(System.in);       //scanner class object
		
		
	System.out.println("Enter integer value");
	
     int value=Demo.nextInt ();
	
	System.out.println("your enter value is " +value);
	
	System.out.println();
	
	
	
	System.out.println("Enter float value is ");
	
	float value1 =Demo.nextFloat();
	
	System.out.println("youe entered value is "+value1);
	
	System.out.println();
	
	
	
	System.out.println("Enter string value is ");
	
	String value2 =Demo.next();
	
	System.out.println("your entered value is "+value2);
	
	
	System.out.println();
	
	
	System.out.println("Enter byte value is");
	
	byte value3=Demo.nextByte();
	
	System.out.println("your entered value is "+value3);
	
	Demo.close();      //close all
		}

}
