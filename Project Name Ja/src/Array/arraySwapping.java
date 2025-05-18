package Array;

public class arraySwapping {
	
	public static void main(String[] args) {
	
	int a []= {30, 50, 60, 65, 78, 29};
	
     for(int i=0; i<=a.length-1;i++) {
    	 System.out.print(a[i]+" ");
     }
     for(int i=0;i<(a.length/2);i++) {
    	 int z;     //   decleration new variable for swapping
    	 
    	 z=a[i];                    // 0
    	 a[i]=a[(a.length-1)-i];    // a[5]
    	 a[(a.length-1)-i]=z;
     }
     
     System.out.println();
     
     for(int i=0;i<=a.length-1;i++) {
    	 System.out.print(a[i]+" ");
     }
}
}