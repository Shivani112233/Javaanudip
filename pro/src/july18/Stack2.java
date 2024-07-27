package july18;

import java.util.Scanner;

class stack{
	int top = -1;
	int n=10;
	int a[] =new int[n];
	private Scanner sc;
	
	
	void push() {
		if(top==(n-1)) {
			System.out.println("overflow3");
		}
		else {
			System.out.println("enter data");
			int i= sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
		} }
		void pop() {
			if(top==-1) {
				System.out.println("underflow");
		}
			else {
				top=top-1;
				System.out.println("item deleted");
			}
	}
		void display() {
			System.out.println("items are:");
			for(int j=top;j>=0; j--) {
				System.out.println(a[j]);
			}
		}
		public void push(Scanner sc2) {
			// TODO Auto-generated method stub
			
		}
}
public class Stack2 {
	public static void main(String[] args) {
		int d;
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
		
		int l;
		do {
			System.out.println("PRESS 1 TO PUSH");
			System.out.println("PRESS 2 TO Pop");
			System.out.println("PRESS 3 TO DISPLAY");
			System.out.println("ENTER CHOICE");
			
			 d=sc.nextInt();	
			switch(d) {
			
			case 1 :{
				s.push(sc);
				break;
			}
			
			case 2 : {
				s.pop();
				break;
			}
			
			case 3 :{
				s.display();
				break;
			}
			} System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU");
			
			System.out.println("ENTER ANY KEY TO EXIT");
			
			
			l=sc.nextInt();
		}
		while(l==0);
		System.out.println("exit successfully");
			
		
		
		
		
		
		
		
		
		
		
		
		
		}}

	
			
	
	
	

	

