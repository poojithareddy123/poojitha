package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_101Verify 
{
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
driver.findElement(By.linkText("Logout"));
driver.close();
}
}
