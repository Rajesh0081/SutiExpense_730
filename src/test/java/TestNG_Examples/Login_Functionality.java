package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Functionality {
	public WebDriver driver;
	
	
	@BeforeClass
	public void launch() {
		 driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void verifytitle() {
		String text=driver.getTitle();
		System.out.println("text");
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}

}
