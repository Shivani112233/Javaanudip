package Collection;

import java.util.Stack;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> sr=new Stack<String>();
		sr.add("math");
		sr.add("english");
		sr.add("comp");
		sr.add("science");
		sr.add("sc");
		sr.add("moral");
		
		System.out.println("before removing");
		for(String rr:sr) {
			System.out.println(rr);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("after removing");
		sr.pop();
		for(String rr:sr) {
			System.out.println(rr);
		}
	
		

	}

}
