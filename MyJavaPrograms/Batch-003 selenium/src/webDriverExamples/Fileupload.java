package webDriverExamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;
public class Fileupload 
{
public static void main(String args[])throws Exception
{
	//System.setProperty("webdriver.chrome.driver","‪E:\\drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
fileInput.sendKeys("‪C:\\Users\\poojitha\\Downloads\\images.jfif");
driver.findElement(By.xpath("//input[@value='Save']")).click();
Thread.sleep(4000);
System.out.println("File upload succesfully");
driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
Thread.sleep(6000);
System.out.println("New Employee Added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.quit();
}
}