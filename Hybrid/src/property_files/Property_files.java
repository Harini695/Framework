package property_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_files 
{
@Test
public void fetch_data() throws FileNotFoundException, IOException
{
Properties p=new Properties();
p.load(new FileInputStream("./Property_files.properties") );
String val=p.getProperty("baseURL");
System.out.println(val);

}
}
