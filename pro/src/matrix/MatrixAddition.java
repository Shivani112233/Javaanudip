package matrix;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//get  matrices are 
		System.out.print("enter the rows of the matrices");
		int rows=s.nextInt();
		System.out.print("enter the column of matrices");
		int column=s.nextInt();
		
		//the first matrix are
		Integer[][] matrix1=new Integer[rows][column];
		System.out.println("enter the elemnts of first matrix");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Element[" +i+"]["+j+"] : ");
				matrix1[i][j]=s.nextInt();
			}
		}
		
		//the second matrix are
		Integer[][]matrix2=new Integer[rows][column];
		System.out.println("enter the element of second matrix");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Elment["+i+"] ["+j+"]: ");
				matrix2[i][j]=s.nextInt();
			}
		}
		
		//matrix addition are
		Integer[][] result=new Integer[rows][column];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				result[i][j]= matrix1[i][j]+ matrix2[i][j];
			}
		}
		
		
		//displaying the result matrix are
		System.out.println("result of the matrix are:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(result[i][j] +" ");
			}
		}
		
		System.out.println();
		
		
		
		

	}

}
