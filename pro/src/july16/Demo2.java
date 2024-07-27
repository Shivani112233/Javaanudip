package july16;
//it follows ascending order.
//it does not allow null value.
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo2 {

	public static void main(String[] args) {
		String s="dfthuuoopuy";
		char[] arr=s.toCharArray();
		TreeMap<Character,Integer> mp=new TreeMap<Character, Integer>();
		for(char c:arr) {
			if(mp.containsKey(c)) {
				mp.put((char) c, mp.get(c)+1);
				
			}else {
				mp.put((char) c, 1);
			}
		}
		for(Entry<Character, Integer> ek: mp.entrySet()){
			System.out.println(ek.getKey()+ "---------------------->" +ek.getValue());
		}

	}

}
