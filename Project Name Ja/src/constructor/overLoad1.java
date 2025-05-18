package constructor;

public class overLoad1 {

	static int a=52;
	int b=85;
	
	public static void main(int x) {      //user define main method
		System.out.println(x);
	}
	
	public static void main(char y) {     //user define main method
		System.out.println(y);
	}
	
	public static void main(String[] args) {      //system define main method
		
		main(5206);
		main('P');
	}
}
