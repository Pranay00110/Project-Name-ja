package keywords;

public class practThis {
	
	int A=100;
	
	public void Test() {
		
		int A=200;
		
		System.out.println(A);
		System.out.println(this.A);
		
	}
	public static void main(String[] args) {
		
		practThis B =new practThis();
		B.Test();
		
	}
	
}
