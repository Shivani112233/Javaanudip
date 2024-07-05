package lms;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		
		        int[] arr = {12, 2, 15};
		        int[] arr2 = {3, 0, 3};

		        for (int i = 0; i < arr.length; i++) {
		            try {
		                int result = arr[i] / arr2[i];
		                System.out.println("Result of " + arr[i] + " / " + arr2[i] + " = " + result);
		            } catch (ArithmeticException e) {
		                System.out.println(e);
		        }
		    }
		
	}}


