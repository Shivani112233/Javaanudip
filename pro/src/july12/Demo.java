package july12;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static  <E> void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("date");
		a.add("elderberry");
		
		Iterator<E> iterator= (Iterator<E>) a.iterator();
		System.out.println("fruits name");
		
		while(iterator.hasNext())
			System.out.println(iterator.next() +" ");
		
		

	}

}
