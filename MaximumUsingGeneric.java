package Day13;

import java.util.Scanner;

public class MaximumUsingGeneric {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 3 digit ");
		Integer aInteger = scanner.nextInt();
		Integer bInteger = scanner.nextInt();
		Integer cInteger = scanner.nextInt();
		
//		int value1 = aInteger.compareTo(bInteger);
//		System.out.println(value1);
//		int value2 = aInteger.compareTo(cInteger);
//		if (value1 > 0 && value2 >0) {
//			System.out.println();
//		}else if {
//			
//		}
		if (aInteger.compareTo(bInteger) > 0 && aInteger.compareTo(cInteger)> 0 ) {
			System.out.println(aInteger + " a is greatest");
		}else if (bInteger.compareTo(cInteger)> 0) {
			System.out.println(bInteger + " b is greatest");

		}else {
			System.out.println(cInteger + " c is greatest");
		}
	}
}
