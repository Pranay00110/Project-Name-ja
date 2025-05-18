package method;

public class practNonstatic {

	void mob () {
		System.out.println("calling non static method");
	}
	
	void Lapi() {
		System.out.println("calling non static method 2");
	}
	public static void main(String[] args) {
		
		practNonstatic a = new practNonstatic();
		a.mob();
		a.Lapi();
	}
}
