package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Window {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		driver.navigate().refresh();
		
		

	}

}
