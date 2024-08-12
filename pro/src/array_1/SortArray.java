package array_1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// to take input from the user from which size of the array element they want to
		// store
		System.out.println("Enter the number of element in the array");

		int size = s.nextInt();

		// create an array of the specified size
		int[] arr = new int[size];

		// get the element of the array from the user
		System.out.println("enter the element of the array");
		for (int i = 0; i < size; i++) {
			System.out.println("Element" + (i + 1) + " :");
			arr[i] = s.nextInt();
		}
		
		// Sort the array in ascending order using Arrays.sort()
        Arrays.sort(arr);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
		

	}

}
