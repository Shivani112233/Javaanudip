package Collection;

import java.util.HashSet;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("shivani");
		hs.add("rakhi");
		hs.add("raju");
		hs.add("rakhi");
		hs.add("raja");
		hs.add("shivani");
		hs.add("shivani");
		hs.add("shivani");
		
		for(String rt:hs) {
			System.out.println(rt);
		}
		
		
	}

}
