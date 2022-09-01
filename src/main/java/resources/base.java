package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	
	public WebDriver initializeriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\20069788\\eclipse-workspace\\seleniumframework\\src\\main\\java\\frameworkpractice\\seleniumframework\\data.properties");
		prop.load(fi);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			//
		}
		else if(browsername.equals("IE")) {
			//
		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
public void getScreenshot(String TestcaseName,WebDriver driver) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+TestcaseName+".png";
	FileUtils.copyFile(source, new File(destinationFile));
	
}
}
