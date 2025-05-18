package Practise;

public class c1String {
	
	public static void main(String[] args) {
		
		String z = "pranay";
		String rev = "";
		
		for(int i = z.length()-1; i>=0;i--) {
			rev = rev + z.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println(rev.indexOf("y"));
		
	}

}
