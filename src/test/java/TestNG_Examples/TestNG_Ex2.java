package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Ex2 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a beforeclass");
	}
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is a afterclass");
	}
	
	
	@Test
	public void test() {
		System.out.println("This is a main method");
	}
	
	@Test
	
	public void test2() {
		System.out.println("This is a method 2");
	}
	

}
