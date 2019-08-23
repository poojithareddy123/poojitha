package testNGExamples;

import org.testng.annotations.Test;

public class TC_TestNG {
  @Test
  public void login() {
System.out.println("logon completed");
 }
@Test(dependsOnMethods="login")
public void logout()
{
System.out.println("log out completed");	
}
}
