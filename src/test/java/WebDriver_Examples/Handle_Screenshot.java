package WebDriver_Examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Handle_Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		Thread.sleep(3000);
		
	TakesScreenshot tss =(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\dell\\Desktop\\730 Am screemsnhot.png");
	Files.copy(src, dest);
		
		

	}

}
