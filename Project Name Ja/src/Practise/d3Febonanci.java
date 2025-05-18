package Practise;

public class d3Febonanci {
	
	public static void main(String[] args) {
		
		int a =0;
		int b =1;
		int c =10;
		int d;
		
		System.out.print(a+" "+b);
		for(int i=2; i<c; i++) {
			d=a+b;
			System.out.print(" "+d);
			
			a=b;
			b=d;
		}
		
	}

}
