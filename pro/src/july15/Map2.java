package july15;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		HashMap<String ,Integer> gh=new  HashMap<String ,Integer>();
		gh.put("shivani ", 90);
		gh.put("raj", 78);
		gh.put("rani", 89);
		gh.put("suraj",67);
		gh.put("sksham", 87);
		gh.put("banti", 59);
		
		
		for(Entry<String, Integer> ee: gh.entrySet()) {
			System.out.println(ee.getKey() +"--------------------->" +ee.getValue());
		}
		
	}

}
