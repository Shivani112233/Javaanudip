package august1;
import java.util.Scanner;
import java.util.ArrayList;

public class Even {

	public static void main(String[] args) {
		//create an arraylist for storing integers
		ArrayList<Integer> yu= new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		
		//user how many numbers they want to input
		System.out.println("enter the number");
		int m= s.nextInt();
		
		//user input which populate the arraylist
		System.out.println("enter the elements");
		for(int i=0; i<m; i++) {
			yu.add(s.nextInt());//added the elements in arraylist
			
		}
		
		//calculated the sum of even numbers
		int sum=0;
		for(int u:yu) {
			if(u%2==0) {
				sum += u;
			}
		}
		
		//print the result
		System.out.println("the sum of the even number is" +sum);
	}
		

}
