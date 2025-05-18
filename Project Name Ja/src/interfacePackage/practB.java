package interfacePackage;

public class practB implements practA {

		public void Demo() {
			System.out.println("Demo method");
		}

		public void Test() {
			System.out.println("Test method");
		}
		
		public static void main(String[] args) {
			
			practB Y=new practB();
			Y.Demo();
			Y.Test();
			
			
		}
		
}
