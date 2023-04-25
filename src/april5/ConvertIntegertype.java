package april5;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ConvertIntegertype {
	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("E:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		for (int i = 1; i <=rc; i++) 
		{
			if (wb.getSheet("emp").getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC) 
			{
				int celldata = (int)wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
				String eid = String.valueOf(celldata);
			}	
		}
	}

}
