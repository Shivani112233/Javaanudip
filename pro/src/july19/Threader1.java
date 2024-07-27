package july19;

public class Threader1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<40; i++){
			String tname=Thread.currentThread().getName();
			System.out.println(tname+"is running");
		}
		
	}

}
