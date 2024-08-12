package july23;

public class ThreadAA extends Thread{
	Common c;
    String name;

    // Constructor to initialize Common instance and name
    public ThreadAA(Common common, String name) {
        this.c = common;
        this.name = name;
    }

    // Override the run method to call fun1 of the Common instance
    @Override
    public void run() {
        c.fun1(name);
    }
}
