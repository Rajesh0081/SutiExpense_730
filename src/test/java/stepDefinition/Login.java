package stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	
	@Given("Open the SutiExpense Application")
	public void launch() {
		 driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@When("Typing Username and password")
	public void login() throws Exception {
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	
	@Then("Login page should be display")
	public void close() {
		driver.close();		
	}

}
