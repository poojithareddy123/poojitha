package javaExamples;
import java.util.Scanner;
public class SubNumbers {
public static void main(String args[])
{
	System.out.println("Enter two integers to calculate their sum");
	Scanner s= new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	int z = x-y;
	System.out.println("sum of entered integers="+z);
}	
}


