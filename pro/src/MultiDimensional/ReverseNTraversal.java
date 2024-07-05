package MultiDimensional;

public class ReverseNTraversal {

	public static void main(String[] args) {
		
		int [] [] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9},};
		
		for (int i=0;i<= mat.length-1;  i++) {
			System.out.print(mat[i][0]+" ");//1 4 7
		}
		
		for (int i=1;i<mat.length-1; i++) {
			System.out.print(mat[i][i]+" ");//5
		}
		
		for (int i = 0; i <=mat.length-1; i++) {
            System.out.print(mat[i][mat[0].length-1] + " ");//3 6 9
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
