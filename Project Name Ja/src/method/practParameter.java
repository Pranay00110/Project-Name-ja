package method;

public class practParameter {
	
	public static void add (int a, int b) {
		int c=a+b;
		System.out.println("addition"+c);
	}
	
	public void multi(int x, int y) {
		int z=x+y;
		System.out.println("multiplication"+z);
	}
	public static void main(String[] args) {
		
		add(10,20);
		add(100,200);
		
		practParameter q = new practParameter();
		q.multi(20, 20);
		q.add(15, 25);
		
	}
	

}
