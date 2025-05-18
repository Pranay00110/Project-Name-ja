package Logical;

public class starLoop3 {

	public static void main(String[] args) {
		
		int star=5;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=star;j++) {
		System.out.print("*");
		}
		System.out.println();
		star--;
		}
		System.out.println();
		System.out.println("this is a different");
		System.out.println();
		
		int hash=6;
		
		for(int a=1; a<=6;a++) {
			for (int b=1; b<=hash;b++) {
				System.out.print("#");
			}
			System.out.println();
			hash--;
		}
		
		
		
	}

}