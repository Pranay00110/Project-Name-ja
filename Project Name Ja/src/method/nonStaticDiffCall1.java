package method;

public class nonStaticDiffCall1 {
	
	public void TaTa() {
		int a=78;
		System.out.println(a);
	}
	
public static void main(String[] args) {
		
		nonStaticSameCall z = new nonStaticSameCall ();   //object creation non static method
		z.Demo();                                        //calling non static method in different class
		z.Memo();
		
		
		nonStaticDiffCall1 a= new nonStaticDiffCall1();
		a.TaTa();
	}

}


