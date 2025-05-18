package string;

public class split {
	
	public static void main(String[] args) {
		
		String a="my laptop is HP";
		
		String []Result=a.split(" ");
		
		for (int i=0;i<Result.length;i++) {
			System.out.println(Result[i]);
		}
	}

}
