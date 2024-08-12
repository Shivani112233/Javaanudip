package operation;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ArithmeticOperation {
	public static void main(String[] args) {
		//here we define two numbers to perform arithmetic operation
		int num1= 12;
		int num2= 2;
		
		// Create an ArrayList to store lambda expressions for each arithmetic operation
		ArrayList<BiFunction <Integer , Integer, Integer>> operations= new ArrayList<>();
		
		//add lambda Expression for each operation
		operations.add((a,b) -> a+b);//ADDITION
		operations.add((a,b) -> a-b);//SUBSTRACTION
		operations.add((a,b) -> a*b);//MULTIPLICATION
		operations.add((a,b) ->a/b);//DIVISION
		
		// Create an ArrayList to store the names of each operation
		ArrayList<String> operationame= new ArrayList<>();
		
		// Add the names of each operation
		operationame.add("Addition");
		operationame.add("Substraction");
		operationame.add("multiplication");
		operationame.add("Division");
		
		// Iterate through the operations and perform each one
		for(int i=0; i<operations.size(); i++) {
			// Get the current operation and its name
			BiFunction<Integer, Integer, Integer> op= operations.get(i);
			String  oname=operationame.get(i);
			
			// Apply the operation to num1 and num2
			int result= op.apply(num1, num2);
			
			//print the result
			System.out.println(oname  + " of " + num1 + " and " + num2 + " is  :" + result);
			
		}
		
}
}