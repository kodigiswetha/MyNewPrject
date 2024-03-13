package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReadTheDataExtenalFile {
/**
 * 
 * @param path
 * @param key
 * @return
 * @throws IOException
 */
public String readingTheDataFromPropFile(String path,String key) throws IOException {
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value;
}
/**
 * 
 * @param path
 * @param sheetName
 * @param rowNum
 * @param colnum
 * @return
 * @throws IOException
 */
	public String readingDataExcelSingleValue(String path, String sheetName,int rowNum,int colnum) throws IOException
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(colnum).toString();		
		return data;
	}
	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param colNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String []readingRowDataFromExcel(String path,String sheetName,int colNum) throws EncryptedDocumentException, IOException
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		 int rowNum = sheet.getPhysicalNumberOfRows();
		
		 
			 String[] data= new String[rowNum];
					 for(int i=0;i<rowNum;i++) {
						  String dataFromCel = sheet.getRow(i).getCell(colNum).toString();
						  data[i]=dataFromCel;
					 }
					return data;
	}
	public static String[][] readingDataFromMutliplrRowColumn(String path,String sheetName) throws EncryptedDocumentException, IOException
	
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		 Workbook workbook = WorkbookFactory.create(fis);
		  Sheet sheet = workbook.getSheet(sheetName);
		int rownum = sheet.getPhysicalNumberOfRows();
		 int clmnum = sheet.getRow(0).getPhysicalNumberOfCells();
		 String[][] data=new String[rownum][clmnum];
		 for(int i=0;i<rownum;i++)
		 {
			 for(int j=0;j<clmnum;j++)
			 {
				  String datafromexcel = sheet.getRow(i).getCell(j).toString();
				  data[i][j]=datafromexcel;
			 }
			
		 }
		return data;
		
		
		
	
	
	}
	
}
