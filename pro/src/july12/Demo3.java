package july12;

import java.util.Iterator;
import java.util.Stack;

public class Demo3 {

	public static <E> void main(String[] args) {
		Stack<String> sr=new Stack<String>();
		sr.add("math");
		sr.add("english");
		sr.add("comp");
		sr.add("science");
		sr.add("sc");
		sr.add("moral");
		
		System.out.println("before removing");
		Iterator<E> iterator= (Iterator<E>) sr.iterator();
		
		
		while(iterator.hasNext()) 
			System.out.println(iterator.next() +" ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("after removing");
		sr.pop();
		
		sr.peek();
        Iterator<E> iterator1= (Iterator<E>) sr.iterator();
		
		
		while(iterator1.hasNext()) 
			System.out.println(iterator1.next() +" ");
		
	}

}
