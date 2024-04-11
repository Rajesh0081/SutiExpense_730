package TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_ex4 {
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a beforetest");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is a aftertest");
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
