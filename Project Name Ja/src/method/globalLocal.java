package method;

public class globalLocal {

	int a=10;
	
	public void Test() {
		int a=20;
		int b=30;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void Test1 () {
		int c=40;
		int b=50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		globalLocal x = new globalLocal();
		
		System.out.println(x.a);
		
		x.Test();
		x.Test1();
	}
}
