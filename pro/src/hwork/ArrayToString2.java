package hwork;

import java.util.Arrays;

public class ArrayToString2 {
	public String Convert_Array(int[]arr) {
		String s1=Arrays.toString(arr);
		String s2=s1.replaceAll("", "");
		String s3= s2.replaceAll(",", "");
		return s3;
		
	}
	
	
	public static void main(String[] args) {
		int[]arr= {1, 2, 3, 4, 5};
		ArrayToString2 c=new ArrayToString2();
		System.out.println("After converting : " +c.Convert_Array(arr));
		
	}
}
    