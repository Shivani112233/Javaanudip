package practise;

public class RunnableDemo implements Runnable{
	private  Thread t;
	private String threadName ;
	
	

	RunnableDemo(String name){
		threadName=name;
		System.out.println("creating thraead" +threadName);
	}
	
	
	
	@Override
	public void run() {
		System.out.println("running the thread" +threadName);
		try {
			for(int i=4; i>0; i--) {
				System.out.println("threads are" +threadName+ " ," +i);
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("thread are " +threadName+ "interuppted");
			e.printStackTrace();
		}
		System.out.println("theread" +threadName+ "exiting the thread");
		
	}
	
	public void start() {
		System.out.println("thread are starting" +threadName);
		if(t==null) {
			t=new Thread(this, threadName);
			t.start();
					
		}
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


