package singleton_pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
//Logger class that implements the Singleton Pattern
public class Logger {
	// Private constructor to prevent external instantiation
	private Logger() {
	}
	// Private static instance of the Logger class
	private static Logger instance=null;
	
	// Private list to store log messages
	private ArrayList<String> msg= new ArrayList<>();
	
	// Public method to get the single instance of the Logger class
	 public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }
	// Public method to log a message
	 public void log(String message) {
	        msg.add(message);
	    }

	    // Public method to write log messages to a file
	    public void writeLogToFile(String filename) {
	        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
	            for (String message : msg) {
	                writer.println(message);
	            }
	        } catch (IOException e) {
	            System.err.println("Error writing log to file: " + e.getMessage());
	        }
	    }	    

}
