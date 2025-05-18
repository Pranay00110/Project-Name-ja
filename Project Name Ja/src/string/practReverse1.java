package string;

public class practReverse1 {
	
	public static void main(String[] args) {
		
	
	String y="pranay";
	String rev="";
	
	for(int i=y.length()-1;i>=0;i--) {
		rev=rev + y.charAt(i);
	}
	System.out.println(rev);
	System.out.println(rev.indexOf("y"));

}
}