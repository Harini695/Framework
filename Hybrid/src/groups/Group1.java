package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Group1 
{
@Test(groups= {"functional"})
public void Amazon() throws InterruptedException {

System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=guccibags");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
ele.sendKeys("guccibags");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).click();
Thread.sleep(2000);
}
@Test(groups= {"regression"})
public void youtube() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search')"));
	ele.sendKeys("who says you're not perfect");
	Thread.sleep(3000);
	ele.click();
	Thread.sleep(3000);
WebElement ele1=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
			ele1.click();
	Thread.sleep(3000);
	WebElement ele2=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
	ele2.click();
	Thread.sleep(3000);
	driver.close();
}
@Test(groups= {"sanity"})
public void insta() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromeodriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
	ele.sendKeys("guccibags");
	Thread.sleep(3000);
	WebElement ele1=driver.findElement(By.xpath("//input[@type='password']"));
	ele1.sendKeys("gcibgs123#");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='button']")).click();
driver.close();		

}
}


