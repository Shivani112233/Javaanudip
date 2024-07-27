package july12;

import java.util.Iterator;
import java.util.Vector;

public class Demo2 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> pp =new Vector<String> ();
		pp.add("reena");
		pp.add("rakhi");
		pp.add("shivu");
		pp.add("neha");
		pp.add("rakhi");
		pp.add("rahul");
		pp.add("mohan");
		
		Iterator<E> iterator= (Iterator<E>) pp.iterator();
		
		
		while(iterator.hasNext()) 
			System.out.println(iterator.next() +" ");

	}

}
