package stringconcate;

import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {

	public static void main(String[] args) {
		//  list of strings
		System.out.println("cacatenation of string are:");
        List<String> strings = List.of("Good", "Morning", "This", "Is", "SHIVANI");

        // Concatenate the strings using the Stream API and method reference
        String res = strings.stream()
                               .collect(Collectors.joining(" ")); // You can specify any delimiter here

        // Print the result
        System.out.println(res);

	}

}
