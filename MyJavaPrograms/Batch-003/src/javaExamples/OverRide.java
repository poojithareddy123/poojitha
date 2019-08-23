package javaExamples;

 class OverRide1{
	public void add (int a,int b) {
		System.out.println(a+b);
	}
 }
public class OverRide extends OverRide1{
	public void add(int a,int b) {
		System.out.println(a-b);
	}
public static void main(String args[])
{
OverRide1 obj1=new OverRide1();
obj1.add(10, 20);
OverRide obj=new OverRide();
obj.add(20,30);
}
}
