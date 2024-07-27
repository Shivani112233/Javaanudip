package july19;

public class Sleepmt implements Runnable{

	@Override
	public void run() {
		for( int i=0; i<10; i++) {
			System.out.println(+i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("end of run()......");
	}
	
	
	public static void main(String[] args) {
		Sleepmt my=new Sleepmt();
		Thread t=new Thread(my);
		
		t.start();
		
		System.out.println("end of main().......");
		
	}
}
