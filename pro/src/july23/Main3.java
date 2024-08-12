package july23;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//this the the array of my callable object with different values
		MyCallable[] jobs = {
				new MyCallable(5),
				new MyCallable(10),
				new MyCallable(15),
				new MyCallable(20),
				new MyCallable(25),
				new MyCallable(30),
				};
		
		//create an executer service with the fixed thread pool size 3 
				ExecutorService service=Executors.newFixedThreadPool(3);
				
				//iterate of each mycallable job through for-each loop
				for(MyCallable job:jobs){
				Future f= service.submit(job);
				System.out.println(f.get());
				}
				//shutdown the executer services 
				service.shutdown();
				}

	}


