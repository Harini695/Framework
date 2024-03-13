package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import util.Property_filesc1;

public class Baseclass extends Property_filesc1
{
public WebDriver driver;
@BeforeMethod
public void login() throws FileNotFoundException, IOException
{
	System.setProperty("webdriver.chrome.driver", "./hybrid software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Property_filesc1.fetchProperty());
	}
@AfterMethod
public void closeapplication(ITestResult res) throws IOException
{
//	listener class to listen if tcfails take screenshot
	if(ITestResult.FAILURE==res.getStatus()) 
	{
//		takes screenshot
		Capturescreenshot.get_photo(driver);	
	}
	driver.close();

	 
	
}
}
