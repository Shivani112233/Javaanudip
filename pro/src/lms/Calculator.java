package lms;

public class Calculator {
    
	//method for sum 2 and 3
	public static int sumadd(int a,int b) {
		return a+b;
	}
	
	//method for double three variables
	public static double sumdouble(double d,double e, double f) {
		return d+e+f;
	}
	
	//method for calculati8ng array sum
	public static int sum(int[]arr) {
		int sum=0;
		for (int num : arr) {
            sum += num;
        }
        return sum;
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Sum 2 and 3: " + Calculator.sumadd(2, 3));//print sum of 2 and 3
		
		System.out.println("Sum 1.2, 2.3 ,3.4 :" + Calculator.sumdouble(1.2, 2.3, 3.4));//print double three variables sum
		
		
		int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array {1, 2, 3, 4, 5}: " + Calculator.sum(arr));//print array of the element to do sum
    }
	}


