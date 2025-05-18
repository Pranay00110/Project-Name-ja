package Array;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String[] args) {
		
	 int z [] = {10, 70, 60, 30, 20, 98};
			 
			 System.out.println("*******************All info************************");
	 
	 for(int i=0;i<=z.length-1;i++) {
		 System.out.println(z[i]);
	 }
	 System.out.println("****************************in Ascending form*******************");
	 
	 Arrays.sort(z);
	 
	 for(int i=0;i<=z.length-1;i++) {
		 System.out.println(z[i]);
	 }
	 System.out.println("**********************************In descending form**************");
	 for(int i=z.length-1;i>=0;i--) {
		 System.out.println(z[i]);
	 }
	 }

}
