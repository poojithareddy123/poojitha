package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;
public class TC_Frames {
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@value='Login']")).click();
Thread.sleep(4000);
System.out.println("Login completed");
assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
System.out.println("Text matched");
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(4000);
String empid=driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).getAttribute("value");
System.out.println(empid);
driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("selenium");
driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("suresh");
driver.findElement(By.xpath("//input[@value='Save']")).click();
Thread.sleep(4000);
System.out.println("new emp added");
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
System.out.println("logout completed");
driver.close();

}
}

