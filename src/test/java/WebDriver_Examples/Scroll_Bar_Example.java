package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Bar_Example {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,-500)", "");
	}

}
