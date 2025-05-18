package Conditional;

public class nestedifPract {

	public static void main(String[] args) {
		
		String lapi = "HP";
		String mob = "OPPO";
		
		if(lapi=="HP"){
			System.out.println("DELL lapi");
			
			if(mob=="VIVO"){
				System.out.println("VIVO mob");
				System.out.println("correct mob");
			}
			
			else {
					System.out.println("Not VIVO mob ");
					System.out.println("VIVO mob is losse");
				}
			}
		else {
			System.out.println("Not HP lapi ");
			System.out.println("HP lapi is loose");
		}
			
		}
		
		
		
		
	}

