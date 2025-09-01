package haraprasad;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class readExcel {
    public void read(String filename,String sheetname) throws Exception{
        String filepath=System.getProperty("user.dir")+"\\src\\main\\java\\haraprasad\\"+filename+".xlsx";
        File file=new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet(sheetname);
        Map<String,String> m = new HashMap<>();

        for(int i=0;i<=sheet.getLastRowNum();i++){
            XSSFRow rows=sheet.getRow(i);
            for(int j=0;j<rows.getLastCellNum();j++){
                m.put(rows.getCell(j).toString(),rows.getCell(j+1).toString());
                break;
            }
        }
        for(Map.Entry<String,String> mm: m.entrySet()){
            System.out.println(mm.getKey() +"->"+mm.getValue());
        }
    }

    public static void main(String[] args) throws Exception{
        readExcel re=new readExcel();
        re.read("Data","sheet1");
    }

}
