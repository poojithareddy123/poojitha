package javaExamples;
public class SeleniumComponents {
public void seleniumIde()
{
	System.out.println("perform record and playback");
}
public void seleniumWebDriver() {
System.out.println ("to develop automation scripts");
}
public void seleniumGrid() {
System.out.println("to execute scripts in multiple browsers and systems");
}
public static void main(String args[])
{
System.out.println("Description of components");	


	SeleniumComponents k=new SeleniumComponents();
	k.seleniumGrid();
	k.seleniumIde();
	k.seleniumWebDriver();

}
}
