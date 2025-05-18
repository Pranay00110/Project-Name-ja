package method;

public class practNonStaticABC {
	
	public void COM() {
		System.out.println("Non static COMmethod");
	}
		public void COM1() {
			System.out.println("Non static COM1method");
		}

	public static void main(String[] args) {
		
		practNonStaticABC s = new practNonStaticABC();
		s.COM();
		s.COM1();
	}

}
