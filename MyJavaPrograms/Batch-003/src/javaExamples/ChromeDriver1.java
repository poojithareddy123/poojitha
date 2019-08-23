package javaExamples;
interface WebDriver1
{
	public void openapp();
	public void closeapp();
	}
class FirefoxDriver1 implements WebDriver1
{
	public void openapp() {
		System.out.println("open firefox");
	}
	public void closeapp()
{
System.out.println("close firefox");		
}
}
public class ChromeDriver1 implements WebDriver1
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
	FirefoxDriver1 ff1=new FirefoxDriver1();
	ff1.openapp();
	ff1.closeapp();
	ChromeDriver1 cd1=new ChromeDriver1();
	cd1.openapp();
	cd1.closeapp();
	}
	}