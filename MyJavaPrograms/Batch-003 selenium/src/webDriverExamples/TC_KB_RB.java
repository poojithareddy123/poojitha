package webDriverExamples;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_KB_RB
{
public static void main(String args[]) throws Exception
{
System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
System.out.println("TAB");
r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(3000);
System.out.println("ENTER");
System.out.println("Login Completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
}
}
