package july23;

public class Common1 {
	// synchronized to ensure only one thread can access this method at a time
    public synchronized void fun1(String name) {
        System.out.println("Welcome");
        try {
            // Sleep for 3 seconds 
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the name after the sleep
        System.out.println(name);
    }
}

