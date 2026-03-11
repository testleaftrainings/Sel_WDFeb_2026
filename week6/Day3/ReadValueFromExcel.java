package week6.day3;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	// Common integration
	//Step 4: Changr main to normal method
	
	//CI
	// STEP 1: Add the argumets in the method
	public static String[][] getValue(String fileName) throws IOException {

		// Common integration
		// Step 3: to change the return type of the method as String[][]

		// Step 1 : Setting up the excel file & path
		
		//CI
		// STEP 2: concordinate the fileName to the path.
		XSSFWorkbook wb = new XSSFWorkbook("./ReadExcel/"+fileName+".xlsx");

		// Step 2: Get the sheet from the wb(Sheet)
		XSSFSheet sheet = wb.getSheetAt(0);

		// Step 3: Get the row value
		XSSFRow row = sheet.getRow(0);

		// getLastRowNum(); - Excludes the header
		int rowCount = sheet.getLastRowNum();
		System.out.println("Excluding the header " + rowCount);

		// getPhysicalNumberOfRows(); - Includes the header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Includes the header " + physicalNumberOfRows);

		// count of the cell value / column
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println("LastCellNum " + lastCellNum);

		// Common integration
		// Step 1: to store the rows & columns
		String[][] data = new String[rowCount][lastCellNum];

		// count the cell value along with Header
		int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfCells " + physicalNumberOfCells);

		// Step 4: get into the column using row
		XSSFCell cell = row.getCell(1);

		// How to read entier cell value
		String stringCellValue = cell.getStringCellValue();
		System.out.println("stringCellValue " + stringCellValue);

		// OuterLoop is for rows for
		for (int i = 1; i <= rowCount; i++) {
			// InnerLoop is for cell/Column for
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i-1][j]=stringCellValue2);
				
				//Common Interation
				// Step5: to store the values from the itrated i & j
				data[i-1][j]= stringCellValue2;
			}
		}wb.close();//Common integration 
		// Step 2: to return the data/String[][] stored column & row values
		return data;

	}

}