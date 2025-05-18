package string;

public class practSplit {
	
public static void main(String[] args) {
		
		String a="5G is launched";
		
		String [] Result=a.split(" ");
		
		for(int i=0;i<Result.length;i++) {
			
			System.out.println(Result[i]);

		}
	}

}
