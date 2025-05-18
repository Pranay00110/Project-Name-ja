package constructor;

public class overLoad {

	public static void addition (int a, int b) {
		int c=a+b;
		System.out.println("addition="+c);
	}
	public static void substraction (int q,int p) {
		int e=q-p;
		System.out.println("substraction="+e);
	}
	public static void multiplication (int w,int m) {
		int k=w*m;
		System.out.println("multiplication="+k);
	}
	public static void division (int t,int j) {
		int y=t/j;
		System.out.println("division="+y);
		
		 
}
	public static void main(String[] args) {
		addition(50,80);
		multiplication(20,85);
		substraction(52,25);
		division(41,7);
	}
}