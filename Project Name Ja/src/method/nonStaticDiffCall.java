package method;

public class nonStaticDiffCall {
	
	public static void main(String[] args) {
		
		nonStaticSameCall z = new nonStaticSameCall ();   //object creation non static method
		z.Demo();                                        //calling non static method in different class
		z.Memo();
	}

}
