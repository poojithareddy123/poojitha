package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_WebTable {
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.navigate().to("file://‪D://HtmlFiles//WebTable.html");	
//count
int row=driver.findElements(By.xpath("//table[@id='idcourse']/tbody/tr")).size();
int col=driver.findElements(By.xpath("//table[@id='idcourse']/tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//table[@id='idcourse']/tbody/tr/td)")).size();
System.out.println(row);
System.out.println(col);
System.out.println(row_col);
//data cell
String cell= driver.findElement(By.xpath("//table[@id='course']/tbody/tr[2]/td[2]")).getText();
System.out.println(cell);
//data table
for(int i =1;i<row;i++)
{
String data =driver.findElements(By.xpath("//table[@id='idcourse']/tbody/tr["+i+"]")).getText();
Thread.sleep(3000);
System.out.println(data);
}
driver.close();
}
}