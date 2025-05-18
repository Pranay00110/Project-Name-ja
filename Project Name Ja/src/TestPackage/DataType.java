package TestPackage;

public class DataType {

	public static void main(String[] args) {

		//primitive data type
		
byte stdObtMarks = 100;          // value from -128 to 127        1byte  numeric & non-decimal
short stdMaxMarks = 500;         // value from -32,768 to 32,767  2byte        -//-
int stdRollNumber = 956811274;   // involve 9 number              4byte        -//-
long stdMobNumber = 1234567890L; // involve 10 number L mandatory 8byte        -//-

float percentage = 98.9289741259874585215F; // F mandatory involved 5no       4byte  numeric & decimal
double aggregate = 85.926845789520003752200; //            involved 11no      8byte   numeric & decimal

char stdGrade = 'A';
boolean StdPass = true;

System.out.println(stdObtMarks);
System.out.println(stdMaxMarks);
System.out.println(stdRollNumber);
System.out.println(stdMobNumber);
System.out.println(percentage);
System.out.println(aggregate);
System.out.println(stdGrade);
System.out.println(StdPass);
}
}
