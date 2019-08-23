package javaExamples;

interface WebDriver2 {
	public void openapp();
	public void closeapp();
	}
 class FirefoxDriver2 implements WebDriver2
		{
			public void openapp() {
				System.out.println("open firefox");
			}
			public void closeapp()
		{
		System.out.println("close firefox");		
		}
		}
public class ChromeDriver2 implements WebDriver2
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
	
WebDriver2 driver =new FirefoxDriver2();

driver.openapp();
driver.closeapp();

WebDriver2 driver1 =new ChromeDriver2();

driver1.openapp();
driver1.closeapp();

}
	}
