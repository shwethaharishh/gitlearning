package frameworkpractice.seleniumframework;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assume;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;


public class homePage extends base {
	
	private static final String False = null;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeriver();
		log.info("driver is initialized");
		
	}
	
	
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String pass,String text) throws IOException
	{
		
		driver.get("http://qaclickacademy.com");
		landingPage home=new landingPage(driver);
		home.getlogin().click();
		loginPage lp=new loginPage(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(pass);
		System.out.println(text);
		Assume.assumeTrue(false);
		
		
	}
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[2][3];
		data[0][0]="";
		data[0][1]="";
		data[0][2]="";
		
		data[1][0]="";
		data[1][1]="";
		data[1][2]="";
		
	 return data;
		
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}

}
