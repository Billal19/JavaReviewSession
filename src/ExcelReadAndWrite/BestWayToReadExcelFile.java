package ExcelReadAndWrite;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class BestWayToReadExcelFile {


    public static void main(String[] args) throws IOException {

        FileInputStream myFile = new FileInputStream("/Users/billalyahiaoui/Desktop/DataDrivenTest.xlsx");
        XSSFWorkbook myBook = new XSSFWorkbook(myFile);
        XSSFSheet mySheet = myBook.getSheet("Sheet1");
        int rowCount = mySheet.getLastRowNum();
        int cellCount=mySheet.getRow(0).getLastCellNum();

        for (int i =0;i<rowCount;i++){
           XSSFRow firstRow = mySheet.getRow(i);
           for (int j=0;j<cellCount;j++){
               String data = firstRow.getCell(j).toString();

               System.out.print("   "+data);
           }
            System.out.println();
        }





    }
}
