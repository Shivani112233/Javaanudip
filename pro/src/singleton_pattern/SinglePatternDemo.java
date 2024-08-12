package singleton_pattern;

public class SinglePatternDemo {
	public static void main(String[] args) {
        // Get the single instance of the Logger class
        Logger logger = Logger.getInstance();

        // Log messages from different parts of the application
        logger.log("Application started.");
        doSomething(logger);
        doSomethingElse(logger);
        logger.log("Application finished.");

        // Write log messages to a file
        logger.writeLogToFile("log.txt");
    }

    // Method that uses the Logger instance
    private static void doSomething(Logger logger) {
        logger.log("Doing something...");
        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        logger.log("Done something.");
    }

    // Another method that uses the Logger instance
    private static void doSomethingElse(Logger logger) {
        logger.log("Doing something else...");
        // Simulate some work
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        logger.log("Done something else.");
    }
}


