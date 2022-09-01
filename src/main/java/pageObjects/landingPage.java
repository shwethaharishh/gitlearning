package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("");
	
	public landingPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public WebElement getlogin() {
		
		WebElement login=driver.findElement(signin);
		return login;
	}

}
