package utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtility(String excelPath, String sheetName) {
		
		try {
			/*
			 * IF './' DOES NOT WORK
			 * 
			 * String projectDir = System.getProperty("user.dir");
			 * System.out.println(projectDir);
			 */
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());
		}
	}
	
	public static void getRowCount() {
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("No. of rows: " + rowcount);
	}

	
	public String getAPIURL(int rowNum, int colNum) {
		
		DataFormatter formatter = new DataFormatter();
		
		Object url = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println("API URL: " + url);
		
		return url.toString();
		
	}
}
