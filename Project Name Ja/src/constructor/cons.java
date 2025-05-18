package constructor;

public class cons {

	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	
	cons(){                   //user define constructor with zero argument/parameter
		
		a=89;
		b=90;
	}
	
	cons (int c,int d){      //user define constructor with argument/parameter
		
		a=c;
		b=d;
	}
	
	cons (String name,String Velocity){
		name="Pranay";
	    velocity="Abhi sir";
	}
	
	public void addition() {
		System.out.println(m+a+b);
	}
	
	public void St() {
		System.out.println(name);
		System.out.println(velocity);
	}
	
	public static void main(String[] args) {
		
		cons E = new cons();
		E.addition();
		E.St();
		
		cons F = new cons (10,70);
		F.addition();
		
		cons J =new cons (10,70);
		J.addition();
		
		
	}
}
