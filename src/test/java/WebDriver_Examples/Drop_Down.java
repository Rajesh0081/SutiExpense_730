package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		Select lstbox=new Select(driver.findElement(By.id("oldSelectMenu")));
		//lstbox.selectByIndex(4);
		
		//lstbox.selectByValue("3");
		
		lstbox.selectByVisibleText("Voilet");
		
	}

}
