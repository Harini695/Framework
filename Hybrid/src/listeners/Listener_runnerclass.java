package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_runnerclass {
@Test
public void compose()
{
	System.out.println("message composed");
}
@Test
public void SentItems()
{
	System.out.println("message sent");
	Assert.fail();
}
@Test(dependsOnMethods = "SentItems")
public void trash()
{
	System.out.println("message deleted");
}
}
