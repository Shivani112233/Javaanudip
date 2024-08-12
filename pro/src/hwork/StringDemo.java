package hwork;

public class StringDemo {

	public static void main(String[] args) {
		String a="shivani";
		String b="kumari";
		System.out.println("before swapping");
		System.out.println("the value of a is :" +a);
		System.out.println("the value of b is :" +b);
		
		//1.we have to append a and b;
		a=a+b;
		
		//2.store initial string a in string b;
		b=a.substring(0, a.length()-b.length());
		
		//3.store initial string b in string a;
		a=a.substring(b.length());
		
		System.out.println("the value of a and b after swapping");
		
		System.out.println("the value of a is :"  +a);
		System.out.println("the value of b is :"  +b);

	}

}
