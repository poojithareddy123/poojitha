package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_102_Verify 
	{
static String usernme="poojitha";
static String password="poojitha123";
public static void main(String args[]) throws Exception
{
System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
if(driver.getTitle().equals("OrangeHRM-New Level of HR Management"))
{
System.out.println("title matched");
}

else	
{
	System.out.println("Title not matched and expected title is"+driver.getTitle());
}
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("login completed");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
}
}
