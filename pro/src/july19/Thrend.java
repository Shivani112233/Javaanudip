package july19;

public class Thrend implements Runnable{
	int sum;
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<10; i++){
			System.out.println("inside the thread");
			sum=sum+i;
		}
	}
	
	public static void main(String[] args) {
		Thrend th=new Thrend();
		Thread t=new Thread(th);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result=th.sum;
		for(int i=0;i<10;i++) {
			System.out.println("inside main method");
			System.out.println(result);
			
		}
	}

}
