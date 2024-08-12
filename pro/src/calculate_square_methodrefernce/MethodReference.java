package calculate_square_methodrefernce;


public class MethodReference {
	public static void main(String[] args) {
		//// Create a method reference to the static method calculateSquare
		SquareCalculate c= MethodReference::calculateSquare;
		
		//method refernce calculate the square of the number
		int res= c.cal(10);
		System.out.println("The square  of 10 is :" +res);
	}
	
	// Static method to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }
	
	

}
