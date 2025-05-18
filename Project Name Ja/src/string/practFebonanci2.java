package string;

public class practFebonanci2 {
	
	public static void main(String[] args) {
		
		int P=0;
		int Q=1;
		int R=10;
		int S;
		
		System.out.print(P+" "+Q);
		
		for(int i=2;i<R;i++) {
			S=P+Q;
			System.out.print(" "+S);
			
			P=Q;
			Q=S;
		}
		
	}

}
