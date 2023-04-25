package april5;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class AllRows {
	public static void main(String[] args) throws Throwable  {
		FileInputStream fi = new FileInputStream("E:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for (int i = 1; i <=rc; i++) 
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			int eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"  "+mname+"   "+lname+"   "+eid);
		}
		fi.close();
		wb.close();
	}

}
