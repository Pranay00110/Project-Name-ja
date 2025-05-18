package string;

public class practSpace1 {
	
	public static void main(String[] args) {
		
		String p="My name is pranay";
		int count =0;
		
		for(int i=0;i<p.length()-1;i++) {
			char s1=p.charAt(i);
			
			if(s1==' '){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
