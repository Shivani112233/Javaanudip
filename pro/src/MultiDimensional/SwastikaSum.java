package MultiDimensional;

public class SwastikaSum {

	public static void main(String[] args) {
		int [][]mat  =  {{1,2,3,4,5} ,
				{6,7,8,9,10} ,
		        {11,12,13,14,15},
				} ;
		int sum1 = calculateSum1(mat);
        int sum2 = calculateSum2(mat);

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Absolute difference: " + Math.abs(sum1 - sum2));
    }
       
		int sum1  = 0 ;
		for ( int i =0  ;i<=mat.length/2 ;i++) {
			sum1  = sum1  + mat[i][0] ;
			
		}
		
		for (int i = 1 ; i<mat[0].length ; i++){
			sum1  = sum1  + mat[mat.length/2][i] ;
		}
		
		for (int i = mat.length/2+1 ; i<mat.length ; i++){
			sum1  = sum1  + mat[i][mat[0].length-1] ;
		}
		
		System.out.println(sum1);
		
		
		int sum2=0;
		for ( int i =0  ;i<=mat.length/2 ;i++) {
			sum1  = sum1  + mat[i][4] ;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}
	
