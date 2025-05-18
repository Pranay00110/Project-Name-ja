package Practise;

public class c4String {
	
	public static void main(String[] args) {
		
		String x = "VELOCITY";
		String rev = "";
		
		for(int i =x.length()-1; i>=0; i--) {
			rev = rev + x.charAt(i);
		}
		
		System.out.println(rev);
		System.out.println(rev.indexOf("Y"));
		
	}

}
