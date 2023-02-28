package com.FileOperations.ExcelFileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       System.out.println("Project started!...");
      // String filename="C:\\Users\\Goku\\Downloads\\TCS.NSE.csv";
       //read an excel file and store it in a vector
   
       
       FileInputStream fis;
	try {
		fis = new FileInputStream(new File("C:\\Users\\Goku\\Downloads\\book1.xls"));

			HSSFWorkbook wb;

			wb = new HSSFWorkbook(fis);

	
			HSSFSheet sheet=wb.getSheetAt(0);
       
       for(Row row:sheet)
       {
    	   for(Cell cell:row)
    	   {
    		   System.out.println(cell.getStringCellValue());
    	   }
       }
       
	}
	catch(Exception e)
	{
		System.out.println("Error caught while reading excel file: "+e.getMessage());
	}
       
       
       
       
    }
}
