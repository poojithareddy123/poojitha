package javaExamples;

 abstract class Bank {
abstract void credit();
abstract void debit();

}
class HDFC extends Bank{
	void credit() {
		System.out.println("amount credited from HDFC");
	}
void debit() {
	System.out.println("amount debited from HDFC");
}
}
class ICICI extends Bank{
	void credit() {
		System.out.println("amount credited from ICICI");
	}
void debit()
{
	System.out.println("amount debited from ICICI");
}
}
public class TestBank
{
	public static void main(String args[])
	{
		HDFC h=new HDFC();
		h.credit();
		h.debit();
				
ICICI c=new ICICI();
c.credit();
c.debit();
}
}