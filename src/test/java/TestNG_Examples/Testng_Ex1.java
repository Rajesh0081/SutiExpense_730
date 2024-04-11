package TestNG_Examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng_Ex1 {
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is before suite method");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is after suite method");
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
