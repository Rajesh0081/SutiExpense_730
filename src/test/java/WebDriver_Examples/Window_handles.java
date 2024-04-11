package WebDriver_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_handles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com/");  
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[7])[1]")).click();
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu border-radius-10px show']/li[1]")).click();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(parent);
		
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[6])[1]")).click();
	}

}
