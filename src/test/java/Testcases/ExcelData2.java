package Testcases;

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
import org.openqa.selenium.WebDriver;

public class ExcelData2 {

	public WebDriver driver;

public ExcelData2(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
}

public ArrayList<String> DataDriven2(String paneltwo) throws IOException
{
	ArrayList<String> arrays= new ArrayList<String>();
FileInputStream file= new FileInputStream("C://Users//Amita Prajapati//eclipse-workspace//Matrimony//Panel2.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(file);
int Sheetscount= workbook.getNumberOfSheets();

XSSFSheet sheet =workbook.getSheet("TestData2");
String name=workbook.getSheetName(0);
System.out.println(name);
Iterator<Row> rows =sheet.iterator();
Row firstrow = rows.next();
Iterator<Cell> cells= firstrow.iterator();
int column=0;
int k=0;
while(cells.hasNext())
{
	Cell cell= cells.next();
	if(cell.getStringCellValue().equalsIgnoreCase("firstname"));
	{
		column=k;
	}
k++;

}
	System.out.println(column); 
	 
 
while(rows.hasNext())
{
	Row secondrow=rows.next();
	if(secondrow.getCell(column).getStringCellValue().equalsIgnoreCase(paneltwo));
	{
		Iterator<Cell> ce =secondrow.cellIterator();
		while(ce.hasNext())
		{
			Cell cellvalue =ce.next();
			if(cellvalue.getCellType()==CellType.STRING)
			{
				arrays.add(cellvalue.getStringCellValue());
   			}
   			 else {
   				 arrays.add(NumberToTextConverter.toText(cellvalue.getNumericCellValue()));
	      
   			 
   			 }	
		
	}
		
	
}}return arrays;
}

}
