package webDriverExamples;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TC_Excel {
public static void main(String args[]) throws Exception
{
	FileInputStream file=new FileInputStream("C:\\Users\\poojitha\\Documents\\Book1.xlsx");
	Workbook wb=Workbook.getWorkbook(file);
	Sheet st=wb.getSheet("Sheet2");
	int i=3;
	String empid= st.getCell(0,i)).getContents();
	String name=st.getCell(1,i).getcontens();
	String email=st.getCell(2,i).getcontents();
	String no=st.getCell(3, i).getcontents();
	System.out.println(empid);
			System.out.println(name);
System.out.println(email);
System.out.println(no);
}
}
