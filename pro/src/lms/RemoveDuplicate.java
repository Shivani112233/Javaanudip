package removeduplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("shivani", "harshita", "shivani", "simran", "harshita", "rakhi");

        // Remove duplicates by collecting into a Set
		System.out.println("removing duplicate elements");
        Set<String> uniqueSet = strings.stream()
                                        .collect(Collectors.toSet());  // Collects the results into a Set

        // Convert the Set back to a List if needed
        List<String> uniqueStrings = uniqueSet.stream().collect(Collectors.toList());

        // Output the unique strings
        System.out.println("Unique Strings: " + uniqueStrings);
	}

	}


