package hwork;
//write a Java program to insert a string at a specific position in another string
//using StringBuffer.
//Input: str = "HelloWorld", insertStr = "Beautiful", pos = 5
//Output: HelloBeautifulWorld
public class Program15 {

	public static void main(String[] args) {
		String ty="hello this is the hello world";
		String insrt=" of java programming";
		int pos=29;
		
		StringBuffer df=new StringBuffer(ty);
		df.insert(pos, insrt);
		
		System.out.println("the inserted string are :" +df.toString());
		


	}

}
