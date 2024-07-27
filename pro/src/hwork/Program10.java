package hwork;

//Write a Java program to compare two Strings using the equals() method.

public class Program10 {

	public static void main(String[] args) {
		String e1="she is so smart";
		String e2="She is no smart";
		String e3="she is so lazy";
		String e4="she is so smart";
		
		boolean lk=e1.equals(e2);
		System.out.println("campare the string e1 and e2:" +lk);
		
		boolean nj=e2.equals(e3);
		System.out.println("compare e2 and e3:" +nj);
		
		
		boolean jk=e1.equals(e3);
		System.out.println("compare e1 and e3:" +jk);
		
	   boolean yu=e4.equals(e1);
       System.out.println("compare e1 and e4 are equal:" +yu);
		
		
		
		boolean hy=e2.contentEquals(e4);
		System.out.println("compare contents" +hy);
	}

}
