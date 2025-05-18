package string;

public class practSplit2 {
	
	public static void main(String[] args) {
		
		String a="01 10 2022";
		String[]Result=a.split(" ");
		
		for(int i=0; i<Result.length;i++) {
			
			System.out.println(Result[i]);
		}
	}

}
