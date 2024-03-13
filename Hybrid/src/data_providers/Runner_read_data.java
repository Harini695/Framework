package data_providers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner_read_data 
{
@Test(dataProvider = "Login credential",dataProviderClass = Read_data.class)
public void loginTest(String un,String pwd)
{
	System.out.println(un+" "+pwd);
}
}

