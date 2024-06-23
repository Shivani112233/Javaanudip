package Patterns;

public class RightAngleHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n  = 5  ;

		
		
	// * * * * 
    // *     *
	// *     *
	// * * * *  dry run 
		for (int i=1 ;i<=4 ; i++) {
			
			if(i == 1  || i == 4) {
			 
				for (int j=1 ;j<=4 ; j++) {	
					System.out.print("* ");
				}
			}else {
				for (int j=1 ;j<=4 ; j++) {	
					if(j == 1 ||  j== 4) {
					System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}
	}


