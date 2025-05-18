package constructor;

public class cons1 {

	byte a;
	short b;
	int c;
	String Pranay;
	
	
	cons1(){
		a=80;
		b=90;
	}
	
	cons1(int a, short b) {
		a=50;
		b=65;
	}
	
	cons1(int c, byte d){
		c=a;
		d=10;
	}
	
	cons1(String Pranay){
		Pranay="Tester";
	}
	
	public  void addition () {
		System.out.println(a+b);
	}
	
	public void subtraction () {
		System.out.println(a-b);
		System.out.println(b-c);
	}
	
	public void multiplication () {
		System.out.println(a*b);
		System.out.println(b*c);
	}
	
	public void string () {
		System.out.println("Pranay");
	}
	
	public static void main(String[] args) {
		
		cons1 F = new cons1 ();
		F.addition();
		F.subtraction();
		
		cons1 G = new cons1 ();
		G.multiplication();
		G.string();
		
		cons1 H = new cons1 ();
		H.string();
		H.multiplication();
		H.addition();
	}
	
}
