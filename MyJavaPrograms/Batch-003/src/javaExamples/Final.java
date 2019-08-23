package javaExamples;

public class Final {
public static void main(String args[])
{
	int a[]= {10,20,30,40};
	try
	{
		System.out.println("access element three:"+a[2]);
		System.out.println("testing");
	}
catch(Exception e)
	{
	System.out.println("exception thrown123:"+e);
	}
finally {
	System.out.println("first element value:"+a[1]);
System.out.println("the finally statement is executed");
}
}
}
