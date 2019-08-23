package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_102_Verify2 {
static String username="admin";
static String password="admin";
public static void main(String args[]) throws Exception
{
System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
if(driver.getTitle().equals("OrangeHRM- New Level of HR Management"))
{
System.out.println("Title Matched");
}
else
{
System.out.println("Title not matched and expected title is"+driver.getTitle());
}
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(4000);
Actions ac=new Actions(driver);
WebElement pimmenu=driver.findElement(By.linkText("PIM"));
ac.moveToElement(pimmenu).perform();
System.out.println("Mouse over completed");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
}
}
