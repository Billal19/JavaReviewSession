package ExcelReadAndWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ReadExcelFile {

    private static final String FILE_NAME = System.getProperty("user.dir")+ "/DataTest/Sample.xlsx";

    public static void main(String[] args) {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeSheet = workbook.getSheetAt(1);
            Iterator<Row> iterator = dataTypeSheet.iterator();
            while (iterator.hasNext()){
                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator =currentRow.iterator();
                while (cellIterator.hasNext()){
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellTypeEnum() == CellType.STRING){
                        System.out.println(currentCell.getStringCellValue() + "--");
                    }else if (currentCell.getCellTypeEnum() == CellType.NUMERIC){
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    }
                }
                System.out.println();
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}
