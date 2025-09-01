package JavaConcepts;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class readExcelData {
    public static void main(String[] args) throws Exception {
       String filePath =  System.getProperty("user.dir")+"\\src\\test\\java\\JavaConcepts\\sample.xlsx";
        File file = new File(filePath);
       FileInputStream fis = new FileInputStream(file);
       /*
       HSSF - Horrible Spread Sheet Format - .xls files
       XSSF - XML Spread Sheet Format = .xlsx files
        */

        HSSFWorkbook book = new HSSFWorkbook();
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow rows = sheet.getRow(0);
        System.out.println(rows.getCell(0));
    }
}
