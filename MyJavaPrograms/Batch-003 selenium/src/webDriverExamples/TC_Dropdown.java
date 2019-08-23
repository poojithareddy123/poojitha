package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("‪file:///D:/HtmlFiles/dropdownNavigate.html");
//driver.get("file:///D:/HtmlFiles/dropdownNavigate.html");
driver.navigate().to("file:///D:/HtmlFiles/dropdownNavigate.html");
Thread.sleep(3000);
Select st=new Select(driver.findElement(By.name("OptWeb")));
st.selectByVisibleText("Google");
Thread.sleep(3000);
driver.findElement(By.name("btnGo")).click();
Thread.sleep(3000);
System.out.println(driver.getTitle());
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().to("‪D:\\HtmlFiles\\multiselectdropdown.html");
Thread.sleep(3000);
Select st1=new Select(driver.findElement(By.id("tools")));
st1.selectByVisibleText("Selenium IDE");
Thread.sleep(3000);
System.out.println("selected value is IDE");
st1.selectByIndex(1);
Thread.sleep(3000);
System.out.println("selected value is RC");
st1.selectByIndex(3);
Thread.sleep(3000);
System.out.println("selected value is Grid");
Thread.sleep(3000);
driver.close();
}
}
