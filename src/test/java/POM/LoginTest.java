package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login() throws Exception {
		
		LoginClass lp=new LoginClass(driver);
		Thread.sleep(3000);
		lp.setusename("rajeshv@sutisoft.in");
		lp.setpassword("test@1234");
		lp.clickSubmit();
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	

}
