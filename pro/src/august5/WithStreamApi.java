package august5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list= new  ArrayList<>();
		list.add(new Product(1, "jeans1", 3500));
		list.add(new Product(2, "top", 300));
		list.add(new Product(3, "mixer", 1500));
		list.add(new Product(4, "tv", 3000));
		list.add(new Product(5, "iphone", 3500));
		list.add(new Product(6, "fridge", 3500));
		list.add(new Product(7, "car", 3200));
		
		List<Integer> listOfPrice = list.stream()
				                     .filter(p -> p.price>3000)
				                     .map(p ->(int) p.price)
                                     .collect(Collectors.toList());
		
		List<Integer> listOfPriceoo=new ArrayList<> ();
		Integer  totalSum = list.stream()
				.filter(p -> p.price>3000)
				.peek(l -> listOfPriceoo.add(l.price))
				.mapToInt(m-> m.price)
				.sum();
				
		System.out.println(totalSum);
		System.out.println(listOfPrice);
	}
	

}
