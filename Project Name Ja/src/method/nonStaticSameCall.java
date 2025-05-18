package method;

public class nonStaticSameCall {

	public void Demo(){           //decleration non static method
		
		System.out.println("non static method running");
		
	}
	
public void Memo(){           //decleration non static method
		
		System.out.println("non static method running from Memo");
		}
	
	public static void main(String[] args) {
		
	nonStaticSameCall z = new nonStaticSameCall	();	
	
	z.Demo();                   //non static method call from same class
	}
	
}
