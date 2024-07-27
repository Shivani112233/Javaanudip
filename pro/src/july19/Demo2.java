package july19;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String thisThreadname=Thread.currentThread().getName();
		System.out.println(thisThreadname);
		
		
		Thres ss=new Thres();
		Thread  x =new Thread(ss);
		x.setName("raju");
		
		Thread  xy=new Thread(ss);
		xy.setName("tyui");
		x.start();
		xy.start();
		System.out.println(x.getPriority());
		System.out.println(xy.getPriority());
		
	

	}

}
