package Practise;

public class g1Space {
	
	public static void main(String[] args) {
		
		String z = "Pranay is Software Engineer";
		int count =0;
		
		for(int i=0; i<z.length()-1; i++) {
			char z1 = z.charAt(i);
			
			if (z1 == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
