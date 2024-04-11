package TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Ex3 {
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is a beforemethod");
	}
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is a aftermethod");
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
