package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Basepage;

public class POM_fblogin extends Basepage

{
//declaration
	@FindBy(id="email")
	private WebElement UName;
	@FindBy(id="pass")
private WebElement Pwd;
	@FindBy(xpath = "//button[text()='login']")
	private WebElement login;
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
	private WebElement search;
	@FindBy(xpath="//span[text()='Akanksha']")
	private WebElement A;
	//initialization
	public POM_fblogin(WebDriver driver)
	{
		super(driver);
	}
	
	//utilization
	public void userName(String username) 
	{
		UName.sendKeys(username);
	}
	public void password(String passWord) 
	{
	Pwd.sendKeys(passWord);
	}
	public void login()
	{
		login.click();
		
	}
	public void search(String Name) {
		search.sendKeys(Name);
	}
	public void nameFriend() {
		A.click();
	}
}
	
	
	
	
	
	
	
	
	

	
