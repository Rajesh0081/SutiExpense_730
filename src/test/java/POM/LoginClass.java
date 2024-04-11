package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	public WebDriver driver;
	LoginClass(WebDriver driver){
		this.driver=driver;
	}
	
	
	//Locators
	
	By txt_Username=By.xpath("//input[@name='username']");
	By txt_Password=By.xpath("//input[@name='userpassword']");
	By txt_Submit=By.xpath("//button[@type='submit']");
	
	
	
	//actions
	
	public void setusename(String username)
	{
		driver.findElement(txt_Username).sendKeys(username);
	}
	public void setpassword(String userpassword ) {
		driver.findElement(txt_Password).sendKeys(userpassword);
	}
	public void clickSubmit() {
		driver.findElement(txt_Submit).click();
		
	}

}
