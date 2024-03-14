package runner;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Ddt_fetchdata;
import pom.POM_fblogin;

public class Dataprovider_runner extends Baseclass
{

@Test
public void Fb_login() throws InterruptedException, EncryptedDocumentException, IOException
{
	POM_fblogin f1 = new POM_fblogin(driver);
	f1.userName(Ddt_fetchdata.getData("sheet2",0,0));
	Thread.sleep(5000);
	f1.password(Ddt_fetchdata.getData("sheet2",0,1));
	Thread.sleep(5000);
	f1.login();
	System.out.println("Hi Harini this is vidhi");

}

@DataProvider(name="Login credential")
public Object[][] getData()
{
	Object[][]data= {{"santhosh@gmail.com","123"},{"pradeep@gmail.com","456"},{"rahul@gmail.com","789"}};
	return data;
}
}
