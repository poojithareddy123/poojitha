package javaExamples;

class B {
public void test() {
	System.out.println("Hai");
	System.out.println("hello");
}
}
public class A extends B
{
	public void must() {
		System.out.println("bye");
	}
	public static void main(String args[])
	{
		A s=new A();
		s.must();
	    s.test();
	}
	

}