package july15;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		HashMap<String, Boolean> ft=new HashMap <String, Boolean>();
		ft.put("question1", true);
		ft.put("questrion2" , false);
		ft.put("questrion3" , true);
		ft.put("questrion4" , false);
		ft.put("questrion5" , true);
		
		for(Entry<String, Boolean> ee: ft.entrySet()) {
			System.out.println(ee.getKey() +"-----------------" +ee.getValue());
		}
		
		
		

	}

}
