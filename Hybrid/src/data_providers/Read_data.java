package data_providers;

import org.testng.annotations.DataProvider;

public class Read_data 
{
@DataProvider(name="Login credential")
public Object[][] getData()
{
	Object[][]data= {{"santhosh@gmail.com","123"},{"pradeep@gmail.com","456"},{"rahul@gmail.com","789"}};
	return data;
}
}