package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;

public class excelDatadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\seleniumFramework_excel.xlsx");
    XSSFWorkbook workbook=new XSSFWorkbook(fis);
    int sheets=workbook.getNumberOfSheets();
    XSSFSheet sheetdata =workbook.getSheet("TestData");
    Iterator<Row> row=sheetdata.iterator();
    String KeyInput=null;
    String Value=null;
    HashMap<String,String> map=new HashMap<String,String>();
    int k=0;
    ArrayList<String> keys=new ArrayList<String>();
    ArrayList<String> values=new ArrayList<String>();
    Row rows= row.next();
    //Row rowss= row.next();
    
    Iterator<Cell> cell=rows.cellIterator();
    cell.next();
    while(cell.hasNext()) {
    	keys.add(cell.next().getStringCellValue());	
    }
    	
    while(row.hasNext()) 
    {
    	 Row rowss=row.next();
    	
    	if(rowss.getCell(k).getStringCellValue().equalsIgnoreCase("home"))
    	{
    		Iterator<Cell> cells=rowss.cellIterator();
    		cells.next();
    		while(cells.hasNext()) 
    		{
    		values.add(cells.next().getStringCellValue());
    		
    	    }
    	}
    
	}
   for(int i=0;i<keys.size();i++)
   {
	  map.put(keys.get(i),values.get(i));
    }
   System.out.println(map); 
}
}