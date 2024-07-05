package July2;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []=null;
		
		try {
			arr=new int[1000];
			System.out.println("this is in try block done");
			System.out.println(arr[1001]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("this is catch block");
			System.out.println(e);
			
		}
		
		finally {
			System.out.println("this is finally block ");
		}
		System.gc();
		System.out.println("this printing garbage collection");

	}

}
