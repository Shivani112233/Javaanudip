package july23;

public class ThreadB11 extends Thread{
	A a1;
	B b1;
	
	public ThreadB11(A a12, B b12) {
		this.b1=b12;
		this.a1=a12;
	}
	@Override
	public void run() {
	b1.funB(a1);
	}
	}

