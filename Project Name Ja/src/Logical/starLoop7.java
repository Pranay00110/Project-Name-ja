package Logical;

public class starLoop7 {

	public static void main(String[] args) {
		
		int space=5;
		int star=1; //4
		
		for(int i=1; i<=11;i++) {
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=5) {
				space--;
				star++;
				star++;
				}
				else {
						space++;
						star--;
						star--;
				
				}
		
		
		}
	}
}