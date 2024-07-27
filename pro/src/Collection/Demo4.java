package Collection;

import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> pp =new Vector<String> ();
		pp.add("mango");
		pp.add("guava");
		pp.add("apple");
		pp.add("banana");
		pp.add("lichi");
		pp.add("grapes");
		pp.add("papaya");
		
		System.out.println("size of the element are");
		int len=pp.size();
		System.out.println(len);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("printing all elements");
		for(String ll:pp) {
			System.out.println(ll);
		}

	}
}


