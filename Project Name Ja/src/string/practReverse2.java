package string;

public class practReverse2 {
	
	public static void main(String[] args) {
		
	
	String W="Atambar";
	String rev="";
	
	for(int i=W.length()-1;i>=0;i--) {
		rev=rev+W.charAt(i);
	}
	System.out.println(rev);
	System.out.println(rev.indexOf("r"));
	
	}
}
