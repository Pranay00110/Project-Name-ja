package interfacePackage;

public class practD implements practinterfaceC {

	public void Pranay() {
		System.out.println("As a Manual tester");
	}

	public void Dinesh() {
		System.out.println("As a Automation tester");
	}
	
	public void Bhagi() {
		System.out.println("Looking for a job");
	}
	
	public void Navin() {
		System.out.println("Doing job out of state");
	}
	
	public void Akshay() {
		System.out.println("As a Developer");
	}
	
	public static void main(String[] args) {
		
		practD  L=new practD();
		L.Pranay();
		L.Dinesh();
		
		L.Bhagi();
		L.Navin();
		
		L.Akshay();
			
		
	}
	
}
