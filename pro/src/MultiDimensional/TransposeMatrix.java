package MultiDimensional;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] mat = {{0,0, 0, 0 } ,//00,01,02,03
				         {1,1, 1, 1}, //10,11,12,13
				         {2, 2, 2,2 }};
		
		int col =mat[0].length;
		int row = mat.length;
		
		int[][]arr =new int[col][row];
		for(int i=0;i<mat.length;i++) {
			for (int j=0; i<mat[0].length; j++) {
				arr[j][i]=mat[i][j];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}