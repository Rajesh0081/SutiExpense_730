package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar_Example {

	public static void main(String[] args) throws Exception {
		
		
		String month="August 2022";
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com/");  
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[3])[1]")).click();  //My trandactions
		
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();   // clicking From Date
		
		while(true) {
		String text=driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")).getText();
		
			if(text.matches(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='prev']")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'16')]")).click();
		
		

	}

}
