package july16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashedMap {

	public static void main(String[] args) {
		int []arr= {1,2,4,5,6,3,2,1,4,6,3,1,1};
		LinkedHashMap<Integer, Integer> gh= new LinkedHashMap<Integer, Integer>();
		
		for(int c:arr) {
			if(gh.containsKey(c)) {
				gh.put(c, gh.get(c)+1);
				
			}else {
				gh.put(c, 1);
			}
		}
		

		for(Entry<Integer, Integer> ek: gh.entrySet()){
			System.out.println(ek.getKey()+ "---------------------->" +ek.getValue());
		}

	}

}
