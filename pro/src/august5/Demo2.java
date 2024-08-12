package august5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list= new  ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		List<Integer> list2 = list.stream()
				              .filter(s -> s%2 !=0)
				              .map(s -> s+5)
				              .collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
