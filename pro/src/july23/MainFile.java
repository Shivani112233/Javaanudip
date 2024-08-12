package july23;

public class MainFile {

	public static void main(String[] args) {
		// Create a single instance of Common
        Common c = new Common();

        // Create two threads, passing the Common instance and different names
        ThreadAA threadA = new ThreadAA(c, "rakkhi" );
        ThreadBB threadB = new ThreadBB(c, "seema");

        // Start both threads
        threadA.start();
        threadB.start();

	}

}
