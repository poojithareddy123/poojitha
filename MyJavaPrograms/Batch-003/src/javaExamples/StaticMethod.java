package javaExamples;
public class StaticMethod {
int b=20;
static int empid=101;
public void m1() {
	int a=10;
	System.out.println("m1 executed");
	System.out.println("local variable"+a);
}
public void m2() {
System.out.println("m2 executed");
System.out.println("instance variable"+b);
System.out.println("static varaible"+empid);
}
public void m3()
{
	System.out.println("m3 executed");
	System.out.println("instance variable"+b);
	System.out.println("static variable+empid");
}
public static void st() {
	System.out.println("static method executed");
}
public static void main(String args[]) {
	System.out.println("main method executed");
	StaticMethod m=new StaticMethod();
	m.m1();
	m.m3();
	m.m2();
	StaticMethod.st();
}
}
