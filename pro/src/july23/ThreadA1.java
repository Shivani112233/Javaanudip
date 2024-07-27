package july23;

public class ThreadA1 extends Thread {
	A a1;
	B b1;
	
	
	public ThreadA1(A a12, B b12) {
		// TODO Auto-generated constructor stub
		this.b1=b12;
		this.a1=a12;
	}

	
	public void run() {
	a1.funA(b1);
	}
	}

