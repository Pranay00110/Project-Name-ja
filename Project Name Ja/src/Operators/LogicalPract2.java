package Operators;

public class LogicalPract2 {
	
	public static void main(String[] args) {
		
		byte n=20;
		byte m=80;
		
		System.out.println((n<m)&&(m>n));     //AND 
		
		System.out.println((n<m)&&(n>m));     //AND
		
		System.out.println((n<m)||(n>m));     //OR
		
		System.out.println((n<m)||(n>m));     //OR
		
		System.out.println((n==m)&&(n==m));   //AND EQUAL TO
		
		System.out.println((n==m)||(m==n));   //OR EQUAL TO
		
		System.out.println(!(n<m));
		
		System.out.println(!(n>m));
	
	}
}
