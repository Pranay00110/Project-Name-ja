package method;

public class exSameClass {
	
public static void sample() {      //static method decleration
	System.out.println("Running static method sample");
}

public static void sample1() {     
	System.out.println("Running static method sample1");
}

public static void main(String[] args) {
	sample();                   //static method calling from same class
}

}
