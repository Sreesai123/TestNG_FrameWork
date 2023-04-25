package april5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteCelldata {
	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("E:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for (int i = 1; i <=rc; i++) 
		{
			ws.getRow(i).createCell(4).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("E:/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}
}