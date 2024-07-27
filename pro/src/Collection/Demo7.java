package Collection;

import java.util.Stack;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> sr=new Stack<Integer>();
		sr.push(1);
		sr.push(2);
		sr.push(3);
		sr.push(12);
		sr.push(14);
		sr.push(118);
		sr.push(20);
		sr.push(40);
		sr.push(34);
		sr.push(45);
		
		
		
		System.out.println("print stackpush operation");
		for(Integer ty:sr) {
			System.out.println(ty);
		}
		System.out.println("--------------------------------------------------------------");
		
		sr.pop();
		for(Integer ty:sr) {
			System.out.println(ty);
		}
		System.out.println("------------------------------------------------------------");

		Integer in=sr.peek();
		System.out.println("print " +in);
		for(Integer ty:sr) {
			System.out.println(ty);
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		boolean result=sr.isEmpty();
		System.out.println("stack is empty" +result);
		
		sr.clear();
		for(Integer ty:sr) {
			System.out.println(ty);
		}
		
		
		
		
	}

}
