package MultiDimensional;

public class CountDigit {
	
	public static void main(String[] args) {
		int n;

        // Initialize an array to store the elements
		 String[] array = new String[n];

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
		array[i]=
        }

        // Array to store results
        int[] results = new int[n];

        // Calculate number of digits for each element
        for (int i = 0; i < n; i++) {
            String element = array[i];
            int digitCount = countDigits(element);
            results[i] = digitCount;
        }

        // Output the results in the required format
        for (int i = 0; i < n; i++) {
            System.out.print(results[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

       
    }

    // Function to count digits in a string
    private static int countDigits(String str) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (Character.isDigit(str.charAt(j))) {
                count++;
            }
        }
        return count;
    }


	}


