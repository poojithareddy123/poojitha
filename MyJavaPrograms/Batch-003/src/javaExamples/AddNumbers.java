package javaExamples;
import java.util.Scanner;
public class AddNumbers {
public static void main(String args[]) {
	int x,y,z;
	System.out.println("Enter two integers to calculate their sum");
	Scanner s= new Scanner(System.in);
	x=s.nextInt();
	y=s.nextInt();
	z=x+y;
	System.out.println("sum of entered integers="+z);
}	
}

