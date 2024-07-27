package july12;

import java.util.HashSet;
import java.util.Iterator;

// it  allow only single value
//it doesn't allow duplicate value
//it doesn't maintain any insertion order
//it allow only unique value
public class Demo5 {

	public static <E> void main(String[] args) {
		HashSet<String> gg=new HashSet<String>();
		gg.add("rani");
		gg.add("rekha");
		gg.add("raju");
		gg.add("rani");
		gg.add("poja");
		gg.add("rani");
		gg.add("samay");
		gg.add(null);
		gg.add(null);
		gg.add(null);
		
       Iterator<E> iterator= (Iterator<E>) gg.iterator();
		
		
		while(iterator.hasNext()) 
			System.out.println(iterator.next() +" ");
		
		
	}

}
