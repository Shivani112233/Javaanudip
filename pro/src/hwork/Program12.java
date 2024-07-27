package hwork;
//Write a Java program to count the number of occurrences of a specific 
//character in a String.

public class Program12 {



	

	public static void main(String[] args) {
		
		String ty="sita is a beautiful girl";
		char ch='i';
		
		int count= CountOccurance(ty,ch);
		
		System.out.println("the character '" +ch+ " 'appears " +count+ " 'times in the string");
		
		
		
	}

	private static int CountOccurance(String ty, char ch) {
		int count=0;
		String str ="sita is a beautiful girl";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
                count++;
            }
			
		}
		
		return count;
	}

	
	}


