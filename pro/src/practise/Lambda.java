package practise;

import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {
		ArrayList<Integer> rt=new ArrayList<Integer>();
		rt.add(1);
		rt.add(2);
		rt.add(3);
		rt.add(4);
		
		//using lambda expression to print the element in arrayalist
		
		rt.forEach(n ->	System.out.println(n));	
		
		//using lambda to print the even no in the list
		
		rt.forEach(n ->{
			if(n%2==0) {
				System.out.println(n);
			}
		});

	}

}
