package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_EX5 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is before suite method");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a beforetest");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a beforeclass");
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is a beforemethod");
	}
	
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is a aftermethod");
	}
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is after suite method");
	}
	

	
	@AfterTest
	public void aftertest() {
		System.out.println("This is after test method");
	}
	

	@Test
	public void m() {
		System.out.println("This is a main method");
	}
	
	
	@AfterClass
	public void aftetClass() {
		System.out.println("This is afterClass method");
	}

}
