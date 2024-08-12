package august5;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamApi {
	public static void main(String[] args) {
		List<Product> list= new  ArrayList<>();
		list.add(new Product(1, "jeans1", 3500));
		list.add(new Product(2, "top", 300));
		list.add(new Product(3, "mixer", 1500));
		list.add(new Product(4, "tv", 3000));
		list.add(new Product(5, "iphone", 3500));
		list.add(new Product(6, "fridge", 3500));
		list.add(new Product(7, "car", 3200));
		
		//tell me about the price who is above in 3000
		ArrayList<Integer> ss=new ArrayList<>();
		for(Product p: list) {
			if(p.price>3000) {
				ss.add((int) p.price);
				
			}
		}
		
		System.out.println(ss);
		
	}
	

}
