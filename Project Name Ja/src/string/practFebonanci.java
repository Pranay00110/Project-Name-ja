package string;

public class practFebonanci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b);  // 0 1
		
		for(int i=2; i<30;i++) {
			 c =a+b;
			System.out.print(" "+c );  // 1
			
			a=b;
			b=c;
		}
		
	}

}
