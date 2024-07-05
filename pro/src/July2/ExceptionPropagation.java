package July2;

public class ExceptionPropagation {
	
	static void division() {
		int a=15/2; 
		System.out.println("before calling");
	}
	 public static void main(String[] args) {
		 M mm=new M();
		 mm.m();
		 
		 
	}


	class M1{
		static void c1() {
			 System.out.println("before solving");
			 try {
				 ExceptionPropagation.division();
				
			 }catch(ArithmeticException e) {
				 System.out.println(e);
			 }
		 }
	
	class M{
		void m() {
			System.out.println("thisa is before the callng of method1");
			M1.c1();
			System.out.println("this after calling m");
		}
	}
	 }
}
