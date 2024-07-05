//to create the array [10]and fill it table 23 then reverse it
//and then print anad convert the same array into 17 tables then print
//that table

package july4;

public class ArrayExample {

	public static void main(String[] args) {
		
	
	int[] arr = new int[10];

    // Fill the array with the table of 23
    for (int i = 0; i < arr.length; i++) {
        arr[i] = 23 * (i + 1);
    }

    System.out.println("table of 23");
    for(int value :arr) {
    	System.out.println(value);
    }
    //  Reverse the array
    int[] reverseArray = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        reverseArray[i] = arr[arr.length - 1 - i];
    }

    //  Print the reversed array
    System.out.println("Reversed array (Table of 23):");
    for (int value : reverseArray) {
        System.out.println(value);
    }

    // Convert the reversed array into the table of 17
    for (int i = 0; i < reverseArray.length; i++) {
        reverseArray[i] = 17 * (i + 1);
    }

    //  Print the array with the table of 17
    System.out.println("Array (Table of 17):");
    for (int value : reverseArray) {
        System.out.println(value);
    }
}
}
