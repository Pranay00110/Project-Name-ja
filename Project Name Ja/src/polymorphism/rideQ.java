package polymorphism;

public class rideQ extends rideP {
	
   public static void Addition() {   
	   
		System.out.println("Addition ended");
	}
   public static void main(String[] args) {
	
	   rideP x = new rideQ();
	   x.Addition();
}
  }
// static method overriding (which is not possible)