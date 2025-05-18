package string;

public class space {
	
	public static void main(String[] args) {
		
		String s="I work as senior tester";
		
		int count =0;
		
		for(int i=0; i<s.length()-1;i++) {
			char s1 = s.charAt(i);
			
			if (s1 == ' ') {  // space count in string
				
				count++;
			}
		}
		System.out.println(count);
	}

}
