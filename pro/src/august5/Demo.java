package august5;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {
	//functional interface
	//anonymous class
	//anonymous function
	//method reference
	// type of functional interface
	//lambda expression
	
	
	//stream API is a just pipeline of a code is used to collection of objects 
	//consumer is a functional interface type of method which accept () and does not return any value
	
	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(12);
		nums.add(13);
		nums.add(145);
		nums.add(22);
		nums.add(72);
		nums.add(5);
		
		//stream data can be used only one time  at 
		Stream s= nums.stream();
		s.forEach(x  -> System.out.println(x));//i am using this statement stream once
		
		//s.collect()
		Functionimpl gg=new Functionimpl();
		
		Stream <Integer>s2= nums.stream(); //storing object kind od data
		s2.map(x -> x).forEach(x  -> System.out.println(x));//map is used to functional data
	}

	
}
