package maven.project.JUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class AnnotationTest {
	private ArrayList testList;
	
	@BeforeClass
	public static void oneExecuteBeforeAll() {
		System.out.println("@executebeforeall :oneExecuteBeforeAll");
	}
	
	@Before
	public void executeBeforeEach() {
		testList=new ArrayList();
		System.out.println("@executed : executebeforeeach");
	}
	
	@AfterClass
	public static void oneExecuteAfterAll() {
		System.out.println("@executed : oneexecutebeforeAll");
	}
	
	@After
	public void ExecuteAfterEach() {
		testList.clear();
		System.out.println("@ExecutedAfter: ExecutedAfterEach");
	}
	
	@Test
	public void emptyCollection() {
		assertTrue (testList.isEmpty());
		System.out.println("@empty : emptyCollection");
		
	}
	
	@Test
	public void OneItemCollection(){
		testList.add("oneItem");
		assertEquals(1, testList.size());
		System.out.println("@tem : oneItemCollection"); 
		
		
		
	}
	

}
