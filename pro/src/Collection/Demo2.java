package Collection;

import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("manshi");
		arr.add("rekha");
		arr.add("reshma");
		arr.add("shivani");
		arr.add("rashi");
		
		
		System.out.println("before removing element");
		for(String i:arr) {
			System.out.println(i);
		}
		
		arr.remove(0);
		arr.remove(arr.size()-1);
		System.out.println();
		System.out.println("after removing ");
		
		for(String i:arr) {
			System.out.println(i);
		}
	}

}
