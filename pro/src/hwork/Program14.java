package hwork;
//Java StringBuffer Program to Reverse a String
//Write a Java program to reverse a given string using StringBuffer.


public class Program14 {

	public static void main(String[] args) {
		String hj="hello this the java programming world";
		
		StringBuffer sb= new StringBuffer(hj);
		
		sb.reverse();
		
		
		
		System.out.println("reverse the string:" +sb.toString());
		
		

	}

}
