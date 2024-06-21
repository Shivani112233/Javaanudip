package june14th;

public class Calculator {
	static int num1;
	static int num2;
	
	
	static {
		num1=12;
		num2=14;
	}
	
	public static void main(String[] args) {
		
		System.out.println("the number is" +Calculator.num1);
		System.out.println("the number2 is" +Calculator.num2);
	}

}
