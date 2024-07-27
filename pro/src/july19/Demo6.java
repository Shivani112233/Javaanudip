package july19;

public class Demo6 {

	public static void main(String[] args) {
		Thread2 th=new Thread2();
		Thread3 thy=new Thread3();
		Thread4 thj=new Thread4();
		

		th.start();
		thy.start();
		thj.start();
		
		for(int i=89; i<=99; i++) {
			System.out.println("inside main method" +i);
		}
	}

}
