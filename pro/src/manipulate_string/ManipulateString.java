package manipulate_string;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ManipulateString {

	public static void main(String[] args) {
		// create an arraylist of the strings
		ArrayList<String> ars = new ArrayList<>();
		ars.add("My");
		ars.add("Name");
		ars.add("Is");
		ars.add("Shivani");

		// print the original strings
		System.out.println("original strings are:");
		printStrings(ars);

		// create lambda expression for each operation
		UnaryOperator<String> toUpperCase = s -> s.toUpperCase();//convert into uppercase
		UnaryOperator<String> toLowerCase = s -> s.toLowerCase();//convert into lowercase
		UnaryOperator<String> reverseString = s -> new StringBuilder(s).reverse().toString();//reverse the string

		// apply each operation to the string in ARRAYLIST
		System.out.println("UPPERCASE sTRING are :");
		applyOp(ars, toUpperCase);
		printStrings(ars);

		// reset the list for converting in lowercase string
	

		System.out.println("LowerCase Strings are :");
		applyOp(ars, toLowerCase);
		printStrings(ars);

		// reset the list for reverse strings
		
		System.out.println("Reversed Strigs are :");
		
		applyOp(ars, reverseString);
		printStrings(ars);

	}
	//Method to apply an operation to each strings in arrayList

	private static void applyOp(ArrayList<String> ars, UnaryOperator<String> toUpperCase) {
		for (int i = 0; i < ars.size(); i++) {
			ars.set(i, toUpperCase.apply(ars.get(i)));
		}

	}

//printing the string through for each loop
	private static void printStrings(ArrayList<String> ars) {
		for (String er : ars) {
			System.out.println(er);
		}

	}

}
