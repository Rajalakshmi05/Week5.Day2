package Week5.Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	//Set path of the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
	//Get into the Sheet
		XSSFSheet ws=wb.getSheet("Sheet1");
		//wb.getSheetAt(0);
	//Get into the respective row
		XSSFRow row= ws.getRow(1);
	//Get into the respective Cell
		XSSFCell cell=row.getCell(0);
	//Read the data From the cell
		String data=cell.getStringCellValue();
		System.out.println(data);
	//close the Workbook
		wb.close();

	}

}
