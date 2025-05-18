package string;

public class practSplit1 {
	
	public static void main(String[] args) {
	
		String a="I work as a senior tester";
		String []Result=a.split	(" ");
		
		for (int i=0; i<Result.length;i++) {
			System.out.println(Result[i]);
		}
	}

}
