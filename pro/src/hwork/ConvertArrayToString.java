package hwork;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		String s =Arrays.toString(arr);
		System.out.println("before coverting this array is  :");
		System.out.println(s);
		
		 s=s.replaceAll("", "");
		 System.out.println("After converting this array is :");
		 s= s.replaceAll(",", "");
		System.out.println(s);

	}

}
