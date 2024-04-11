package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example1 {
	

	public static void main(String[] args) {
		WebDriver driver;
		
	 driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("Alert is handled.............");
	}

}
