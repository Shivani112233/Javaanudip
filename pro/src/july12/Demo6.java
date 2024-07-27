package july12;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo6 {
// it will allow insertion order
	//it will allow order k sath sth unique value v ho ra h
	//it allow only single null value
	public static <E> void main(String[] args) {
		LinkedHashSet <String> dr= new LinkedHashSet<String>();
		dr.add("reena");
		dr.add("seu");
		dr.add("yuuu");
		dr.add("jkkl");
		dr.add("null");
		dr.add("null");
		dr.add("reena");
		dr.add("reena");
		
		System.out.println("Linkedhashset values are");
		 Iterator<E> iterator= (Iterator<E>) dr.iterator();
			
			
			while(iterator.hasNext()) 
				System.out.println(iterator.next() +" ");
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Treeset value");
		//it will not allow  any single null value
			TreeSet <String> yu=new TreeSet<String>();
			yu.add("rehman");
			yu.add("raj");
			yu.add("ty");
			yu.add("78");
			
         Iterator<E> iterator1= (Iterator<E>) yu.iterator();
			
			
			while(iterator1.hasNext()) 
				System.out.println(iterator1.next() +" ");
			
		
			
			

	}

}
