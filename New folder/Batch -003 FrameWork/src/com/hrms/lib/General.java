package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.log;
public class General extends Global {
public void openApplication()
{
	log.info("*****started execution*******");
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to(url);
log.info("Application opened");
System.out.println(driver.getTitle());
}
public void closeApplication()
{
	driver.quit();
	log.info("Application close successfully");
	log.info("*****End execution****");
}
public void login() throws Exception{
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.xpath(txt_password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
Thread.sleep(4000);
System.out.println("Login completed");
}
public void logout()
{
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
}
public void addEmp()
{
	System.out.println("Adding new emp");
}
public void delEmp()
{
	System.out.println("Delete an emp");
}
}
