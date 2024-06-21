package Array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///{4,6,7,6,5,3,9,23}
		
		int []qq = {4,6,7,6,5,3,9,23};
		int k = 13;
		System.out.println("number is");
		for(int i=0;i<qq.length;i++) {
			for(int j=i+1; j<qq.length;j++) {
				if((qq[i]+qq[j]) ==k) {
					System.out.println(qq[i] +"   "+qq[j]);
					break;
				}
			}
		}
		
		

	}

}
