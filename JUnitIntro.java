package JUnitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	/*
	 * JUnit is a testing framework.
	 * 
	 * It is an open source automated testing framework
	 * @BeforeClass: Method with this annotation will run before first test method in current class
	 * @AfterClass: Method with this annotation will run after last test method in current class
	 * @Before: Method with this annotation will run before each method
	 * @After: Method with this annotation will run after each method
	 * @Test: The annotated method is a part of a test case
	 */
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class..");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before each method..");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after each method..");
	}

	@Test
	public void test() {
		System.out.println("Executed test1...");
	}
	@Test
	public void test2() {
		System.out.println("Executed test1...");
	}
}
