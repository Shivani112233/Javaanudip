package practise;

public class TestDemo {

	public static void main(String[] args) {
		 RunnableDemo2 R1 = new RunnableDemo2( "Thread-1");
	      R1.start();
	      
	      RunnableDemo2 R2 = new RunnableDemo2( "Thread-2");
	      R2.start();
	      
	      RunnableDemo2 R3 = new RunnableDemo2( "Thread-3");
	      R3.start();


	}

}
