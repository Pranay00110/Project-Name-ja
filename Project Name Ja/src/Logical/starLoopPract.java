package Logical;

public class starLoopPract {
	
public static void main(String[] args) {
	
	int space=3;
	int star=1; //4
	
	for(int i=1; i<=7;i++) {
		for (int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for (int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println();
		
		if(i<=3) {
			space--;
			star++;
			
			}
			else {
					space++;
					star--;
			        
			}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
