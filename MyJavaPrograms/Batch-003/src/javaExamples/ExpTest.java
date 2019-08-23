package javaExamples;

public class ExpTest {
public static void main(String args[])
{
	try
	{
		int b=10/0;
		System.out.println(b);
	}
catch(Exception e)
{
System.out.println("Exception thrown:"+e);	
}
System.out.println("out of the block");
}
}
