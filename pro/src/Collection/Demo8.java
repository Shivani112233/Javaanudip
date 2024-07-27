package Collection;

import java.util.Vector;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> pp =new Vector<Integer> ();
		pp.add(10);
		pp.add(20);
		pp.add(30);
		pp.add(40);
		pp.add(50);
		
		//print the original array elements are
		System.out.println("original array element");
		for(Integer cf:pp) {
			System.out.println(cf);
		}
		
		//remove the elements in 30 in index 2
		System.out.println("remove the element ");
		pp.remove(2);
		for(Integer cf:pp) {
			System.out.println(cf);
		}
		
		//adding the value 35 in index 2
		System.out.println("---------------------------------------------------");
		System.out.println("modified vector");
		pp.add(2, 35);
		for(Integer cf:pp) {
			System.out.println(cf);}
		
		// checking the element 40 are in this vector or not
		System.out.println("-----------------------------------------------------------");	
		
		
		boolean rr=pp.contains(40);{
			System.out.println(rr);
		}
		
		// remove all element in this vector
		pp.removeAllElements();
		for(Integer cf:pp) {
			System.out.println(cf);}
		
		
		
		
		}
		
		

	

}
