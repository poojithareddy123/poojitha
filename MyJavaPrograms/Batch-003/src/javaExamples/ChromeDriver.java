package javaExamples;

interface WebDriver{
public void openapp();
public void closeapp();
}
class FirefoxDriver
{
	public void openapp() {
		System.out.println("open firefox");
	}
	public void closeapp()
{
System.out.println("close firefox");		
}
}
public class ChromeDriver 
{
	public void openapp()
	{
		System.out.println("open chrome");
	}
public void closeapp()
{
	System.out.println("close chrome");
}
public static void main(String args[])
{
FirefoxDriver ff=new FirefoxDriver();
ff.openapp();
ff.closeapp();
ChromeDriver cd=new ChromeDriver();
cd.openapp();
cd.closeapp();
}
}
