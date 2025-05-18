package Exeception;

public class A2 {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		int c=0;
		int d[]= {12,20,22,34};
		System.out.println("start");
		System.out.println(d[1]);
		
		try {
			c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException s) {
			c=a/b;
			System.out.println("Alternative code");
			System.out.println(d[2]);

		}
		System.out.println(c);
		System.out.println("Normal flow");
	}

}
