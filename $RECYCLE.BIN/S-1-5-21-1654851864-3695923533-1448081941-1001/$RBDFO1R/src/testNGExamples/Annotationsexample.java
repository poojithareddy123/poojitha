package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Annotationsexample {
  @BeforeClass
  public void login() {
  System.out.println("login completed");
  }
@AfterClass
public void logout()
{
	System.out.println("logout completed");
}
@Test(priority=2)
public void addemp()
{
	System.out.println("adding new emp");
}
@Test(priority=1)
public void delemp()
{
	System.out.println("delete emp");
}
}

