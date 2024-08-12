package array_1;

import java.util.Scanner;//which is from in java.util package

public class SumOfAverage {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		//to take input from  the user from which size of the array element they want to store
		System.out.println("Enter the number of element in the array");
		
		int size=s.nextInt();
		
		//create an array of the specified size
		int []arr= new int [size];
		
		//get the element of the array from the user
		System.out.println("enter the element of the array");
		for(int i=0; i<size; i++) {
			System.out.println("Element" +(i+1)+ " :");
			 arr[i] =s.nextInt();
			 }
			 
			 
		// Calculate the sum of the elements in the array
			 int sum =0;
			 for(int t: arr) {
				 sum+=t;
			 }
			 
			//calculate the average of the elements in array 
			 int average =   (sum)/size;
			 
			 //printing the result of average and sum
			 System.out.println("sum of the elements are" +" :" +sum);
			 System.out.println("average of the elements are" +" :" +average);
			 
			
		}
	}


