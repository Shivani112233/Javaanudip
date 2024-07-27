package Collection;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> a=new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("date");
		a.add("elderberry");
		System.out.println(a);
		
		
		a.remove(a.size()-3);
		System.out.println();
		System.out.println("removing element");
		for(String i:a) {
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("aFTER ADDING ELEMENT");
		a.add(2,"fig");

		for(String i:a) {
			System.out.println(i);
		}
	}

}
