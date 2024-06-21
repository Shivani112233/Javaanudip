package MultiDimensional;

public class RhombusTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated m
		int[] [] mat= {
				{1,2,3},
				{4,5,6},//1 2
				{7,8,9}//2 1
				
		};
		
		int r=mat.length;
		int c=mat[0].length;
		
		for(int i=r/2, j=c-1; i>=0&& j>=c/2;i--,j--) {
			System.out.print(mat[i][j]+" ");//6,2
		}
		for(int i=1, j=c/2-1;i<=r/2&&j>=0;i++,j--) {
			System.out.print(mat[i][j]+" ");//4
		}
		
		
		
		for(int i=r-1, j=c-2;i>=2&& j>=1; i++, j--) {
			System.out.print(mat[i][j]+" ");
		}

}
}
