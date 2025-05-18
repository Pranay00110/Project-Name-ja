package Practise;

public class g2Space {
	
	public static void main(String[] args) {
		
		String a = "Pranay is software Engineer";
		
		int count = 0;
		
		for(int i=0; i<a.length()-1;i++) {
			char a1 = a.charAt(i);
			
			if(a1==' ') {
				
				count++;
			}
		}
		System.out.println(count);
	}
         
}
