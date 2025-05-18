package string;
public class practFebonanci3 {
	
	public static void main(String[] args) {
		
		int W=0;
		int X=1;
		int Y=10;
		int Z;
		
		System.out.print(W+" "+X);
		for(int i=2;i<Y;i++) {
			
			Z=W+X;
			
			System.out.print(" "+Z);
			
			W=X;
			X=Z;
		}
		
		
	}

}
