package polymorphism;

public class ride2 extends ride1 {
	
	public static void Addition () {
		
		System.out.println("addition is end");
	}
	
public static void main(String[] args) {
	
	ride2 x = new ride2();
	
	x.Addition();
}
}
     // This is overriding with static