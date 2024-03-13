package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Framework_constants implements Framework_Constant
{
public WebDriver driver;
public WebDriver driver1;
@BeforeMethod
public void Open_App() throws InterruptedException {
	System.setProperty(Key_Chrome, Value_Chrome);
	System.setProperty(Key_Gecko, Value_Gecko);
	driver=new ChromeDriver();
	
	
	driver1=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver1.get("https://www.google.co.in/");
	Thread.sleep(3000);

	
}
@AfterMethod
public void close() {
	driver1.close();
}
}
