package Day13;

import java.util.Scanner;

public class MaximumUsingGeneric {
	static Scanner scanner = new Scanner(System.in);	

	public static void main(String[] args) {
		System.out.println(" select choice \n 1.find maximum integer \n 2.find maximum float \n 3.find maximum using string \n 4.find maximum using generic");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: MaximumInteger();break;
		case 2: MaximumFloat();break;
		case 3: MaximumString(); break;
		case 4: MaximumGeneric();break;
		default:System.out.println("invalid input");
		}
	}

	static <T> void MaximumGeneric() {
		System.out.println("enter 3 input ");
		T aString = (T) scanner.next();
		T bString = (T) scanner.next();
		T cString = (T) scanner.next();
		if (((String) aString).compareTo((String) bString) > 0 && ((String) aString).compareTo((String) cString)> 0 ) {
			System.out.println(aString + " a is greatest");
		}else if (((String) bString).compareTo((String) cString)> 0) {
			System.out.println(bString + " b is greatest");
		}else {
			System.out.println(cString + " c is greatest");
		}
	}

	static void MaximumString() {
		System.out.println("enter 3 string ");
		String aString = scanner.next();
		String bString = scanner.next();
		String cString = scanner.next();
		if (aString.compareTo(bString) > 0 && aString.compareTo(cString)> 0 ) {
			System.out.println(aString + " a is greatest");
		}else if (bString.compareTo(cString)> 0) {
			System.out.println(bString + " b is greatest");

		}else {
			System.out.println(cString + " c is greatest");
		}	
	}  
	
	static void MaximumFloat() {
		System.out.println("enter 3 float digit ");
		Float aFloat = scanner.nextFloat();
		Float bFloat = scanner.nextFloat();
		Float cFloat = scanner.nextFloat();
		if (aFloat.compareTo(bFloat) > 0 && aFloat.compareTo(cFloat)> 0 ) {
			System.out.println(aFloat + " a is greatest");
		}else if (bFloat.compareTo(cFloat)> 0) {
			System.out.println(bFloat + " b is greatest");
		}else {
			System.out.println(cFloat + " c is greatest");
		}
	}

	static void MaximumInteger() {
		System.out.println("enter 3 integer digit ");
		Integer aInteger = scanner.nextInt();
		Integer bInteger = scanner.nextInt();
		Integer cInteger = scanner.nextInt();
		if (aInteger.compareTo(bInteger) > 0 && aInteger.compareTo(cInteger)> 0 ) {
			System.out.println(aInteger + " a is greatest");
		}else if (bInteger.compareTo(cInteger)> 0) {
			System.out.println(bInteger + " b is greatest");
		}else {
			System.out.println(cInteger + " c is greatest");
		}	
	}
}
