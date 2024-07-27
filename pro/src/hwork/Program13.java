package hwork;

//Write a Java program to extract a substring from a String using the 
//substring() method.

public class Program13 {

	public static void main(String[] args) {
		String ty="ram is so intelligent";
		
		//start from index 4
		String tt=ty.substring(4);
		System.out.println("substring of the index:" +tt);
		
		
		//start from index 5 to index 15
		String kk=ty.substring(5, 15);
		System.out.println("substring are:" +kk);
		char j=ty.charAt(15);
		System.out.println(j);
		char kl=ty.charAt(14);
		System.out.println(kl);
		

	}

}
