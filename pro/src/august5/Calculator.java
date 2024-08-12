package august5;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int c;
		do {
		
			System.out.println("Menu are");
			System.out.println("1-  Addition\n 2- Substraction\n 3-Multiplication\n 4 -Division\n  5- Exit");
			
			
			System.out.println("enter the choices are");
			System.out.println("enter the first number");
			int  num1=s.nextInt();
			System.out.println("enter the second  number");
			int num2=s.nextInt();
			c=s.nextInt();
			switch(c) {
			case 1 :
			System.out.println("result" +(num1+num2));
			break;
			
			
			case 2 :
			System.out.println("result" +(num1-num2));
			break;
			
			
			case 3 :
			System.out.println("result" +(num1*num2));
			break;
			
			
			
            case 4 :
			System.out.println("result" +(num1/num2));
			break;
			
			
			case 5 : {
            	System.out.println("exit the program. Goodbye!");}
            break;
            
            default : 
            	System.out.println("choose the r8 option");
            break;
			}
		}while(c!=5); 
				
			}

			
			
			
			
			
			
			
		}
		
		
	

		
		
		
	

