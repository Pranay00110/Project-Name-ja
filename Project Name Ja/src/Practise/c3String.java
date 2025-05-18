package Practise;

public class c3String {
	
	public static void main(String[] args) {
		
		String m = "ABCD";
		String rev = "";
		
		for (int i = m.length()-1; i>=0; i--) {
			rev = rev + m.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.indexOf("D"));
		
	}

}
