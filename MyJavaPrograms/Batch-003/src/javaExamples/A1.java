package javaExamples;

 class C1 {
int a=10;
int b=20;
public void selIDE() {
	System.out.println("IDE");
}
}
class B1 extends C1 {
	int x=30;
	int y=40;
	public void selWD() {
		System.out.println("WD");
		System.out.println("a+b");
	}
}
class A1 extends B1 {
	public void selRC()
	{
		System.out.println("RC");
		System.out.println(x+y);
		System.out.println(a+b);
	}


public static void main(String args[])
{
A1 obj=new A1();
obj.selIDE();
obj.selRC();
obj.selWD();
}	
}
