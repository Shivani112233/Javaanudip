package july23;
import java.util.concurrent.*;
public class MyCallable implements Callable{
	int num;
	
	public MyCallable(int num) {//constructor to initialize num
	this.num = num;
	}
	
	@Override
	//call method calculates the sum of first num natural numbers
	public Object call() throws Exception {
		
	//print the name of the current thread and task which is performing by the current thread	
	System.out.println(Thread.currentThread().getName()+" .. is responsible to find the sum of first "+num+" numbers");
	int sum=0;
	
	//calculate the sum of the natural number
	for(int i=0;i<=num;i++){
	sum = sum+i;
	}
	return sum;
	}
	}
	
	
	

