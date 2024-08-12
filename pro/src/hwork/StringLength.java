package hwork;

public class StringLength {

	public static void main(String[] args) {
		 String input = "Shivani";

	        // Calculate the total number of characters excluding spaces and commas
	        int count = countCharacters(input);

	        // Print the result
	        System.out.println("Total number of characters (excluding spaces and commas): " + count);
	    }

	    public static int countCharacters(String input) {
	        int count = 0;

	        // Iterate through each character in the string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            // Increment count if the character is not a space or comma
	            if (ch != ' ' && ch != ',') {
	                count++;
	            }
	        }

	        return count;

}
}
