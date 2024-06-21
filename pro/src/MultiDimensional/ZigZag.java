package MultiDimensional;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int original[][]= {{1 2 3 4 5}{6 7 8 9 1}{3 2 5 4 6}{7 8 9 1 2}}
		// Read dimensions
        System.out.print("Enter dimensions (rows columns): ");
        int rows = 4;
        int columns =5; 

        // Read numbers into a 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter numbers row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = int original[]
            }
        }

        // Output the matrix in zigzag order
        printZigzag(matrix, rows, columns);

     

    // Function to print matrix in zigzag order
    private static void printZigzag(int[][] matrix, int rows, int columns) {
        // Flag to indicate direction of traversal
        boolean forward = true;

        // Traverse through each row
        for (int i = 0; i < rows; i++) {
            // Depending on direction, print row forwards or backwards
            if (forward) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            forward = !forward; // Toggle direction for the next row
        }
    }

	}

}
