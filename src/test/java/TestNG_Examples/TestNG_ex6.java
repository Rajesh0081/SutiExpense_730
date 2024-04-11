package TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_ex6 {
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a beforetest");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is a aftertest");
	}
	
	
	@Test(enabled=false)
	public void test() {
		System.out.println("This is a main method");
	}
	
	@Test(dependsOnMethods = {"test3"})
	
	public void test2() {
		System.out.println("This is a method 2");
	}
	
	@Test(priority=12)
	
	public void test3() {
		System.out.println("This is a method 3");
	}
	

}
