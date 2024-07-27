package hwork;
//Write a Java program to split a String into an array of
//substrings using the split() method.

public class Program5 {

	public static void main(String[] args) {
		String sd="i am gonna fight with u";
		
		
		String []df=sd.split(" ");
		System.out.println("split the element");
		for(String nn:df) {
			System.out.println(nn);
		}

	}

}
