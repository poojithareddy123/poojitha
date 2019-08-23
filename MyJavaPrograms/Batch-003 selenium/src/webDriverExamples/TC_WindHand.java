package webDriverExamples;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_WindHand {
public static void main(String args[]) throws Exception
{
System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.navigate().to("‪‪file:///D:/HtmlFiles/multiplewindows.html");
driver.navigate().to("file:///D:/HtmlFiles/multiplewindows.html");
Thread.sleep(3000);
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
Thread.sleep(3000);
driver.switchTo().window(wind.get(0));
Thread.sleep(3000);
driver.quit();
}
}
