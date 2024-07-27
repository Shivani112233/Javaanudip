package july11;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello world this is java";
		String[] l = s.split(" ");
		System.out.println(l.length);

		
		for(int i=0;i<l.length;i++) {
			String reverse=l[i];
		}
        // Reverse the array of substrings
        String reversedString = "";
        for (int j = l.length - 1; j >= 0; j--) {
            reversedString += l[j];
            if (j > 0) {
                reversedString += " "; // Add space between words
            }
        }

        
	}

}
