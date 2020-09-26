package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	
	
	public ArrayList<String> getData(String sheetName, String testcaseName) throws IOException{
		
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis  = new FileInputStream("src\\test\\java\\resources\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++){
			
			if(wb.getSheetName(i).equalsIgnoreCase(sheetName)){
				
				XSSFSheet sheet = wb.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cell = firstRow.cellIterator();
				int k=0;
				int col=0;
				while(cell.hasNext()){
					
					Cell value = cell.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases")){
						
						col = k;
					}
					
					k++;
				}
				
				while(rows.hasNext()){
					
					Row r = rows.next();
					if(r.getCell(col).getStringCellValue().equalsIgnoreCase(testcaseName)){
						
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext()){
							
							Cell c = cv.next();
							if(c.getCellTypeEnum() == CellType.STRING){
								if(c.getColumnIndex()>0){
									a.add(c.getStringCellValue());
								}
								
								//System.out.println(a);
								//System.out.println("he;llo");
							}
							else {
								if(c.getColumnIndex()>0){
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								}
								//System.out.println(a);
								//System.out.println("he;llo");
							}
						}
					}
				}
			}
		}
		
		return a;
	}
	
	

	public static void main(String[] args) throws IOException {
		
		ExcelDriven d = new ExcelDriven();
		ArrayList data = d.getData("LibraryAPI","AddBook");
		System.out.println(data);
		
	
	}

}
