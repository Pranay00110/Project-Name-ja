package constructor;

public class staticM {

	static {
		System.out.println("static block running");
	}
	
	{
		System.out.println("Non-static block is running");
	}
	
	public static void main(String[] args) {
		
	staticM w=new staticM();{
	System.out.println("main method is starting");
	staticM m=new staticM();
}
}
}