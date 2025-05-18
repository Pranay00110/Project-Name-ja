package keywords;

public class superK2 extends superK1 {
	
	int a=300;                            // global variable

	public void Demo() {
		
		int a=400;                         // local variable
		
		System.out.println(a);             // 400 calling local variable
		
		System.out.println(this.a);        // 300 calling global variable from same class
		
		System.out.println(super.a);       // 200 calling global variable from diff class
	}
	public static void main(String[] args) {
		
		superK2 x = new superK2();
		
		x.Demo();
		
	}
}
