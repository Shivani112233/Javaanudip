package Collection;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> av=new ArrayList<Double>();
		av.add(52.00);
		av.add(45.76);
		av.add(32.24);
		av.add(67.12);
		av.add(56.22);
		av.add(12.22);
		av.add(10.34);

		int len=av.size();
		System.out.println("before removing element");
		for(Double d:av) {
			System.out.println(d);
		}
		
		
	}

}
