package property_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
public class Fetch_prop 
{
	@Test
	public void fetch_op() throws FileNotFoundException, IOException 
	{
Properties p=new Properties();
p.load(new FileInputStream("./dummy.properties"));
String val=p.getProperty("baseURL");
System.out.println(val);

}



}
