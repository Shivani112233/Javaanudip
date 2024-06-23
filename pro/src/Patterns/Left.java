package Patterns;

public class Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	    *
//		   **
//		  ***
		//0 1 2 3 4
			
			// this loop is responsible row
			for (int i =5 ;i>0 ;i--) {
			
				// this loop is responsible for column 
				for (int j=0 ;j<5 ;j++) {
				 
					if(j< i-1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				 
				}
				System.out.println();
			}
			
			
			
		}

	}


