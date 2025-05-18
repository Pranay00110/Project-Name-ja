package string;

public class Methods {
	
	public static void main(String[] args) {
		
		String a="velocity";
		String b="VELOCITY";
		String c="city";
		
		
		//////////////REPLACE/////////////////////
		
		System.out.println("1st //how many times are repeat address");
		System.out.println(a.repeat(3));
		
		System.out.println("2nd  //old char to new char");
		System.out.println(a.replace("city", "state"));
		
		System.out.println("3rd  //in words any single char replace");
		System.out.println(a.replace("y", "z"));
		
		System.out.println("4th  //sequance change of single char");
		System.out.println(a.replace("e", "a"));
		
		
		System.out.println("unknown");
	//	System.out.println(b.re);
		////////////////IS//////////////////
		
		System.out.println("5th  //empty or not (boolean)  ");
		System.out.println(a.isEmpty());
		
		System.out.println("6th  //blank or not (boolean)");
		System.out.println(b.isBlank());
		
		
		
		
		System.out.println("7th  //contacting");     // string contacting that means adding
		System.out.println(c.concat(a));
		
		System.out.println("8th  //as per index no");
		System.out.println(b.substring(4,7));
		
		System.out.println("9th  //from start count as per index");
		System.out.println(b.substring(3));
	
		System.out.println("10th");
		System.out.println(b.subSequence(2, 5));
		
		System.out.println("11th  //boolean");
		System.out.println(a.endsWith("ty"));
		
		System.out.println("11th  //BOOLEAN");
		System.out.println(b.startsWith("VELO"));
		
		System.out.println("12th  //count as per index");
		System.out.println(a.lastIndexOf("o"));
		
		System.out.println("13th");
		//System.out.println(b.lastIndexOf());
		
		System.out.println("14th");
		System.out.println(a.indexOf("o"));
		
		System.out.println("15th");
		System.out.println(a.indexOf("o"));
		
		System.out.println("16th");
		System.out.println(a.charAt(3));
		
		System.out.println("17th  //boolean");
		System.out.println(b.contains("CITY"));
		
		System.out.println("18th  //its char true or not");
		System.out.println(a.contentEquals("velocity"));
		
		System.out.println("19th  //its char true or not");
		System.out.println(b.contentEquals("VELOCITY"));
		
		System.out.println("20th");
		System.out.println(a.equals("velocity"));
		
		System.out.println("21th  //opposite to upper/lower case (boolean)");
		System.out.println(b.equalsIgnoreCase("B"));
		
		System.out.println("22th");
		System.out.println(a.contentEquals("velocity"));
		
		System.out.println("23  //show the length of char in int");
		System.out.println(a.length());
		
		System.out.println("24");
		System.out.println(b.toLowerCase());
		
		System.out.println("25");
		//System.out.println(b.toLowerCase(null));
		
		System.out.println("26");
		System.out.println(a.toUpperCase());
		
		System.out.println("27");
		//System.out.println(a.toUpperCase(null));
		
		System.out.println("28");
		String s = String.join(b,a,c);
		System.out.println(s);
		
		System.out.println("30");
		String R=String.join(c,a,b);
		System.out.println(R);
		

		System.out.println("31");
        System.out.println(a==b);	
        
        System.out.println("32");
        System.out.println(!(a==b));
		}

}
