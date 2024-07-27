package maven.project.JUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest {
	  
	@Test
	    public void testAdd() {
	        System.out.println("adding value in calculator");
	        Calculator c= new Calculator();
	        //input value
	        int a=23;
	        int b=2;
	        int expected =25;
	        
	        //calling add method
	        
	        int result= c.add(a, b);
	        
	        assertEquals(expected,result);
	        
	        

}
}
