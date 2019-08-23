package javaExamples;
import java.util.ArrayList;

public class ArrayList1
{
public static void main(String args[])
{
 ArrayList<String>subjects=new ArrayList<String>();
 {
subjects.add("Math");
subjects.add("tel");
subjects.add("eng");
subjects.add("sci");
System.out.println(subjects);
subjects.add(2,"hin");
System.out.println(subjects);
}
}
}