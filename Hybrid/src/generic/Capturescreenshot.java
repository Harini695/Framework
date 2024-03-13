package generic;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreenshot 
{
public static void get_photo(WebDriver driver) throws IOException {
	Date d = new Date(0);
	String d1 = d.toString();
	String da = d1.replace(":", "_");
	TakesScreenshot tss = (TakesScreenshot)driver;
	File tmp = tss.getScreenshotAs(OutputType.FILE);
	File pmt = new File("./photos/"+da+".jpg");
FileHandler.copy(tmp,pmt);
}
}
