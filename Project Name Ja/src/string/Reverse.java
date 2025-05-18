package string;

public class Reverse {
	
	public static void main(String[] args) {
		
		String a="velocity";
		String rev = "";
		
		
		for(int i=a.length()-1;i>=0;i--) {
			
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println(rev.indexOf("y"));
	}

}
