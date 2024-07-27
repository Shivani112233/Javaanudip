package july19;

public class ThreadNn implements Runnable{

	@Override
	public void run() {
		 for(int i=30; i<90; i++) {
				System.out.println(i + "main method");
			}

		
	}
	

	public static void main(String[] args) {
		ThreadNn nn=new ThreadNn();
		Thread sec=new Thread();
		
		
		
	}
}
