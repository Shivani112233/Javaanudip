package hwork;

public class Program16 {

	
	public static void main(String[] args) {
		String h="Hello world";
		
		//convert it into lowercase
		String k=h.toLowerCase();
		
	boolean hu=h.contains(k);
		if(h.contains(k)){
			System.out.println("string contains vowels");
		}
		else {
			System.out.println("does not contain vowels");
		}
		
		

	}
	
	public static boolean checkForVowels(String str)
	{
		for(int i=0;i<str.length(); i++) {
			char ch=str.charAt(i);
			
				return true;
				
			}
		}
		return false;
		
	}

}
