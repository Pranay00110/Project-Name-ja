package interfacePackage;

public class zQR implements R {
	
	public void Me() {
		System.out.println("Insert jio sim");
	}
	
	public void Dad () {
		System.out.println("Insert voda sim");
	}
	
	public void Mom() {
		System.out.println("Insert idea");
	}
	public static void main(String[] args) {
		
		ZQR y = new ZQR();
		y.jio();
		y.voda();
		y.idea();
	}

}
