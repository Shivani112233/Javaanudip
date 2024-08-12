package input_mismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchHandle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=0;
		
		while(true) {
			try {
			System.out.println("enter an Integer value : ");
			n=s.nextInt();
			break;//loop exit if the input is invalid
			
		}catch(InputMismatchException e) {
			System.out.println("invalid input occured...  enter the new integer value");
			
			s.next();//take the invalid input 
		}
			
		}
		
		
	//printing that integer value which is given by the user	
		System.out.println("entered integer is : " +n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
