package july12;

public class Demo7 {
	private static String[] strs;


	public static String Demo7(String [] strs) {
		if(strs==null || strs.length==0) {
			return" ";
			
		}
		return prefix;
		
		
		
	}

	
	
	static String prefix = strs [0];{
	for (int i = 1; i < strs.length; i++) {
        String currentStr = strs[i];
        int j = 0;
        
        // Compare characters of the current prefix and the current string
        while (j < prefix.length() && j < currentStr.length() && prefix.charAt(j) == currentStr.charAt(j)) {
            j++;
        }
        
        // Reduce the prefix to the matched portion
        prefix = prefix.substring(0, j);
        
        // If the prefix becomes empty, there's no common prefix
        if (prefix.isEmpty()) {
          
        }
	}
    
   
	}


public static void main(String[] args) {
    String[] strs = {"flower", "flow", "flight"};
    String result = Demo7(strs);
    System.out.println("Input: strs = [\"flower\", \"flow\", \"flight\"] Output: " + result);
}
}
	



