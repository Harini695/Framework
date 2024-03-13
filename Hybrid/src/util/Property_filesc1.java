package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_filesc1 
{
public static String fetchProperty() throws FileNotFoundException, IOException {
Properties p = new Properties();
p.load(new FileInputStream("./Prop.properties"));
String file=p.getProperty("baseURL");
return file;
}
}