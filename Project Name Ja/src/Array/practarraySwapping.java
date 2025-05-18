package Array;

public class practarraySwapping {
	
	public static void main(String[] args) {
		
		int s[] = {50, 20, 40, 30, 70};
		
		for(int i=0; i<=s.length-1;i++) {
			System.out.print(s[i]+" ");
		}
		for(int i=0; i<(s.length/2);i++) {
			int w;
			
			w=s[i];                   // s[0]
			s[i]=s[(s.length-1)-i];   // s[4]
			s[(s.length-1)-i]=w;      
		}
		System.out.println();
		
		for(int i=0; i<=s.length-1;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
