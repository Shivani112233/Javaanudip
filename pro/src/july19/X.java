package july19;

public class X extends Thread {

	public void run() {
		for(int i=0; i<30; i++) {
		System.out.println(i + "second thread");	
		}
	}
}
