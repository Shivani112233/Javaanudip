package lms;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		
		        //check the condition
		        int[] indexes = {3, 6, -2};

		        for (int index : indexes) {
		            try {
		                System.out.println("Element at index " + index + ": " + arr[index]);
		            } catch (ArrayIndexOutOfBoundsException e) {
		                System.out.println(e);
		            }
		        }
	}

}
