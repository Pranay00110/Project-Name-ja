package Array;

import java.util.Arrays;

public class practAscDes {
	
	public static void main(String[] args) {
		
		int x []= {50, 20, 40, 30, 80, 90, 60};
		
		System.out.println("*************particular value***********");
		System.out.println(x[5]);
		
		System.out.println("*************In Ascending form***********");
		
		Arrays.sort(x);
		
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i]);
		}
		System.out.println("*************In Descending form***********");
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
	}

}
