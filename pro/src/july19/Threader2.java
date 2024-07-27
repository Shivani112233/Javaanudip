package july19;

public class Threader2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<40; i++) {
			String tn=Thread.currentThread().getName();
			System.out.println(tn+ "second thread name");
		}
		
	}

}
