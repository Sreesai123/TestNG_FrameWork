package qedge_Apr4;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RowandCell {
	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("E:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		XSSFRow row = ws.getRow(0);
		int cc = row.getLastCellNum();
		System.out.println("No of rows are::"+rc+"   "+"No of cells in Firstrow"+cc);
		fi.close();
		wb.close();
	}

}
