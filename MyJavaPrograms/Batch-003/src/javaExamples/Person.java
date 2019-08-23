package javaExamples;

public class Person {
private String name="poojitha";
private int age=26;
public void talk()
{
	System.out.println("hello,i am"+name);
System.out.println("my age is"+age);
}
public static void main(String args[])
{
	Person p=new Person();
	p.talk();
}
}
