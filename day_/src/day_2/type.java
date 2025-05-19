package day_2;

//Java program to Illustrate Explicit Type Conversion

//Main class
public class type {

	// Main driver method
	public static void main(String[] args) {

		// Double datatype
		double d = 100.04;

		// Explicit type casting by forcefully getting
		// data from long datatype to integer type
		long l=(long)d;
		int i=(int)l;
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
	}
}