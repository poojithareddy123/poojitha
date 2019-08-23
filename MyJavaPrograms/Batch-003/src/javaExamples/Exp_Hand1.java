package javaExamples;

public class Exp_Hand1 {
public static void main(String args[])
{
	int a[]= {10,20,30,40,50};
	try
	{
	System.out.println(a[2]);	
	}
catch(Exception e)
	{
		System.out.println(e);
	}
finally
{
System.out.println("final statement executed");
System.out.println(a[1]);
}
}
}
