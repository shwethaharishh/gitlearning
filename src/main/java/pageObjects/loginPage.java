package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("");
	By password=By.cssSelector("");
	
	public loginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public WebElement getemail() {
		
		WebElement emaill=driver.findElement(email);
		return emaill;
	}
	
	public WebElement getpassword() {
		WebElement password1=driver.findElement(password);
		return password1;
	}
	

}
