package Array;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//34,56,34,23,5
		//0   1  2  2 4
		
		
		int [] arr=new int [5];
		System.out.println(arr.length);
		
		arr[0]=34;
		arr[1]=56;
		arr[2]=34;
		arr[3]=23;
		arr[4]=5;
		
		
		int[]newArray = {34,56,34,23,5};
		 for(int i =0 ;i<arr.length;i++){
				//ystem.out.println(arr[i]);
				 
				 if (arr[i] <17) {
					 System.out.println("you are passed by grace ");
					 arr[i] =  arr[i] + 5 ; //
				 }
				 
				 System.out.println(arr[i]); //46
			 }
                                                                                                                                                                                                                                                                                                                                                                                                              		   

	}

}
