package runner;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Ddt_fetchdata;
import pom.POM_fblogin;

public class Runner_fb extends Baseclass
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
//	Assert.fail();

}

}
