package july19;

public class Demo5 {

	public static void main(String[] args) {
		Threader1 yh=new Threader1();
		Threader2 yhh=new Threader2();
		
		
		Thread t1=new Thread(yh);
		Thread t2=new Thread(yhh);
		
		
		t1.setName("rajeev");
		t2.setName("ranju");
		
		
		t1.start();
		t2.start();


	}

}
