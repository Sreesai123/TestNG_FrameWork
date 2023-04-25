package april5;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Alternate_Method {
	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("E:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		String fname = ws.getRow(5).getCell(0).getStringCellValue();
		String mname = ws.getRow(9).getCell(1).getStringCellValue();
		String lname = ws.getRow(16).getCell(2).getStringCellValue();
		int eid = (int) ws.getRow(10).getCell(3).getNumericCellValue();
		System.out.println(fname+"  "+mname+"   "+lname+"   "+eid);
		fi.close();
		wb.close();
	}

}
