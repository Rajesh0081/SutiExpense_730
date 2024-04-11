package WebDriver_Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Example2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		/*
		 * Alert alt=driver.switchTo().alert(); 
		 * //alt.accept();
		 * 
		 * alt.dismiss();
		 */
		
		driver.switchTo().alert().dismiss();

	}

}
