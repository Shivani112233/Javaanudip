package hwork;
//Write a Java program to compare two Strings ignoring case using the
//equalsIgnoreCase() method.

public class Program11 {

	public static void main(String[] args) {
		String op="she is so intelligent";
		String yu="SHE IS SO INTELLIGENT";
		
		boolean f= op.equalsIgnoreCase(yu);
		System.out.println("compare ignorecase:" +f);
		

	}

}
