package july19;

public class Prior extends Thread{
	public void run() {
		System.out.println("inside run method");
	}
	
	public static void main(String[] args) {
		Prior pl=new Prior();
		Prior pln=new Prior();
		Prior lm=new Prior();
		
		System.out.println("pl  1st thread priority:" +pl.getPriority());
		System.out.println("2nd thread priority:" +pln.getPriority());
		System.out.println("3rd thread priority: "+lm.getPriority());
		
		pl.setPriority(5);
		pln.setPriority(9);
		lm.setPriority(4);
		
	//m.setPriority(34);
		
		
		System.out.println("pl first Priority:" +pl.getPriority());
		System.out.println("pln is the 2nd priority:" +pln.getPriority());
		System.out.println("3rd thread priority:" +lm.getPriority());
		
		System.out.println("current executing thread:" +Thread.currentThread().getName());
	
		System.out.println("main thread execution : " + Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println("main thread priority: " +Thread.currentThread().getPriority());
		
		
		
		
	}


}
