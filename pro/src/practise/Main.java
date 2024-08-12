package practise;

public class Main {

	public static void main(String[] args) {
		RunnableDemo rd=new RunnableDemo("Thread-1");
		rd.start();


		RunnableDemo rm=new RunnableDemo("Thread-2");
		rm.start();

	}

}
