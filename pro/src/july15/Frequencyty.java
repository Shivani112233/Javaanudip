package july15;

import java.util.HashMap;
import java.util.Map;

///count the frequency of character
public class Frequencyty {

	public static void main(String[] args) {
		//a-2 ,c-2 ,s-2 ,p-2
		String s= "ascassppc";
		
		//array  of char
		char[] arr=s.toCharArray();
		HashMap<Character,Integer> mp=new HashMap<Character, Integer>();
		///a -4
		//System.out.println(Arrays.toString(arr));
		///a scassppc
		for(char c:arr) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
				
			}else {
				mp.put(c, 1);
			}
		}
			
			for(Map.Entry<Character,Integer> ek: mp.entrySet()){
				System.out.println(ek.getKey()+ "------------------>" +ek.getValue());
			}
			
			
		}

		}

	


