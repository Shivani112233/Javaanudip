package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo9 {

	

	public static void main(String[] args) {
		ArrayList <Integer> ff=new ArrayList<Integer>();
		ff.add(56);
		ff.add(20);
		ff.add(76);
		ff.add(43);
		ff.add(89);
		
		//print the original array list
		System.out.println("print original array");
		for(Integer rr:ff) {
			System.out.println(rr);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		//sort the arraylist in ascending order
		System.out.println("sort the element ");
		Collections.sort(ff);
		
		//print the sorted array list
		System.out.println(ff);
		
		System.out.println("---------------------------------------------------------------------------");
		//reverse the arraylist
		System.out.println("reverse the element ");
		Collections.reverse(ff);
		
		//print the reverse arraylist
		for(Integer rr:ff) {
			System.out.println(rr);
		}
		
		
		
		
		
		
		
		

	}

}
