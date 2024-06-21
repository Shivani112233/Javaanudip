package june14th;

public class counterimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        // Call the increment method on each object a few times
        for (int i = 0; i < 5; i++) {
            counter1.increement();
            counter2.increement();
            counter3.increement();
        }

        // Print the final value of count
        System.out.println("Final count value: " + Counter.getCount());
    }

	}

